package Selenium;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		List<WebElement> LinkList = driver.findElements(By.tagName("a"));
		System.out.println(LinkList.size());
		for(int i=0; i<LinkList.size(); i++) {
			String linkText=LinkList.get(i).getText();
			System.out.println(linkText);
			
		}
		
	}}