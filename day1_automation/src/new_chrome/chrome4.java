package new_chrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class chrome4 
{
	public static void main(String[] args)
	{
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\RAgraw03\\OneDrive - dentsu\\Desktop\\selemium jars\\chromedriver-win64");
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.get("https://www.ralphlauren.com/");
		cdriver.manage().window().maximize();
		String cUrl = cdriver.getCurrentUrl();
		System.out.println(cUrl);
		
	}

}
