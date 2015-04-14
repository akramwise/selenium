package demoPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSingleSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Prathap/Batch40/example.html");
		WebElement singleSelect=driver.findElement(By.name("city"));
		Select dd=new Select(singleSelect);
		dd.selectByIndex(1);
		Thread.sleep(3000);
		dd.selectByValue("4");
		Thread.sleep(3000);
		dd.selectByVisibleText("Mumbai");
		
		List<WebElement> allOptions=dd.getOptions();
		int si=allOptions.size();
		System.out.println(si);
		for (int i = 0; i < si; i++) {
			WebElement option=allOptions.get(i);
			String te=option.getText();
			System.out.println(te);
		}
	}

}
