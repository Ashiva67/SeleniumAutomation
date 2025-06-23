package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HanddleWindowPopUps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.popuptest.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("")).click();//go click on the link then pop up arises
		Set<String> handler = driver.getWindowHandles(); //getting all the string window handlers
		Iterator<String> it=handler.iterator(); //iterating all the strings
		String parentWindow=it.next(); //going to the parent window
		System.out.println("Parent Window: "+parentWindow);
		
		String childWindow=it.next();//going to the child window
		System.out.println("Child Window : "+childWindow);
		Thread.sleep(2000);//waiting for 2 seconds
		
		driver.switchTo().window(childWindow);//taking control on the child window
		System.out.println("child window title:"+driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println("Parent Window Title: "+driver.getTitle());
		Thread.sleep(2000);
		
		
		
		

	}

}
