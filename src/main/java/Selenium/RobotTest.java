package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class RobotTest {

    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriver driver;
        driver=new ChromeDriver();

       driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/key_presses");
        System.out.println("page opened");

        driver.findElement(By.id("target")).click();

        Robot robot=new Robot();

        robot.keyPress(KeyEvent.VK_SHIFT);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_1);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_X);
        robot.keyPress(KeyEvent.VK_T);

Thread.sleep(4000);

        System.out.println("successfully entered D.TXT");
        driver.close();

    }
}
