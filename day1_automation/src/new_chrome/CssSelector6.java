package new_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector6 {

	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com");
		WebElement email = driver.findElement(By.cssSelector("input[id$='erld']"));
		email.sendKeys("riyaa3905");
		Thread.sleep(1000);
		driver.close();
	}
}
