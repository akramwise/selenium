package testngpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Customers {
  @BeforeClass
  public void openBrowser() {
	  System.out.println("openBrowser");
  }
  @BeforeMethod
  public void Login() {
	  System.out.println("Login");
  }
  @AfterMethod
  public void Logout() {
	  System.out.println("Logout");
  }
  @AfterClass
  public void closeBrowser() {
	  System.out.println("closeBrowser");
  }
  @Test
  public void createCustomer() {
	  System.out.println("Create Customer");
  }
  @Test
  public void editCustomer() {
	  System.out.println("edit Customer");
  }
  @Test
  public void deleteCustomer() {
	  System.out.println("delete Customer");
  }

}
