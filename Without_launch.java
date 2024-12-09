package selenium;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Without_launch {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		//initialize web driver
		WebDriver Driver=new EdgeDriver();
		Driver.get("https://www.leafground.com/");
		//Driver.manage().window().maximize();
		
	
	
	}
}
