package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {
	public static void main(String[] args) throws InterruptedException {
		//initialize web driver
		WebDriver Driver=new EdgeDriver();
		Driver.get("https://www.leafground.com/");
		Driver.manage().window().maximize();
		Driver.findElement(By.id("menuform:j_idt40")).click();
		Driver.findElement(By.xpath("//*[@id=\"menuform:m_checkbox\"]/a/span")).click();
		
		Driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/span")).click();
		
		Driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]/div/div[2]")).click();
		
		Boolean enab=Driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102\"]")).isEnabled();
		System.out.println(enab);
		
		
		WebElement ck=Driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple\"]/ul"));
		ck.click();
		Driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple\"]/ul/li[1]/span[2]")).click();
		
		
		
	}
}
