package Selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class  HanddleFileUploadPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://html.com/input-type-file/");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		Alert alert = driver.switchTo().alert();
		action.moveToElement((WebElement) By.xpath("//input[@id='fileupload']"));
//		driver.findElement(By.name("fileupload")).sendKeys("\"D:\\ACON\\Practice .pdf.exe\"");
//		driver.close();
}
}