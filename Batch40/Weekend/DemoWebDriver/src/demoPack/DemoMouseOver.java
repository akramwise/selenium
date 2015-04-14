package demoPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoMouseOver {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://recw.ac.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		WebElement about=driver.findElement(By.xpath("//span[text()='About']"));
		act.moveToElement(about).perform();
		act.contextClick(about).perform();
		//act.sendKeys(Keys.ARROW_DOWN).perform();
		//act.sendKeys(Keys.ENTER).perform();
		act.sendKeys("T").perform();
		
	}

}
