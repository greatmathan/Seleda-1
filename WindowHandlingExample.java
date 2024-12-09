package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandlingExample {
	public static void main(String[] args) {
		
		WebDriver Driver=new EdgeDriver();
		Driver.get("https://www.leafground.com/window.xhtml");
		Driver.manage().window().maximize();

		String oldwindow=Driver.getWindowHandle();
		System.out.println("oldwindow id : "+oldwindow);

		Driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span")).click();
		
		Set<String>hand=Driver.getWindowHandles();
		
		for (String newwindows : hand) {
			Driver.switchTo().window(newwindows);
		}
		Driver.close();
		
		// second window connect
		Driver.switchTo().window(oldwindow);
		Driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span")).click();
		
	int count=	Driver.getWindowHandles().size();
       System.out.println(count);
       
       // click all button 

		WebElement Closeallw=Driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
		Closeallw.click();
		WebElement Closealltab=Driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]/span"));
		Closealltab.click();
		
		// Connecting parent window
		Set<String>handy=Driver.getWindowHandles();
		for (String mobile : handy) {
			if(mobile.equals(oldwindow));
			Driver.switchTo().window(oldwindow);
			Driver.close();
		}}
		
		
		
		
		
		
		
		
	}


