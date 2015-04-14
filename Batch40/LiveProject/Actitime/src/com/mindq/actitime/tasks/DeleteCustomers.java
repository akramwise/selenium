package com.mindq.actitime.tasks;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.mindq.actitime.libraries.BaseClass;
import com.mindq.actitime.libraries.ProjectSpecificLibrary;

public class DeleteCustomers extends BaseClass{
  @Test
  public void testDeleteCustomer() {
	  
	  plib.navigateToProjects(driver);
	  String custName=xlib.getExcelData("DeleteCustomer", 1, 0);
	  driver.findElement(By.linkText(custName)).click();
	  driver.findElement(By.xpath("//span[text()='Delete Customer']")).click();
	  driver.findElement(By.xpath("//input[@value='Delete Customer']")).click();
	  
  }
}
