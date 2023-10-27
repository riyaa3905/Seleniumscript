package new_chrome;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4 
{
	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://echoecho.com/javascript4.htm");
		WebElement firstA = driver.findElement(By.xpath("//input[@name='B1']"));
		Thread.sleep(5000);
		firstA.click();
		Alert firstA1 = driver.switchTo().alert();
		firstA1.accept();
				
		
		
	}

}
