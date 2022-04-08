package listerner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import baseclasses.Base_class_utlities;
import utilities.Utilities_with_properties;
import utilities.Utility;

public class Listener extends Base_class_utlities implements ITestListener
{   
	
	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("test start", true);
		ITestListener.super.onTestStart(result);
	}
	@Override
	public void onTestFailure( ITestResult result) 
	{    
		Reporter.log("test failed", true);
		ITestListener.super.onTestFailure(result);
		
	}
	@Override
	public void onTestSuccess(ITestResult result) 
	{   
		Reporter.log("test success", true);

		ITestListener.super.onTestSuccess(result);
	}
}
