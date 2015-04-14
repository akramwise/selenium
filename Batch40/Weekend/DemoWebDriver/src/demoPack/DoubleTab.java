package demoPack;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class DoubleTab {

public static void main(String args[]) throws Exception{



			WebDriver driver = new FirefoxDriver();
			driver.get("http://demo.actitime.com");
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			
			
			
			Thread.sleep(5000);
			
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);
			
			Thread.sleep(5000);
			driver.get("http://facebook.com");
			
			Thread.sleep(5000);
			
			

		}

}
