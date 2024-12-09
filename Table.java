package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Table {
	public static void main(String[]args) {
		WebDriver Driver=new EdgeDriver();
		Driver.get("https://www.leafground.com/table.xhtml");
		Driver.manage().window().maximize();
		
		List<WebElement> colums=Driver.findElements(By.tagName("th"));
		
		int size=colums.size();// colums . size will give u a num of columns
		System.out.println("Number of columns :"  + size);
		
		List<WebElement> Rows=Driver.findElements(By.tagName("tr"));
		int Rowssize=Rows.size();// rows.size will give u a number of rows
		System.out.println("Number of Rows  :"  + Rowssize);
		
		
		String txt=Driver.findElement(By.xpath("//*[@id=\"form:j_idt89_head\"]/tr")).getText();
		System.out.println(txt);
		
		
		String txt2=Driver.findElement(By.xpath("//*[@id=\"form:j_idt89_data\"]/tr[2]")).getText();
		System.out.println(txt2);
	}

}
