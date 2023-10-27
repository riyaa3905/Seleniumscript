package new_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector2
{
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com");
		WebElement email = driver.findElement(By.cssSelector("input.whsOnd"));
		email.sendKeys("riyayaaa");
		Thread.sleep(10000);
	}

		
	}


