package new_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Namelocator 
{
	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.get("https://www.nykaa.com/auth/verify?ptype=auth&redirect=%2F");
		WebElement email = cdriver.findElement(By.name("emailMobile"));
		email.sendKeys("riyaa3905@gmail.com");
		Thread.sleep(10000);
		cdriver.close();
		}

	
}
