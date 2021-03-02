import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MyFirstBrowserAutomation {
    WebDriver driver = null;

    @BeforeTest
    public void setUp(){
        // Set driver path to the system
        System.setProperty("webdriver.chrome.driver", "/Users/jahidul/IdeaProjects/WebAutomationB2003/driver/chromedriver");
        // Create driver object
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // Interact with Chrome driver
        // Getting Home page of the website
        // Open Chrome Browser
        driver.get("http://automationpractice.com/");
    }

    @Test(invocationCount = 0)
    public void doSomethingTest() throws Exception{
        driver.findElement(By.id("search_query_top")).sendKeys("Hello", Keys.ENTER);
        // Thread.sleep(3000);
        // Clicking Search button
        //driver.findElement(By.name("submit_search")).click();
        // Get Tag value from the specific location/tag
        String actualValue = driver.findElement(By.className("heading-counter")).getText();
        System.out.println(actualValue);
        Assert.assertEquals(actualValue, "0 results have been found.");
    }

    @Test
    public void womenDressDetailsTest() throws Exception{
        driver.findElement(By.linkText("Women")).click();
//        Actions action = new Actions(driver);
//        WebElement we = driver.findElement(By.linkText("Women"));
//        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("/ul/li[1]/ul/li[1]/ul/li[1]/a"))).click().build().perform();
//        Thread.sleep(3000);
       // driver.findElement(By.linkText("T-shirts")).click();
    }

    @AfterTest
    public void cleanUP(){
        // Closing browser
        driver.quit();
    }
}
