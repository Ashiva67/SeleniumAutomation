package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class LocatorsConcept {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new FirefoxDriver();
//		WebDriver driver =new EdgeDriver();
//		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String name="Shiva";
		String password=getPassword(driver);

////header/div/a/following-sibling::button[2] ====parent to child traverse
//		//header/div/parent::header/a[2]====traversing from child to parent

//		By id:
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.className("signInBtn")).click();

		Thread.sleep(2000);
//
		System.out.println(driver.findElement(By.tagName("p")).getText());

		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        driver.close();

	}
	public static String getPassword(WebDriver driver) throws InterruptedException {

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText=driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String passwordArray[]=passwordText.split("'");

		String password=passwordArray[1].split("'")[0];

		//passwordArray[0]=Please use temporary password
		//passwordArray[1]=rahulshettyacademy' to Login.

		//passwordArray[1] if we split with '
//       0th index=rahulshettyacademy
//		1 st index= to login

		driver.findElement(By.cssSelector(".go-to-login-btn")).click();

		return password;


	}

}