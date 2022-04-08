package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Utilities_with_properties 
{
	public static String readDatafromPropertyFile(String key) throws IOException
	{
	    Properties prop= new Properties();
	    FileInputStream myfile= new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Testingz\\utilities.properties");
	    prop.load(myfile);
	    String value = prop.getProperty(key);
	    return value;
	}
	public  void captureScreenshot(WebDriver driver, int TCID) throws IOException
	{
	       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       File dest= new File("F:\\New Folder\\"+TCID+"Zerodha.png");
	       FileHandler.copy(src, dest);
	}
}
