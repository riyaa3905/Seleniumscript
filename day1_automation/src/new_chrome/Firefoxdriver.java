package new_chrome;

import org.openqa.selenium.firefox.FirefoxDriver;  

public class Firefoxdriver{
	

	public static void main(String[] args)throws InterruptedException
	{
	{
	FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.ralphlauren.global");
		Thread.sleep(50000);
		driver.close();
	}
	}
}

