package Selenium.Assessments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Assessment1 {


    public static void main(String[] args) {
        WebDriver driver;
        driver=new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String Url="https://rahulshettyacademy.com/AutomationPractice/";
        driver.get(Url);

        //clicking on the chebox and verifying it is selected
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
        System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());

        //unchecking the checkbox and verifying it is unchecked
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
        System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());

        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

driver.close();

    }
}
