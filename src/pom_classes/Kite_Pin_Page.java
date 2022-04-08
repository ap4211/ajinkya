package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Pin_Page 
{
	 @FindBy (id="pin") private WebElement Pin;
     @FindBy (xpath="//button[@type='submit']") private WebElement Pinbutton;
     
     public Kite_Pin_Page(WebDriver driver)
     {
   	  PageFactory.initElements(driver, this);
     }
     public void kitePin(String pin01)
     {
   	  Pin.sendKeys(pin01);
     }
     public void pinclick()
     {
   	  Pinbutton.click();
     }
}
