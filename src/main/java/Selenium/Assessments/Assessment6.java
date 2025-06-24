package Selenium.Assessments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class Assessment6 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement optionsCheckboxe = driver.findElement(By.id("checkBoxOption2"));
        optionsCheckboxe.click();
        String label = driver.findElement(By.xpath("//label[@for='benz']")).getText();
        System.out.println("options text:" + label);
        WebElement selectDropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Select select = new Select(selectDropdown);
        select.selectByVisibleText(label);
        driver.findElement(By.id("name")).sendKeys(label);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
        Alert alert = driver.switchTo().alert();
        String alerttext = alert.getText();
        //Assert.assertEquals(alerttext, "Hello "+label+", share this practice page and share your knowledge");
        if (alerttext.contains(label)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test failed");
        }
        alert.accept();
        driver.close();

    }
}

//alternate answer
/* WebDriver driver = new ChromeDriver();



        driver.get("http://qaclickacademy.com/practice.php");

        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();

        String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

        WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));

        Select s=new Select(dropdown);

        s.selectByVisibleText(opt);

        driver.findElement(By.name("enter-name")).sendKeys(opt);

        driver.findElement(By.id("alertbtn")).click();

     String text=  driver.switchTo().alert().getText();

     if(text.contains(opt))

     {

    System.out.println("Alert message success");

     }

     else

    System.out.println("Something wrong with execution");

}





     //  System.out.println( driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());   */
