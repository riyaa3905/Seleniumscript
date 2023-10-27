package new_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath3 
{
	public static void main(String args[])
	{
		ChromeDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("file:///C:/Users/RAgraw03/OneDrive%20-%20dentsu/Documents/textmethod.html");
		WebElement elem = drive.findElement(By.xpath("td[text()='Manual']"));
		elem.click();
		System.out.println("located"+ elem.getText());
	}

}
