package demoPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoConfirmation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");	
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//a[@href='/tasks/otasklist.do']")).click();
		driver.findElement(By.xpath("//div[@id='ext-comp-1016']/span")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//input[@placeholder='Enter task name'])[1]")).sendKeys("prathap");
		driver.findElement(By.xpath("//div[@id='createTasksPopup_cancelBtn']")).click();
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='ext-comp-1016']/span")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//input[@placeholder='Enter task name'])[1]")).sendKeys("prathap");
		driver.findElement(By.xpath("//div[@id='createTasksPopup_cancelBtn']")).click();
		Thread.sleep(3000);
		String conText=alt.getText();
		System.out.println(conText);
		alt.dismiss();
		
	}

}
