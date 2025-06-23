package Selenium.e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class OneWayTrip {

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

        if (driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5")) {
            System.out.println("is enabled");
            Assert.assertTrue(true);

        } else {
            Assert.assertTrue(false);
        }

        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
        driver.findElement(By.id("divpaxinfo")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        for (int i = 0; i < 3; i++) {
            driver.findElement(By.cssSelector("div.ad-row-right >span#hrefIncAdt")).click();
        }
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        driver.findElement(By.xpath("(//input[@class='buttonN']/parent::div)[1]")).click();

        WebElement currencyOptions = driver.findElement(By.xpath("//select[starts-with(@id, \"ctl00_mainContent_D\")]"));

        Select option = new Select(currencyOptions);
        option.selectByVisibleText("USD");

        driver.findElement(By.xpath("//input[starts-with(@id, \"ctl00_mainContent_b\")]")).click();
        System.out.println("code successful");
        driver.close();

    }
}
