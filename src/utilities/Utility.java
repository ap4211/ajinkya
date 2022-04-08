package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{      
	static Sheet mysheet;
       public static String readexel(int row,int coloumn) throws EncryptedDocumentException, IOException
       {
    	   FileInputStream file=new FileInputStream("F:\\Class\\ajinkya.xlsx");
    	   mysheet = WorkbookFactory.create(file).getSheet("sheet1");
    	   String value = mysheet.getRow(row).getCell(coloumn).getStringCellValue();
    	   return value;
       }
	  public static void screenshot(WebDriver driver,int TCID) throws IOException
	  {
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  File dest=new File("F:\\New Folder\\"+TCID+"Zerodha.png");
		  FileHandler.copy(src, dest);
	  }
	  
}
