package new_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector3 {
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com");
		WebElement email = driver.findElement(By.cssSelector("input.whsOnd[name='identifier']"));
		email.sendKeys("riyaa3456");
		Thread.sleep(10000);
		driver.close();
	}
	

}
