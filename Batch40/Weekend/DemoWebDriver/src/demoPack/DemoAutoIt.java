package demoPack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAutoIt {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Prathap/Batch40/example.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("brow")).click();		
		Process P = Runtime.getRuntime().exec("C:\\Prathap\\Batch40\\Weekend\\DemoWebDriver\\autoexam.exe");

	}

}
