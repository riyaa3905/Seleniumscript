package new_chrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {
public static void main(String args[]) throws InterruptedException
{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/");
	driver.navigate().to("https://www.petermillar.com/");
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(50000);
	driver.navigate().refresh();
	Thread.sleep(5000);
	driver.navigate().forward();
	}
}

 
