import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyFirstBrowserAutomation {

    public void doSomething() {
        // Set driver path to the system
        System.setProperty("webdriver.chrome.driver", "/Users/jahidul/IdeaProjects/WebAutomationB2003/driver/chromedriver");
        // Create driver object
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // Interact with Chrome driver
        // Getting Home page of the website
        // Open Chrome Browser
        driver.get("http://automationpractice.com/");
        // Closing broswer
        driver.quit();
    }
}
