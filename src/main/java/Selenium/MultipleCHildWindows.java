package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class MultipleCHildWindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver=new ChromeDriver();

        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/browser-windows");


        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 500).perform();
        driver.findElement(By.id("windowButton")).click();
        driver.findElement(By.id("messageWindowButton")).click();

        String mainWindow=driver.getWindowHandle();
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();
        while (i1.hasNext()){

            String childWindow=i1.next();
            if (mainWindow.equalsIgnoreCase(childWindow)){
                driver.switchTo().window(childWindow);
                driver.close();
                System.out.println("child window is closed");
            }
        }
        driver.switchTo().window(mainWindow);

driver.quit();
    }
}
