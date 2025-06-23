package Selenium.Assessments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;

public class Assignment2 {
    public static void main(String[] args) {
        WebDriver driver;
        driver=new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        //giving the name
        driver.findElement(By.name("name")).sendKeys("Shiva");

        //giving the email
        driver.findElement(By.name("email")).sendKeys("shiva@gmail.com");

        //giving the password
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345667");

        //clicking on the checkbox
        driver.findElement(By.id("exampleCheck1")).click();
        Assert.assertTrue(driver.findElement(By.id("exampleCheck1")).isSelected());

        //clicing on the dropdown
        WebElement options=driver.findElement(By.cssSelector("#exampleFormControlSelect1"));
        Select select=new Select(options);
        select.selectByVisibleText("Male");

        driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='inlineRadio1']")).isSelected());

        //giving bday

        driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("14/03/1999");

        //clicking on submit button
        driver.findElement(By.cssSelector("input[class='btn btn-success']")).click();

        System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());

        driver.close();
    }
}
