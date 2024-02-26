package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class demoqaOdev {

    public static void main (String[] args){

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            driver.get("https://demoqa.com/elements");
            WebElement clickButtons = driver.findElement(new By.ByCssSelector("div[class=\"element-list collapse show\"]>ul>li[id=\"item-4\"]"));
            clickButtons.click();

            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Click Me']")));

            WebElement clickClickMe = driver.findElement(new By.ByXPath("//button[text()='Click Me']"));
            clickClickMe.click();

            WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='You have done a dynamic click']")));

            System.out.println(message);

            driver.get("https://demoqa.com/webtables");
            WebElement addButons = driver.findElement(new By.ByCssSelector("button[id=\"addNewRecordButton\"]"));
            addButons.click();
            WebElement firstName = driver.findElement(new By.ByCssSelector("input[id=\"firstName\"]"));
            firstName.sendKeys("Cemre");
            WebElement lastName = driver.findElement(new By.ByCssSelector("input[id=\"lastName\"]"));
            lastName.sendKeys("Avcı");
            WebElement email= driver.findElement(new By.ByCssSelector("input[id=\"userEmail\"]"));
            email.sendKeys("cemreavci@gmail.com");
            WebElement age = driver.findElement(new By.ByCssSelector("input[id=\"age\"]"));
            age.sendKeys("28");
            WebElement salary = driver.findElement(new By.ByCssSelector("input[id=\"salary\"]"));
            salary.sendKeys("15");
            WebElement department = driver.findElement(new By.ByCssSelector("input[id=\"department\"]"));
            department.sendKeys("IT");
            WebElement submitButton = driver.findElement(new By.ByCssSelector("button[id=\"submit\"]"));
            submitButton.click();

            WebElement person = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=\"Cemre\"]")));

            WebElement edit = driver.findElement(new By.ByCssSelector("span[id=\"edit-record-4\"]"));
            edit.click();

            WebElement form =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=\"Registration Form\"]")));
            age.sendKeys("25");
            submitButton.click();
            WebElement form2 =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=\"Registration Form\"]")));
            age.sendKeys("25");
            submitButton.click();

    }
}
