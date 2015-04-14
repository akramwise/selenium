package com.mindq.actitime.libraries;

import org.testng.Assert;

public class Assertions {
	public static void verifyTitle(String actualTitle, String expectedTitle, String Msg){
		Assert.assertEquals(actualTitle, expectedTitle);
		  System.out.println(Msg);
	}
	public static void verifyText(String actualText, String expectedText, String Msg){
		Assert.assertEquals(actualText, expectedText);
		  System.out.println(Msg);
	}
}
