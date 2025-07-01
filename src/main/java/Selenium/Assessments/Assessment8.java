package Selenium.Assessments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class Assessment8 {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement enterInput=driver.findElement(By.cssSelector("input#autocomplete"));
        enterInput.sendKeys("ind");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement secondOption=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='ui-id-1']/li[2]")));
        Assert.assertTrue(secondOption.isDisplayed(), "Second option is not visible");
        // Click and print it
        secondOption.click();
        System.out.println("Selected: " + enterInput.getAttribute("value"));
        driver.close();


        //tutor code
        /*driver.findElement(By.id("autocomplete")).sendKeys("ind");

    Thread.sleep(2000);

    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); */
    }
}
