package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PopUps {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();

        //simple alert
        String text = "Shiva";
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

//Prompt alert accept

        //click on the click me element
        WebElement element = driver.findElement(By.cssSelector("[id='name']"));
        element.sendKeys(text);

        driver.findElement(By.cssSelector("[value=Alert]")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//input[@value='Alert']/parent::fieldset[@class='pull-right']/child::input[3]")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

        driver.close();

//        ((JavascriptExecutor)driver).executeScript("arguments[0].click", element);
        //switch to the prompt alert
        /*Alert promtAlert=driver.switchTo().alert();
        String alertText= promtAlert.getText();

        System.out.println("text of the alert: "+alertText);
        promtAlert.sendKeys("amballa shiva");
        System.out.println("given sendkeys as amballa shiva");
        promtAlert.accept();


        //Confirmational alert

       /* WebElement element=driver.findElement(By.id("confirmButton"));

        element.click();

        Alert confirmationAlert=driver.switchTo().alert();
        String alertText=confirmationAlert.getText();

        System.out.println("confirmation alert text: "+alertText);

        confirmationAlert.accept();*/

//        try {
//            driver.findElement(By.id("timerAlertButton")).click();
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//            wait.until(ExpectedConditions.alertIsPresent());
//            Alert simpleAlert = driver.switchTo().alert();
//            simpleAlert.accept();
//            System.out.println("Unexpected alert accepted");
//        } catch (Exception e) {
//            System.out.println("unexpected alert not present");
//        }
        //        Actions actions=new Actions(driver);
//        actions.scrollByAmount(0, 500).perform();

        /*click on click me element

        driver.findElement(By.id("alertButton")).click();

        //switching to the alert

        Alert simpleAlert=driver.switchTo().alert();

        simpleAlert.accept();*/

    }


}
