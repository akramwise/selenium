package demoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DemoFileDownload {

	public static void main(String[] args) {
		FirefoxProfile prof=new FirefoxProfile();
		prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		prof.setPreference("browser.download.folderList", 2);
		prof.setPreference("browser.download.dir", "C:\\Prathap\\Batch40\\Weekend");
		// common for each case
		WebDriver driver=new FirefoxDriver(prof);
		driver.get("http://docs.seleniumhq.org/download/");
		driver.findElement(By.xpath("//a[@href='http://selenium-release.storage.googleapis.com/2.44/selenium-java-2.44.0.zip']")).click();
		

	}

}
