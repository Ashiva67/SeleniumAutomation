package Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {
	static WebDriver driver;
	public static void main(String args[]) throws IOException {
	Properties prop = new Properties();
	FileInputStream ip = new FileInputStream(
			"D:\\Java Learning\\eclipse-java-2024-12-R-win32-x86_64\\MySeleniumLearning\\src\\main\\java\\Selenium\\config.properties");
	prop.load(ip);
	System.out.println(prop.getProperty("name"));
	System.out.println("age");
	String url = prop.getProperty("URL");
	System.out.println(url);
	String browserName =prop.getProperty("browser");
	System.out.println(browserName);
	if (browserName.equals("chrome")) {
		driver =new ChromeDriver();
	}
	else if(browserName.equals("FF")) {
		driver=new FirefoxDriver();
	}
	else if(browserName.equals("IE")){
		driver = new InternetExplorerDriver();
	}
	
	driver.get(url);

}
}