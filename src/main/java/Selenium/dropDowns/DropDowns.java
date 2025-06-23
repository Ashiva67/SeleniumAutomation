package Selenium.dropDowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
    public static void main(String args[]) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Thread.sleep(2000);

        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select select = new Select(staticDropdown);

        //select by index
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());

        //select.selectByVisibleText
        select.selectByVisibleText("AED");
        System.out.println(select.getFirstSelectedOption().getText());

        //select by value
        select.selectByValue("USD");
        System.out.println(select.getFirstSelectedOption().getText());

        //for clicking multiple times of a dropdown

        driver.findElement(By.id("divpaxinfo")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        for (int i = 0; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();

        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

//		Thread.sleep(3000);
        driver.close();
    }


}
