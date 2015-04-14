package demoPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoToolTip {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gsmarena.com/samsung-phones-9.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String tooltext=driver.findElement(By.xpath
				("//img[@src='http://cdn2.gsmarena.com/vv/thumb/samsung-z-1.jpg']")).
				getAttribute("title");
		System.out.println(tooltext);
	}

}
