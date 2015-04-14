package demoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoRadio {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Prathap/Batch40/example.html");
		boolean radioStatus=driver.findElement(By.id("male")).isSelected();
		System.out.println(radioStatus);
		driver.findElement(By.id("male")).click();
		boolean radioStatus1=driver.findElement(By.id("male")).isSelected();
		System.out.println(radioStatus1);
		driver.findElement(By.id("male")).click();
		boolean radioStatus2=driver.findElement(By.id("male")).isSelected();
		System.out.println(radioStatus2);
	}

}
