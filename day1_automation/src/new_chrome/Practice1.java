package new_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1
{
	public static void main(String args[])
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AYZoVheNiTZmohY582yDTw2XxAY4earnzEbIyDTzeIOtocjxZ7HBAE-hAV_Vsdxf2YbadXF-BTk4&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-988974166%3A1696835323117504&theme=glif");
		WebElement lMore = driver.findElement(By.linkText("Learn more"));
		String text = lMore.getText();
		String tagName = lMore.getTagName();
		String attValue= lMore.getAttribute("jsname");
		System.out.println("text "+text+" tagname "+tagName+" attValue");
		
		
	}

}
