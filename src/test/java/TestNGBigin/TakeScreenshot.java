package TestNGBigin;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TakeScreenshot {
	WebDriver driver;
	String Url= "http://www.saucedemo.com";
	
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	}
	@Test
	public void test() throws InterruptedException, IOException {
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		TakesScreenshot ts=((TakesScreenshot)driver);
		File scrFile=ts.getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(scrFile, new File("D:\\Practice\\Image.jpg"));
		}catch(IOException e) {
			System.out.println("Exception messg"+e.getMessage());
		}
//		Actions action =new Actions(driver);
//		
//	
//		action.moveToElement(driver.findElement(By.id("//*[@id=\"react-burger-menu-btn\"]"))).click();
//		driver.findElement(By.id("//*[@id=\"logout_sidebar_link\"][@class=\"bm-item menu-item\"]")).click();
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}