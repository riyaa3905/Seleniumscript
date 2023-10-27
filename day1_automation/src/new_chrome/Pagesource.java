package new_chrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource
{
	public static void main(String args[])
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\RAgraw03\\OneDrive - dentsu\\Desktop\\selemium jars");
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.get("https://www.nykaa.com/");
		cdriver.manage().window().maximize();
		String pSource = cdriver.getPageSource();
		System.out.println(pSource);
		cdriver.close();
		
	}

	
}
