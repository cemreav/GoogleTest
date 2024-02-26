package test;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import untitlies.PropertyManager;

import java.net.MalformedURLException;

public class GoogleTests {
    public static WebDriver driver;
    Driver webDriver = new Driver();
    PropertyManager propertyManager = new PropertyManager();

    @BeforeSuite
    public void GoogleTest() throws MalformedURLException{
        driver = webDriver.initializeDriver();
    }
    @Test
    public void openGooglePageTest(){
        driver.get(propertyManager.getProperty("APP_URL"));
        String pageTitle=driver.getTitle();
        Assert.assertEquals(pageTitle,"Google");
    }
    @AfterSuite
    public void tearDown(){
        webDriver.quitDriver();
    }

}
