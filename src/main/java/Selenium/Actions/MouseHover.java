package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver=new ChromeDriver();

        driver.get("https://demoqa.com/menu/");
        System.out.println("opened the url");
        driver.manage().window().maximize();
        Actions actions=new Actions(driver);
        actions.scrollByAmount(0, 200).perform();

        WebElement mainItem2= driver.findElement(By.linkText("Main Item 2"));

        actions.moveToElement(mainItem2).perform();
        System.out.println("hovered on the main item2");
        WebElement sUBSUBLIST= driver.findElement(By.linkText("SUB SUB LIST »"));

        actions.moveToElement(sUBSUBLIST).perform();
        System.out.println("hovered on the subsublist");
        WebElement subSubItem1= driver.findElement(By.linkText("Sub Sub Item 1"));

        actions.moveToElement(subSubItem1).click();
        System.out.println("clicked on the subsublist1");
        Thread.sleep(3000);
        System.out.println("performed");
        driver.close();
    }
}
