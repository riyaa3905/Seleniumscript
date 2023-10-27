package new_chrome;

import org.openqa.selenium.chrome.ChromeDriver;



public class chrome
{
	public static void main(String args[])
			{
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.get("https://www.ralphlauren.global/");
		String title = cdriver.getTitle();
		System.out.println(title);
		cdriver.close();
		
			}

}
