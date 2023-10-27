package new_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 
{
	public static void main(String args[])
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com");
		WebElement elem = driver.findElement(By.xpath("//input[@id='identifierId']"));
		elem.sendKeys("riya2782");
	}
		

}
