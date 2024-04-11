package SeleniumSessions;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Drivers\\chromedriver.exe");
	
		//WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		// Launch Website
       // driver.get("https://www.google.com/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev/");

	}

}
