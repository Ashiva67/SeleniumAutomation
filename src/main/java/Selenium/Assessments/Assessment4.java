package Selenium.Assessments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class Assessment4 {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
        driver.findElement(By.xpath("//a[contains(text(), 'Click Here')]")).click();
        Set<String> windows=driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        String parentId= it.next();
        String childId=it.next();
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='example']/h3")).getText(), "New Window");
        driver.switchTo().window(parentId);
        System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());



    }
}
