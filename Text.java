package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Text {
	public static void main(String[] args) throws InterruptedException {
		//initialize web driver
		WebDriver Driver=new EdgeDriver();
		Driver.get("https://www.leafground.com/");
		Driver.manage().window().maximize();
		Driver.findElement(By.id("menuform:j_idt40")).click();
		Driver.findElement(By.xpath("//*[@id=\"menuform:m_input\"]")).click();
		Driver.findElement(By.id("j_idt88:name")).sendKeys("mathan");
		Driver.findElement(By.id("j_idt88:j_idt91")).clear();
		Driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("Coimbatore");
		boolean one=Driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
		System.out.println(one);
		String two=Driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
		System.out.println(two);
		Driver.findElement(By.id("j_idt88:j_idt95")).clear();
		Driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("test@gmail.com",Keys.TAB);
		Driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("Do another task field");
		
		Driver.findElement(By.id("j_idt106:thisform:age")).sendKeys("gvjsvjscjhsjc");
	Driver.findElement(By.id("j_idt106:float-input")).sendKeys("ascvjsacjascj");
	Thread.sleep(1000);
	Driver.findElement(By.id("j_idt106:auto-complete_input")).sendKeys("shchaabhb");
	Driver.findElement(By.id("j_idt106:j_idt116_input")).click();
	// pending dob click
	}
}
