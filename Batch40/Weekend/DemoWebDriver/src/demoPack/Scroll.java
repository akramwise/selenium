package demoPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");	
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//a[@href='/tasks/otasklist.do']")).click();
		
		
		//scroll
		JavascriptExecutor jse = (JavascriptExecutor)driver; jse.executeScript("window.scrollBy(0,500)", "");

	}

}
