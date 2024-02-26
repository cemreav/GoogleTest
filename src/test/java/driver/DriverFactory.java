package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import untitlies.PropertyManager;

import java.net.MalformedURLException;

public class DriverFactory {
    static PropertyManager propertyManager= new PropertyManager();
    static WebDriver getDriver() throws MalformedURLException {
        String browser = propertyManager.getProperty("BROWSER");
        if (browser==null){
            WebDriverManager.chromedriver().arch64().setup();
            return new ChromeDriver();
        }
        switch (browser){
            case "EDGE":
                WebDriverManager.edgedriver().arch64().setup();
                return new EdgeDriver();
            default:
                WebDriverManager.chromedriver().arch64().setup();
                return new ChromeDriver();
        }
    }
}
