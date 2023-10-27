package new_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice7
{
	public static void main(String args[])
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		WebElement male=driver.findElement(By.xpath("//input[@type='radio'][1]"));
		male.click();
		WebElement check=driver.findElement(By.xpath("//input[@type='checkbox']"));
		check.click();
		
	}

}
