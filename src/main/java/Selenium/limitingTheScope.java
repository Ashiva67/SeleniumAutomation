package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class limitingTheScope {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));//limiting webdriver scope
        System.out.println(footerDriver.findElements(By.tagName("a")).size());

        WebElement coloumDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(coloumDriver.findElements(By.tagName("a")).size());
        for (int i = 1; i < coloumDriver.findElements(By.tagName("a")).size(); i++) {
            String clickOnTab= Keys.chord(Keys.CONTROL, Keys.ENTER );
            coloumDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnTab);
            //System.out.println(coloumDriver.findElements(By.tagName("a")).get(i).getText());
            Thread.sleep(3000);


        }
        Set<String> windows=driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        while (it.hasNext()){
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }

    }
}