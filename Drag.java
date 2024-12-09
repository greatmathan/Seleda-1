package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
	public static void main(String[] args) {
		WebDriver Driver=new EdgeDriver();
		Driver.get("https://www.leafground.com/drag.xhtml");
		Driver.manage().window().maximize();
		
		
		WebElement from=Driver.findElement(By.id("form:conpnl_header"));
		WebElement To=Driver.findElement(By.xpath("//*[@id=\"form:restrictPanel\"]/div"));
	
	Actions action=new Actions(Driver);
	//action.clickAndHold(from).moveToElement(To).release(To).build().perform();
	action.dragAndDrop(from, To).build().perform();
	
	WebElement check=Driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[1]/div[1]/h4"));
	String txt=check.getText();
	System.out.println(txt);
	
	
	}

}
