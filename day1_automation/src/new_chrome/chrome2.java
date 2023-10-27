package new_chrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class chrome2 
{
	public static void main(String[] args) throws InterruptedException
	{
	
	System.setProperty("WebDriver.Chrome.driver","C:\\Users\\RAgraw03\\OneDrive - dentsu\\Desktop\\selemium jars");	
	ChromeDriver cdriver = new ChromeDriver();
	cdriver.get("https://www.ralphlauren.global/");
	String eTitle = "ralphlauren";
	String aTitle = cdriver.getTitle();
	System.out.println(aTitle);
	if(aTitle.equalsIgnoreCase(eTitle))
		System.out.println("PASS");
	else
		System.out.println("FAIL");
}


}
