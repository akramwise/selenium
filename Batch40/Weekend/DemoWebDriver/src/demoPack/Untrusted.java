package demoPack	 	 
;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Untrusted {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Prathap\\Batch40\\Weekend\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://gmail.com");
		
		//WebElement composeButton = driver.findElement(By.id("overridelink"));
		   //composeButton.click();
		//driver.navigate().to("javascript:document.getElementBy.Id('overridelink').click();");
		//http://selenium.googlecode.com/git/docs/api/java/index.html     java script excecutor
		
		//driver.close();
		/*WebElement element = driver.findElement(By.id("overridelink"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);*/
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('overridelink').click();");

	}

}