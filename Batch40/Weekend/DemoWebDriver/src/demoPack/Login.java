package demoPack;


import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Login {

	public static void main(String[] args) throws InterruptedException, IOException  {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");	
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//a[@href='/tasks/otasklist.do']")).click();
		//driver.findElement(By.linkText("Logout")).click();
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType<.png>.ss);
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//org.apache.commons.io.FileUtils.copyFile(scrFile, "D:\\screenshot.png");
		FileUtils.copyFile(scrFile, new File("C:\\ss\\screenshot1.png"));
	}

}
