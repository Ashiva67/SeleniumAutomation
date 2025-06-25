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
        String[] itemsofCart={"iPhone", "Samsung", "Nokia", "Blackberry"};
        addToCart(driver, itemsofCart, w);

    }

    public static void addToCart(WebDriver driver, String[] itemsofCart, WebDriverWait w) {

        int j = 0;

        List<WebElement> productName = driver.findElements(By.xpath("//app-card[@class='col-lg-3 col-md-6 mb-3']"));
        for (int i = 0; i < productName.size(); i++) {
            String[] name = productName.get(i).getText().split(" ");
            String firstname = name[0].trim();
//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//app-card[@class='col-lg-3 col-md-6 mb-3']")));

            List products = Arrays.asList(itemsofCart);
            if (products.contains(firstname)) {
                j++;
                driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
                if (j == itemsofCart.length) {
                    break;
                }
            }

        }


    }
}
