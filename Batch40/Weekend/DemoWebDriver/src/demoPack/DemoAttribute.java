package demoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAttribute {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Prathap/Batch40/example.html");
		String lite=driver.findElement(By.xpath("//a[text()='Google ']")).getAttribute("href");
		System.out.println(lite);
	}

}
