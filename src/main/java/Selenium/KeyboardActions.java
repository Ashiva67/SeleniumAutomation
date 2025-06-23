package Selenium;

import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.K;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;


public class KeyboardActions {
    public static void main(String[] args) {
        WebDriver driver;
        driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Actions actions=new Actions(driver);
        actions.scrollByAmount(0, 300);

        WebElement fullName=driver.findElement(By.id("userName"));
        fullName.sendKeys("Mr.Peter Haynes");

        WebElement eMail= driver.findElement(By.id("userEmail"));
        eMail.sendKeys("PeterHaynes@toolsqa.com");

        WebElement currentAddress= driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("43 School Lane London EC71 9GO");


        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();

        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("c");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();

        actions.sendKeys(Keys.TAB);
        actions.build().perform();

//        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("v");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();

driver.close();

        System.out.println("action performed");




    }


}
