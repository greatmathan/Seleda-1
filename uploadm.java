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

public class uploadm {
    public static void main(String[] args) throws AWTException {
        // Initialize WebDriver
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.leafground.com/file.xhtml");
        driver.manage().window().maximize();
        
        // Locate and click the upload button
        WebElement uploadClick = driver.findElement(By.xpath("//*[@id='j_idt88']"));
        uploadClick.click();
        
        // File path to upload
        String filePath = "D:\\Userfiles\\Downloads\\TestLeaf Logo (3).png";
        StringSelection selection = new StringSelection(filePath);
        
        // Copy the file path to the clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
        
        // Use Robot class to simulate keyboard events
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        // Optionally, you might want to add some delay to ensure the file is uploaded
        try {
            Thread.sleep(2000); // sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Close the browser
        driver.quit();
    }
}
