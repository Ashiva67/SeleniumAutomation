package Selenium.Assessments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment7 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//locating the table
        WebElement table = driver.findElement(By.cssSelector("table#product tbody"));

        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table-display']//tbody/tr"));
        System.out.println("rows: " + rows.size());

        List<WebElement> cols = driver.findElements(By.xpath("//tbody/tr/th"));
        System.out.println("cols: " + cols.size());

        //Second Row Elements

        List<WebElement> cells = driver.findElements(By.xpath("//table[@class='table-display']//tbody/tr[3]/td"));

        System.out.println("second row text");
        for (WebElement cell : cells) {
            System.out.println(cell.getText());

        }



        /*below code is tutors
        WebElement table=driver.findElement(By.id("product"));
        System.out.println(table.findElements(By.tagName("tr")).size());
        System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
        List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
        System.out.println(secondrow.get(0).getText());
        System.out.println(secondrow.get(1).getText());
        System.out.println(secondrow.get(2).getText());*/

        driver.close();

    }
}
