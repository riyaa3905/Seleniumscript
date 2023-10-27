package new_chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idlocator 
{
	public static void main(String args[])
	{
		ChromeDriver cdriver= new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.get("https://www.nykaa.com/auth/verify?ptype=auth&redirect=%2F");
		List<WebElement> nykaa = cdriver.findElements(By.id("emailMobile"));
		((WebElement) nykaa).sendKeys("riyaa3905@gmail.com");
	}

}
