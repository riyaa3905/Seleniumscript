package new_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
	public static void main(String args[])
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.shadi.com/");
		WebElement Join = driver.findElement(By.linkText("Join Now"));
		Join.click();
		WebElement education = driver.findElement(By.cssSelector("select[id^='ddlEdu']"));
		Select s = new Select(education);
		s.selectByIndex(5);
		
		
		
		
	}

}
