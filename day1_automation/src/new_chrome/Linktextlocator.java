package new_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktextlocator 
{
	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.get("https://www.nykaa.com/");
		WebElement condN = cdriver.findElement(By.linkText("Conditions"));
		condN.click();
		Thread.sleep(10000);
		cdriver.close();
		
		
			
	}

}
