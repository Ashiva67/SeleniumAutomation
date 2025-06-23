package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "D:\\Applications\\geckodriver-v0.35.0-win-aarch64.exe");
//		WebDriver driver1 =new FirefoxDriver(); //launch firefox driver
//		driver.get("http://www.firefox.com");
//		System.out.println(driver.getTitle());
//		driver.quit();
		
		//chromedriver launch
		WebDriver driver2 =new ChromeDriver();
		driver2.get("https://mail.google.com/mail/u/0/#inbox");
//		String title =driver2.getTitle();
//		System.out.println(title);
		
//		if(title.equals("Google")) {
//		System.out.println("correct title");
//		}else {
//			System.out.println("wrong title");
//		}
//		System.out.println(driver2.getCurrentUrl());
//		System.out.println(driver2.getPageSource());
//		driver2.close();//to close the browser both quit and close closes the browser
		
		

	}

}
