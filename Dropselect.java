package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Dropselect {

	public static void main(String[] args) throws InterruptedException {
		//initialize web driver
		WebDriver Driver=new EdgeDriver();
		Driver.get("https://www.leafground.com/");
		Driver.manage().window().maximize();
		Driver.findElement(By.id("menuform:j_idt40")).click();
		Driver.findElement(By.xpath("//*[@id=\"menuform:m_dropdown\"]/a")).click();
		
		
			
		
	}

}
