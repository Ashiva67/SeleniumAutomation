package TestNGBigin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionsTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
	}
	
	@Test
	public void googleTitleTest() {
		String Title=driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(Title, "Google");
	}
	@Test
	public void googleLogoTest() {
		boolean b=driver.findElement(By.xpath("//img[@class=\"lnXdpd\"]")).isDisplayed();
		Assert.assertTrue(b);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
