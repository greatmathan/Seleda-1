package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Downloadfile {
	public static void main(String[] args) {


		WebDriver Driver=new EdgeDriver();
		Driver.get("https://www.leafground.com/file.xhtml");
		Driver.manage().window().maximize();
		//D:\Userfiles\Downloads

		WebElement Downloadlink=Driver.findElement(By.xpath("//*[@id=\"j_idt93:j_idt95\"]/span[2]"));
		Downloadlink.click();
		
		// download operations
				File filelocation=new File("D:\\Userfiles\\Downloads");
				File[] totalfile=filelocation.listFiles();
				
				
				for (File file : totalfile) {
					
					if(file.getName().equals("TestLeaf Logo.png")) {
						System.out.println("File is downloaded: ");
						break;
					}

	}}
}