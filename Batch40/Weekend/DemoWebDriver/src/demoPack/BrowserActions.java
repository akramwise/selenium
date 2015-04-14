package demoPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		//driver.get("http://docs.seleniumhq.org/");
		// alternate of driver.get()
		driver.navigate().to("http://docs.seleniumhq.org/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit .SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.linkText("Download")).click();
		Thread.sleep(5000);
		// simulate browser back button
		driver.navigate().back();
		Thread.sleep(5000);
		//simulate browser forward button
		driver.navigate().forward();
		Thread.sleep(5000);
		//refresh the page
		driver.navigate().refresh();
		//to close the browser
		driver.close();
	}

}
