package new_chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitly1
{
	public static void main(String args[])
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.petermillar.com/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='loginEmail']")).sendKeys("riyaa3905@gmail.com");
		driver.findElement(By.xpath("//input[@name='loginPassword']")).sendKeys("riyaa");
	}

}
