package com.mindq.actitime.tasks;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.mindq.actitime.libraries.BaseClass;

public class CreateCustomer extends BaseClass{
  @Test
  public void testCreateCustomer() {
	  plib.navigateToProjects(driver);
	  driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
	  String custName=xlib.getExcelData("CreateCustomer", 1, 0);
	  String desc=xlib.getExcelData("CreateCustomer", 1, 1);
	  driver.findElement(By.id("customerLightBox_nameField")).sendKeys(custName);
	  driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys(desc);
	  driver.findElement(By.xpath("(//span[text()='Create Customer'])[1]")).click();
  }

}
