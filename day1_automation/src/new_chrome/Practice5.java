package new_chrome;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice5
{
	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://echoecho.com/javascript4.htm");
		WebElement secondA = driver.findElement(By.xpath("//input[@name='B2']"));
		Thread.sleep(5000);
	secondA.click();
	Thread.sleep(3000);
	Alert SecondA1 = driver.switchTo().alert();
	System.out.println(SecondA1.getText());
	SecondA1.dismiss();
	Thread.sleep(3000);
	driver.close();
	
	}

}
