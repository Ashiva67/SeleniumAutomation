package TestNGBigin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
//		WebDriver driver;
//		System.setProperty("webdriver.chrome.driver", "\"D:\\Applications\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	@Test(priority=1)
	public void googleTitleTest() {
		String title= driver.getTitle();
		System.out.println(title);
	
	}
	@Test(priority=3)
	public void googleLogoTest() throws InterruptedException {
		Thread.sleep(3000);
		boolean b=driver.findElement(By.xpath("//img[@class=\"lnXdpd\"]")).isDisplayed();
		Assert.assertTrue(b, "google Logo is not displayed");
	}
	@Test(priority=2)
	public void mailLinkTest() {
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	@Test(priority=4)
	public void test1() {
		System.out.println("test1");
	}
	@Test(priority=5)
	public void test2() {
		System.out.println("test2");
	}
	@Test(priority=6)
	public void test3() {
		System.out.println("test3");
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}
