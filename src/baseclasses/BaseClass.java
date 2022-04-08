package baseclasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;


public class BaseClass
{
	protected WebDriver driver;
	public void launchbrowser(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver", "F:\\New Folder\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("https://kite.zerodha.com/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			 Reporter.log("launch browser chrome",true);
			 
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			    System.setProperty("webdriver.edge.driver", "F:\\New Folder\\msedgedriver.exe");
	            driver= new EdgeDriver();
				driver.get("https://kite.zerodha.com/");
				driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			    Reporter.log("launch browser edge",true);

		}
		
		
	}
	public void closebrowser()
	{    
		Reporter.log("close browser",true);
		driver.close();
	}
		

}
