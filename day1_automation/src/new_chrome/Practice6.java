package new_chrome;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice6 
{
	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://echoecho.com/javascript4.htm");
		WebElement thirdA=driver.findElement(By.xpath("//input[@name='B3']"));
		Thread.sleep(5000);
		thirdA.click();
		Thread.sleep(5000);
		Alert thirdA1 = driver.switchTo().alert();
		Thread.sleep(5000);
		thirdA1.sendKeys("hI hello");
		Thread.sleep(5000);
		thirdA1.accept();
		Thread.sleep(5000);
		driver.close();
		
		
		
	}

}
