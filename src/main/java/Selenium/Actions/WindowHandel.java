package Selenium.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WindowHandel {
    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.cssSelector("body a.blinkingText")).click();
        Set<String> windows = driver.getWindowHandles(); //[parentid, childid, subchildid]
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.cssSelector("[class='im-para red']")).getText());
        String emailId=driver.findElement(By.cssSelector("[class='im-para red']")).getText().split("at")[1].trim().split(" with")[0];
        driver.switchTo().window(parentId);
        driver.findElement(By.cssSelector("[id='username']")).sendKeys(emailId);
    }
}
