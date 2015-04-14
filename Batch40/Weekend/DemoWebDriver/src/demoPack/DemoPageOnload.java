package demoPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoPageOnload {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://username:password@mybeats.texhmahindra.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

	}

}
