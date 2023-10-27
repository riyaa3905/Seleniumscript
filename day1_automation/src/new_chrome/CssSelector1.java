package new_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector1
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver  driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com");
		WebElement email =driver.findElement(By.cssSelector("input[id*='tifier']"));
		email.sendKeys("riyaa3905");
		Thread.sleep(10000);
		
		
		
		
	}

}
