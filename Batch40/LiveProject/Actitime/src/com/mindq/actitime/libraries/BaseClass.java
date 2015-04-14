package com.mindq.actitime.libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
	public WebDriver driver;
	public ExcelLibrary xlib;
	public ProjectSpecificLibrary plib;
	  @BeforeClass
	  public void openUrl() {
		  xlib=new ExcelLibrary();
		  String browName=xlib.getExcelData("Browser", 1, 0);
		  if (browName.equals("firefox")) {
			  driver=new FirefoxDriver();
		  }else if (browName.equals("chrome")) {
			  System.setProperty("webdriver.chrome.driver", "../Jars/chromedriver.exe");
			  driver=new ChromeDriver();
		  }else if (browName.equals("ie")) {
			  System.setProperty("webdriver.ie.driver", "../Jars/IEDriverServer.exe");
			  driver=new InternetExplorerDriver();
		  }
		  
		  driver.manage().window().maximize();
		  driver.get("http://demo.actitime.com");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  plib=new ProjectSpecificLibrary();
		  String expectedTitle="actiTIME - Login";
		  String actualTitle=driver.getTitle();
		  Assertions.verifyTitle(actualTitle, expectedTitle, "Title Success");
		  
	  }
	  @BeforeMethod
	  public void login() {
		  
		  String un=xlib.getExcelData("Login", 1, 0);
		  String pw=xlib.getExcelData("Login", 1, 1);
		  driver.findElement(By.id("username")).sendKeys(un);
		  driver.findElement(By.name("pwd")).sendKeys(pw);
		  driver.findElement(By.id("loginButton")).click();
		  
		  String expectedText="Enter Time-Track";
		  String actualText=driver.findElement(By.xpath("(//td[@class='pagetitle'])[1]")).getText();
		  Assertions.verifyText(actualText, expectedText, "Text Success");
	  }
	  @AfterMethod
	  public void logout() {
		  driver.findElement(By.linkText("Logout")).click();
	  }
	  @AfterClass
	  public void quitURl() {
		  driver.quit();
	  }
}
