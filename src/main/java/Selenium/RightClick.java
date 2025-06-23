package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) {
        WebDriver driver;
        driver=new ChromeDriver();

        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();
        Actions actions=new Actions(driver);
        actions.scrollByAmount(0, 500).perform();

        WebElement element=driver.findElement(By.id("rightClickBtn"));

        actions.contextClick(element).perform();

        String text=element.getText();
        System.out.println(text);

        WebElement elementDoubleClick=driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick().perform();
        String text1=elementDoubleClick.getText();
        System.out.println(text1);
        driver.close();
    }
}
