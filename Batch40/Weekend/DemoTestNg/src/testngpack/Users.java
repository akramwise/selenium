package testngpack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Users {
  @Test
  public void createUsers() {
	  System.out.println("Create Users");
  }
  @Test
  public void editUsers() {
	  System.out.println("edit Users");
	  String actual="abcd";
	  String expected="abcd";
	  Assert.assertEquals(actual, expected);
	  System.out.println("success");
  }
  @Test(dependsOnMethods={"editUsers"})
  public void deleteUsers() {
	  System.out.println("delete Users");
  }
}
