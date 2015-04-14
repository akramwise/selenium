package demoPack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoNewBrowser {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Tourist Train")).click();
		Set<String> allWindows=driver.getWindowHandles();
		Iterator<String> it=allWindows.iterator();
		String irctc=it.next();
		String tourist=it.next();
		System.out.println(irctc);
		System.out.println(tourist);
		driver.switchTo().window(tourist);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.close();
		driver.switchTo().window(irctc);
		driver.findElement(By.id("usernameId")).sendKeys("prathap");
		
		
		

	}

}
