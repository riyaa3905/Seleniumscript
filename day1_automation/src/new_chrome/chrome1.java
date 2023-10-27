package new_chrome;


    import org.openqa.selenium.chrome.ChromeDriver;
    

public class chrome1{
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("WebDriver.Chrome.driver","C:\\Users\\RAgraw03\\OneDrive - dentsu\\Desktop\\selemium jars");
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.get("https://www.ralphlauren.global");
		Thread.sleep(100000);
		cdriver.close();
		
	}
	
	

}
