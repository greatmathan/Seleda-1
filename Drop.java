package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {

	
	
	public static void main(String[] args) throws InterruptedException {
		//initialize web driver
		WebDriver Driver=new EdgeDriver();
		Driver.get("https://www.leafground.com/");
		Driver.manage().window().maximize();
		Driver.findElement(By.id("menuform:j_idt40")).click();

		
		//Drop Down Syntax : 
	Driver.findElement(By.xpath("//*[@id=\"menuform:m_dropdown\"]/a/span")).click();
	WebElement Drop=Driver.findElement(By.xpath("//select[@class=\"ui-selectonemenu\"]"));
	Select select=new Select(Drop);
	select.selectByIndex(1);
	Thread.sleep(1000);
	
	
	select.selectByVisibleText("Puppeteer ");
	List <WebElement>list=select.getOptions();
	int s=list.size();
	System.out.println(s);
	
//	WebElement Drop1=Driver.findElement(By.xpath("//*[@id=\"j_idt87:country_label\"]"));
//	Select country=new Select(Drop1);
//	country.selectByIndex(2);
	
	// multi select
	/*Thread.sleep(2000);
	WebElement Multi=Driver.findElement(By.xpath("//div[@id=\"j_idt87:auto-complete\"]"));
	Select Multi1=new Select(Multi);
	Multi1.selectByIndex(1);
	Multi1.selectByIndex(2);
	Multi1.selectByIndex(3);*/
	
	}}
