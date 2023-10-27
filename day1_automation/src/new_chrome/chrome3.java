package new_chrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class chrome3 
{
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\RAgraw03\\OneDrive - dentsu\\Desktop\\selemium jars\\chromedriver-win64");
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.get("https://www.ralphlauren.com/");
		cdriver.manage().window().maximize();
		Thread.sleep(3000);
		cdriver.manage().window().minimize();
		Thread.sleep(3000);
	}
	
	
	}


