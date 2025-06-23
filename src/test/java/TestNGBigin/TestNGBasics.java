package TestNGBigin;

import java.util.concurrent.TimeUnit;

//import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("http://10.82.180.36/Common/Login.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
