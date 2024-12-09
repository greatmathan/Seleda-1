package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Window {

	public static void main(String[] args) throws InterruptedException {
		//initialize web driver
		WebDriver Driver=new EdgeDriver();
		Driver.get("https://www.leafground.com/window.xhtml");
		Driver.manage().window().maximize();
		//vinzat@gmailcom   //vinzat@gmailcom
		//winclicking purpose use this method
		String oldwindow=Driver.getWindowHandle();
		System.out.println("oldwindow id : "+oldwindow);

		Driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span")).click();


		// this method is use for focus to next win
		Set<String> handles=Driver.getWindowHandles();

		for (String newwindows : handles) {
			Driver.switchTo().window(newwindows);

		}//check for commit change
		Driver.close();
		// second window Switch to oldwindow
		Driver.switchTo().window(oldwindow);
		Driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span")).click();

		int count=Driver.getWindowHandles().size();
		System.out.println(count);


		WebElement Closeallw=Driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
		Closeallw.click();
		WebElement Closealltab=Driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]/span"));
		Closealltab.click();

		// This try for a without parrent window all window close
		Set<String>newwindowhandleso=Driver.getWindowHandles();
		for (String Allwin : newwindowhandleso) {
			if(!Allwin.equals(oldwindow)) {
				Driver.switchTo().window(Allwin);
				Driver.close();// this method use for current open win close

			}


		}
		Driver.quit();// this method is use for opend all window close







	}}
