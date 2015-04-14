package demoPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAllCheck {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gsmarena.com/samsung-phones-9.php");
		List<WebElement> allCheck=driver.findElements(By.xpath("//input[@type='Checkbox']"));
		for (int i = 0; i < allCheck.size(); i++) {
			WebElement check=allCheck.get(i);
			check.click();
		}
	}

}
