package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Button {
	public static void main(String[] args) throws InterruptedException {
		//initialize web driver
		WebDriver Driver=new EdgeDriver();
		Driver.get("https://www.leafground.com/");
		Driver.manage().window().maximize();
		Driver.findElement(By.id("menuform:j_idt40")).click();
		Driver.findElement(By.xpath("//*[@id=\"menuform:m_button\"]/a/span")).click();
		Thread.sleep(1000);
		WebElement cli=Driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt90\"]/span"));
		cli.click();
		String title=Driver.getTitle();
		System.out.println("Title of the page " + title);
		
		//repeat menu click
		Driver.findElement(By.id("menuform:j_idt40")).click();
		Driver.findElement(By.xpath("//*[@id=\"menuform:m_button\"]/a/span")).click();
		
		// get the xy position
		WebElement findposi=Driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[2]"));
		Point xypoint=findposi.getLocation();
		int x=xypoint.getX();
		int y=xypoint.getY();
		System.out.println("X value is ="+ x + "Y value is = "+ y);
		
		WebElement height=Driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]"));
		Dimension hi=height.getSize();
		int x1=hi.getHeight();
		int y1=hi.getWidth();
		System.out.println("1h "+ x1    + "  1w "   + y1);
		
		
		WebElement colour=Driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt100\"]/span"));
String checkcolo=colour.getCssValue("background-color: rgb(104, 159, 56);");

System.out.println(checkcolo);
Driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt102:imageBtn\"]/span")).click();
}
}
