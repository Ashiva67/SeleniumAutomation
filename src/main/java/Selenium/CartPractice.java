package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class CartPractice {
    public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "\"D:\\Applications\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
        driver.manage().deleteAllCookies();

        Thread.sleep(300);
        String[] itemsNeeded = {"Carrot", "Cucumber", "Beetroot", "Beans"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        addItems(driver, itemsNeeded);

        driver.findElement(By.cssSelector("a[class='cart-icon'] img[alt='Cart']")).click();
        driver.findElement(By.xpath("//div[@class='action-block']/button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
        driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();


        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Code applied ..!']")));

        System.out.println((driver.findElement(By.xpath("//span[text()='Code applied ..!']")).getText()));

        driver.close();
    }

    public static void addItems(WebDriver driver, String[] itemsNeeded) {
        int j = 0;


        List<WebElement> productNames = driver.findElements(By.xpath("//h4[@class='product-name']"));

        for (int i = 0; i < productNames.size(); i++) {

            //Brocolli - 1 Kg

            String[] name = productNames.get(i).getText().split("-");
            String formattedNamed = name[0].trim();

            //format it to getactual vegitable name
            //covert array into array list for easy search
            //check whether name you extracted is present in arraylist or not
            List items = Arrays.asList(itemsNeeded);

            if (items.contains(formattedNamed)) {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if (j == itemsNeeded.length) {
                    break;
                }
            }
        }


        System.out.println("code executed");

    }
}
