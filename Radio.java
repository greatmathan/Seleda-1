package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Radio {
	
	public static void main(String[] args) throws InterruptedException {
		//initialize web driver
		WebDriver Driver=new EdgeDriver();
		Driver.get("https://www.leafground.com/");
		Driver.manage().window().maximize();
		Driver.findElement(By.id("menuform:j_idt40")).click();
		
		Driver.findElement(By.xpath("//*[@id=\"menuform:m_radio\"]/a/span")).click();

	Driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/div/div[2]")).click();
	
	WebElement unched=Driver.findElement(By.xpath("//*[@id=\"j_idt87:city2\"]/div/div[1]/label"));
	unched.click();
	boolean ch=unched.isEnabled();
	System.out.println(ch);
	
	Driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[1]/div/div[2]")).click();
	
	
	
	
	}}
