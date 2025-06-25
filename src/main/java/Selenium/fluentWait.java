package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.function.Function;

public class fluentWait {
        public static void main(String[] args) throws InterruptedException {
            WebDriver driver;
            driver = new EdgeDriver();

            driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

            driver.findElement(By.xpath("//div[@id='start']/button")).click();

            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
                    .pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

            WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
                @Override
                public WebElement apply(WebDriver driver) {
                    if (driver.findElement(By.cssSelector("div#finish")).isDisplayed()) {
                        return driver.findElement(By.cssSelector("div#finish"));
                    } else {
                        return null;
                    }
                }
            });
            System.out.println(driver.findElement(By.cssSelector("div#finish")).getText());
            driver.close();
        }
    }


