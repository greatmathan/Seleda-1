package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ImplicitwaitExample {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		WebDriver Driver=new EdgeDriver();
		Driver.get(" https://www.phptravels.net/login");
		Driver.manage().window().maximize();
		//Driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		// TODO Auto-generated method stub//mtest@gmail.com//mtest@gmail.com
		Driver.findElement(By.id("email")).sendKeys("mtest@gmail.com");
		Driver.findElement(By.id("password")).sendKeys("mtest@gmail.com");
		Driver.findElement(By.id("submitBTN")).click();

		Driver.get("http://");// get will not store  history.
		Driver.navigate().back();// navigate will store history.
		
	
	// screen shot
	TakesScreenshot screenshot=(TakesScreenshot)Driver;
	File source=screenshot.getScreenshotAs(OutputType.FILE);
	// creatr obj
	File filed=new File("D://sample.png");
	// filehandler
	FileHandler.copy(source, filed);
	
	
	
	}

}
