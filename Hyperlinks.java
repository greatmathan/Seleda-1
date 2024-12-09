package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Hyperlinks {
	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver=new EdgeDriver();
		//Dashboard
		Driver.get("https://www.leafground.com/dashboard.xhtml");
		// click element
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a")).click();
		//click hyper link
		Driver.findElement(By.xpath("//*[@id=\"menuform:m_link\"]/a/span")).click();
		
		Driver.manage().window().maximize();
		
		Driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/a")).click();
		Driver.navigate().back();
		
		WebElement where=Driver.findElement(By.partialLinkText("Find the URL without clicking me."));
		String we=where.getAttribute("href");
		System.out.println(we);
		
		WebElement broken=Driver.findElement(By.partialLinkText("Broken?"));
		broken.click();
		
		String tit=Driver.getTitle();
		
		if(tit.contains("404")) {
			System.out.println(" Test passed HTTP ERROR 404 /lists.xhtml Not Found in ExternalContext as a Resource");
		}else {
			System.out.println("Test failed");
		}
		Driver.navigate().back();
		
		List<WebElement>totallist=Driver.findElements(By.tagName("</a>"));
		int size=totallist.size();
		System.out.println(size);
		
		
	}

}
