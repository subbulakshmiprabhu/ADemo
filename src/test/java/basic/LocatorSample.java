package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorSample {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver  driver = new ChromeDriver();		
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		WebElement input = driver.findElement(By.xpath("//textarea[@title = 'Search']"));
		input.sendKeys("selenium");
		
	}

}
