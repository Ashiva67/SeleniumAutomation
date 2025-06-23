package Selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/droppable/");
//
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 500);
//		action.moveToElement(driver.findElement(By.linkText("Download"))).build().perform();

		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));

		int xOffSet1=source.getLocation().x;
		int yOffSet1=source.getLocation().y;

		System.out.println("xOffSet1--"+xOffSet1+" yOffSet1--"+yOffSet1);

		int xOffSet=target.getLocation().x;
		int yOffSet=target.getLocation().y;
		System.out.println("xOffSet--"+xOffSet+" yOffSet--"+yOffSet);

		xOffSet=(xOffSet-xOffSet1)+10;
		yOffSet=(yOffSet-yOffSet1)+20;

		action.dragAndDrop(source, target).perform();

String textTo=target.getText();

if (textTo.equals("Dropped!")){
	System.out.println("Passed, drag and drop action performed");
}else {
	System.out.println("Failed, action failed");
}

		driver.close();
}
}