package new_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector4 
{
	
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com");	
		WebElement email = driver.findElement(By.cssSelector("input[name='identifier']"));
		email.sendKeys("riyaa2345");
		Thread.sleep(5000);
		driver.close();
		
	}

}
