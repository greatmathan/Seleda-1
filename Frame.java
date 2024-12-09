package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frame {
	public static void main(String[] args) {
		WebDriver  Driver=new EdgeDriver();
		Driver.get("https://www.leafground.com/frame.xhtml;jsessionid=node0192ndbyprf4o813oe33ewh53807793881.node0");
		Driver.manage().window().maximize();
		//i frame 
		Driver.switchTo().frame(0);
		WebElement click=Driver.findElement(By.id("Click"));
		click.click();
		String txt=click.getText();
		System.out.println(txt);
		// this is use for this one
		Driver.switchTo().defaultContent();
		
	/*	// second frame
		Driver.switchTo().frame(0);
		Driver.switchTo().frame("frame2");
		WebElement Click1=Driver.findElement(By.xpath("//*[@id=\"Click\"]"));
		Click1.click(); */
		
		Driver.switchTo().defaultContent();// already we gone to one frame return 
		//                                   we want to back the frame we use this
		
		List<WebElement> totalsize=Driver.findElements(By.tagName("iframe"));
		int size=totalsize.size();
		System.out.println(size);
		
		
		
	}

}
