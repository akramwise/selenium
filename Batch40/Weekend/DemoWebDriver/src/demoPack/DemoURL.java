package demoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoURL {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");	
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(10000);
		String expectedURL="http://demo.actitime.com/user/submit_tt.do";
		String actualURL=driver.getCurrentUrl();
		if (actualURL.equals(expectedURL)) {
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}
	}

}
