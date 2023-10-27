package new_chrome;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chrome5 {
	public static void main(String args[])
	{
		System.out.println("Enter the name of the browser");
		Scanner s = new Scanner(System.in);
		String browser = s.next();
		if(browser.equalsIgnoreCase("firefox"))
		{
			FirefoxDriver fDriver = new FirefoxDriver();
			openB(fDriver);
			
		}
		else
		{
			ChromeDriver cDriver = new ChromeDriver();
			openB(cDriver);
		}
	}
	public static void openB(FirefoxDriver f)
	{
		f.get("https://www.ralphlauren.global/");
		String fTitle = f.getTitle();
		String fUrl = f.getCurrentUrl();
		System.out.println(fTitle+" "+fUrl);
	}
	public static void openB(ChromeDriver c)
	{
		c.get("https://www.ralphlauren.global/");
		String cTitle = c.getTitle();
		String cUrl = c.getCurrentUrl();
		System.out.println(cTitle+ " "+cUrl);
		
	}

}
