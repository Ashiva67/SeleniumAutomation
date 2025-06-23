package TestNGBigin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGFeatures {
//	WebDriver driver;
//	@BeforeMethod
//	public void setUp() {
//driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
//		driver.get("http://www.google.com");
//	}

	@Test
	public void loginTest() {
		System.out.println("LoginTest");
		int i=9/0;
	}
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest() {
		System.out.println("HomePageTest");
	}
	@Test(dependsOnMethods="loginTest")
	public void SearchTest() {
		System.out.println("Search Test");
	}
}
