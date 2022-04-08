package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login_Page
{
	@FindBy(id="userid") private WebElement user1;
	@FindBy(id="password") private WebElement pass1;
	@FindBy (xpath="//button[@type='submit']") private WebElement button;
    @FindBy (xpath="//span[@class='su-message']") private WebElement error;
	public Kite_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void userID(String user01)
	{
        user1.sendKeys(user01);		
	}
	public String errormassage()
	{
		String massage = error.getText();
	    return massage;
		
	}
	public void idpass(String pass01)
	{
		pass1.sendKeys(pass01);
	}
	 public void loginclick()
     {
   	      button.click();
     }

}
