package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Home_page 
{
	@FindBy(xpath = "//span[@class='user-id']") private WebElement User0123;
	@FindBy(xpath="//a[@target='_self']") private WebElement Logout;
    
	public Kite_Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String UserName()
	{
		String UserN=User0123.getText();
		return UserN; 
	}
	public void logout() throws InterruptedException 
	{ 
	User0123.click();
	Thread.sleep(1000);
	Logout.click(); 
	}
	
}
