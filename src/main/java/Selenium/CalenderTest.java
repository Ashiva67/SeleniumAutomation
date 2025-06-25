package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class CalenderTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();

		String monthNumber="6";
		String date="15";
		String year="2027";
		String[] expectedList={monthNumber, date, year};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		System.out.println(driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).getText());

		List<WebElement> actualList=driver.findElements(By.cssSelector("input.react-date-picker__inputGroup__input "));
		for (int i=0; i<actualList.size();i++){
			System.out.print(actualList.get(i).getDomAttribute("value"));
			Assert.assertEquals(actualList.get(i).getDomAttribute("value"), expectedList[i]);

		}
driver.close();
}}


/*driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[contains(@name, 'username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();

//		Actions action = new Actions(driver);
		Thread.sleep(3000);
//		action.moveToElement(driver.findElement(By.className("oxd-text oxd-text--p"))).build().perform();

//		driver.close();

//		the other method for xpath
		driver.findElement(By.xpath("//input[contains(@name, 'username')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[contains(@name, 'password')]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(@type, 'submit')]")).click();
//

		List<WebElement> LinkList = driver.findElements(By.tagName("a"));
		System.out.println(LinkList.size());
		for(int i=0; i<LinkList.size(); i++) {
			String linkText=LinkList.get(i).getText();
			System.out.println(linkText);

	}	*/
