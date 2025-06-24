package Selenium.Actions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.cssSelector(".demo-frame")).size());
		driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		Actions action=new Actions(driver);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement trg=driver.findElement(By.id("droppable"));
		action.dragAndDrop(src, trg).build().perform();
		driver.close();
	}
}
