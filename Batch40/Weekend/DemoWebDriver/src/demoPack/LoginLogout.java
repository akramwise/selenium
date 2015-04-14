package demoPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogout {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		ExcelLibrary xlib=new ExcelLibrary();
		int si=xlib.getRowNum("Sheet1");
		System.out.println(si);
		for (int i = 1; i <=si; i++) {
		String un=xlib.getExcelData("Sheet1", i, 0);
		String pw=xlib.getExcelData("Sheet1", i, 1);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);	
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		}
		
		
		
		

	}

}
