package demoPack;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoCheck {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Prathap/Batch40/example.html");
		boolean chkBoxStatus=driver.findElement(By.name("rep")).isSelected();
		System.out.println(chkBoxStatus);
		driver.findElement(By.name("rep")).click();
		boolean chkBoxStatus1=driver.findElement(By.name("rep")).isSelected();
		System.out.println(chkBoxStatus1);
		driver.findElement(By.name("rep")).click();
		boolean chkBoxStatus2=driver.findElement(By.name("rep")).isSelected();
		System.out.println(chkBoxStatus2);
	}

}
