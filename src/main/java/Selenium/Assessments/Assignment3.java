package Selenium.Assessments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Assignment3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");

        driver.findElement(By.id("password")).sendKeys("learning");

        driver.findElement(By.xpath("//span[text()=' User']")).click();
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
//
//        driver.switchTo().alert().accept();
        WebElement okayBtn = driver.findElement(By.id("okayBtn"));
        if (okayBtn.isDisplayed()) {
            okayBtn.click();
        }

        WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));

        Select option = new Select(options);
        option.selectByVisibleText("Consultant");

        driver.findElement(By.xpath("//input[@id='terms']")).click();

        driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));


        List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

        for(int i =0;i<products.size();i++)

        {

            products.get(i).click();

        }

        driver.findElement(By.partialLinkText("Checkout")).click();

driver.close();


    }
}
