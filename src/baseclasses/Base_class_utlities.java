package baseclasses;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import utilities.Utilities_with_properties;

public class Base_class_utlities 
{
    protected  WebDriver driver;
	public void LaunchBrowser() throws IOException
	{
	 Reporter.log("Launching browser", true);
	 System.setProperty("webdriver.chrome.driver", "F:\\New Folder\\chromedriver.exe");
	 //ChromeOptions opt=new ChromeOptions();// created object of 
     driver= new ChromeDriver();
	 driver.get(Utilities_with_properties.readDatafromPropertyFile("URL"));
	 driver.manage().window().maximize();
	 Reporter.log("Browser launching success", true);
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	public void closeBrowser()
	{
	driver.close();
	Reporter.log("Browser closed success", true);
	}
	public static  void captureScreenshot(WebDriver driver ,int TCID) throws IOException
	{
	       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       File dest= new File("F:\\New Folder\\"+TCID+"Zerodha.png");
	       FileHandler.copy(src, dest);
	}

}
