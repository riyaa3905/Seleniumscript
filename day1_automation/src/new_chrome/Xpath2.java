package new_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 
{
	public static void main(String args[])
	{
		ChromeDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://accounts.google.com/");
		WebElement elem = drive.findElement(By.xpath("//input[@id='identifierId'][@name='whsOnd']"));
		elem.sendKeys("riyaa");
	}

}
