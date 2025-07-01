package Selenium.JsExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import java.util.List;

class JavaScriptExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

        List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
int sum=0;
        for (int i=0; i<values.size(); i++){
            sum=sum+Integer.parseInt(values.get(i).getText());
        }
        System.out.println(sum);
       String text= driver.findElement(By.xpath("//div[text()=' Total Amount Collected: 296 ']")).getText();
       int total=Integer.parseInt(text.split(":")[1].trim());
       Assert.assertEquals(sum, total);

    }
}

/*driver.manage().window().maximize(); // for maximizing the window
        driver.manage().deleteAllCookies(); // for deleting the cookies
        // dynamic wait
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://www.saucedemo.com");

        // By id:
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        flash(loginBtn, driver);
    }

    public static void flash(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String bgcolor = element.getCssValue("backgroundColor");
        for (int i = 0; i < 10; i++) {
            change("rgb(0,200,0)", element, driver);
            change(bgcolor, element, driver);
        }
    }

    public static void change(String color, WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='" + color + "'", element);
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();*/
