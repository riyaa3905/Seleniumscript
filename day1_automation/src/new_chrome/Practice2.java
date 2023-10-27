package new_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 
{
	public static void main(String args[])
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shadi.com/");
		WebElement login = driver.findElement(By.linkText("Login"));
		System.out.println(login.isDisplayed());
	    WebElement jNow = driver.findElement(By.linkText("Join Now"));
	    jNow.click();
	    WebElement Female = driver.findElement(By.xpath("//input@type='radio'][@id='rblGender_0]"));
	    System.out.println(Female.isSelected());
	    WebElement male = driver.findElement(By.xpath("//input[@type='radio'][@id='rblGender_1']"));
	    System.out.println(male.isSelected());
	    System.out.println(male.isEnabled());
	}

}
