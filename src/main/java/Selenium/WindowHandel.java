package Selenium;

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
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/browser-windows");


        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 500).perform();
        driver.findElement(By.id("windowButton")).click();
String mainWindowHandle=driver.getWindowHandle();
        Set<String> allWindowhandles=driver.getWindowHandles();
        Iterator<String> iterator=allWindowhandles.iterator();
        while (iterator.hasNext()){
            String childWindow=iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(childWindow)){
                driver.switchTo().window(childWindow);
                WebElement text=driver.findElement(By.id("sampleHeading"));
                System.out.println("element text:"+text.getText());
            }

        }


driver.quit();

    }
}
