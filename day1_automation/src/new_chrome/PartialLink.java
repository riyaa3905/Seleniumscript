package new_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartialLink
{
	public static void main(String args[])
	{
		//ChromeDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		FirefoxDriver  driver = new FirefoxDriver();
		driver.get("https://accounts.google.com");
		WebElement Learn = driver.findElement(By.partialLinkText("Learn"));
		Learn.click();
		
		
	}
}
