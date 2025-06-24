package Selenium.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        Actions actions = new Actions(driver);

        //click on the search bar and give the sendkeys as hello and make the hello as capitals and double click on the sendkeys and right click on the signin button
        actions.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello")
                .doubleClick().build().perform();
        Thread.sleep(1000);

        //Moves to specific element
        WebElement move=driver.findElement(By.cssSelector("div[id='nav-link-accountList']"));
        actions.moveToElement(move).contextClick().build().perform();
        driver.close();
    }


}
