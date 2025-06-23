package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[contains(@name, 'username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//		Actions action = new Actions(driver);
		Thread.sleep(3000);
//		action.moveToElement(driver.findElement(By.className("oxd-text oxd-text--p"))).build().perform();
		
//		driver.close();
		
//		the other method for xpath
		driver.findElement(By.xpath("//input[contains(@name, 'username')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[contains(@name, 'password')]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(@type, 'submit')]")).click();
//		
		
		List<WebElement> LinkList = driver.findElements(By.tagName("a"));
		System.out.println(LinkList.size());
		for(int i=0; i<LinkList.size(); i++) {
			String linkText=LinkList.get(i).getText();
			System.out.println(linkText);

	}	
}}
