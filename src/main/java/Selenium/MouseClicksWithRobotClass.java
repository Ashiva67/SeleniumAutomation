package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.InputEvent;
import java.time.Duration;

public class MouseClicksWithRobotClass {
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriver driver;
        driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/buttons");



        Actions action=new Actions(driver);
        action.scrollByAmount(0, 300);
        Thread.sleep(3000);
        WebElement webElement= driver.findElement(By.id("rightClickBtn"));

        Robot robot=new Robot();

        Dimension i=driver.manage().window().getSize();
        System.out.println("dimention X and Y: "+ i.getWidth()+" "+ i.getHeight());

        //get the height and width of the screen

        int x=(i.getWidth()/4)+20;
        int y=(i.getHeight()/10)+50;

        robot.mouseMove(x, y);

        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);

        System.out.println("right click button clicked");



        Thread.sleep(3000);

        driver.close();

    }
}
