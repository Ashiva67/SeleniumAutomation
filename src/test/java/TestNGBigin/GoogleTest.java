package TestNGBigin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	@Test
	public void GoogleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	@Test
	public void GoogleImageTest() {
		driver.findElement(By.xpath("//img[contains(@class, 'lnXdpd')]")).isDisplayed();
		
	}
	
	@Test
	public void GoogleLinkTest() {
		driver.findElement(By.xpath("//a[contains(@class, 'gb_X')][@aria-label=\"Gmail \"]")).isDisplayed();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
