package new_chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 
{
	public static void main(String args[])
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
		WebElement links=driver.findElement(By.tagName("a"));
		System.out.println(links.getSize());
		driver.getWindowHandles();
		for (WebElement link:links)

		{
			System.out.println(((WebElement) links).getText());
		}
	}
}
