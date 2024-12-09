package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Upload {
	public static void main(String[] args) throws AWTException {


		WebDriver Driver=new EdgeDriver();
		Driver.get("https://www.leafground.com/file.xhtml");
		Driver.manage().window().maximize();
		
		WebElement Uploadclick=Driver.findElement(By.xpath("//*[@id=\"j_idt88\"]"));
		Uploadclick.click();
		      
		//important go to windows control
		
		//
		String file="D:\\Userfiles\\Downloads\\TestLeaf Logo (3).png";
		StringSelection selection=new StringSelection(file);
		//D:\Userfiles\Downloads\TestLeaf Logo (3).png
		
		// Use Tool kit 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot robot=new Robot();
		//virtual key its pressing control press
		robot.keyPress(KeyEvent.VK_CONTROL);
		//virtual key its pressing control +v press
		robot.keyPress(KeyEvent.VK_V);
		//virtual key its pressing control +control release
		robot.keyRelease(KeyEvent.VK_V);
		//virtual key its pressing control + control+ v press
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		
        try {
        	Thread.sleep(2000); // sleep for 2 seconds 
        	} catch (InterruptedException e)  {
        e.printStackTrace();
        
        }
		
		
		
	}
}
