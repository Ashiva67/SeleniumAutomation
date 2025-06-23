package Selenium.dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DynamicDropdowns {
    public static void main(String args[]) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Thread.sleep(2000);

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        ////div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='HYD'] ==for parent child relation
        driver.findElement(By.xpath("//a[@value='HYD']")).click();

        //
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='TIR']")).click();

        driver.findElement(By.xpath("//a[@class='ui-state-default']")).click();

        System.out.println("code successful");

        driver.close();

    }
}
