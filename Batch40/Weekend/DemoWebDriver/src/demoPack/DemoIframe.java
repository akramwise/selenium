package demoPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoIframe {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/anoosh.OPENPEAK/Downloads/frames.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement frm=driver.findElement(By.xpath("//frame[@src='second.html']"));
		driver.switchTo().frame(frm);
		driver.findElement(By.xpath("//input[@name='name1']")).sendKeys("prathap");
		driver.switchTo().defaultContent();
		
		
		
		

	}

}
