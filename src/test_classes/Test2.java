

package test_classes;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import pom_classes.Kite_Home_page;
import pom_classes.Kite_Login_Page;
import pom_classes.Kite_Pin_Page;
import utilities.Utility;

public class Test2 extends BaseClass
{
	Kite_Home_page home;   
    Kite_Login_Page login;
    Kite_Pin_Page pin;
    @Parameters("browsername")
     @BeforeClass
     public void launchingbrowser()
     {
    	 launchbrowser("chrome");
    	 home=new Kite_Home_page(driver);
    	 login=new Kite_Login_Page(driver);
    	 pin =new Kite_Pin_Page(driver);
    	 Reporter.log("launching succesfully", true);
     }
     @BeforeMethod
     public void loginkite() throws EncryptedDocumentException, IOException
     {
    	 login.userID(Utility.readexel(0, 0));
    	 login.loginclick();
     }
     @Test
     public void errormassage() throws EncryptedDocumentException, IOException
     {
    	 int TCID=4212;
    	 String actual = login.errormassage();
    	 String expexcted = Utility.readexel(0, 4);
    	 Assert.assertEquals(actual, expexcted,"massage is not matching ");
    	 Utility.screenshot(driver, TCID);
     }
     @AfterClass
     public void close()
     {
    	 closebrowser();
     }
     
}
