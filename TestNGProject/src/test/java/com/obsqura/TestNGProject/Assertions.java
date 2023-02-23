package com.obsqura.TestNGProject;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;


import org.testng.annotations.Test;

public class Assertions extends Base{
	@Test
	public void getUrlCommand() {
		String expectedUrl ="https://www.flipkart.com/";
		String actualUrl=driver.getCurrentUrl();
		String verifyAssertNull=null;
		String actualpageSource="Myntra";
		String pageSource=driver.getPageSource();
		String verifyAssertNotNull="Apple";
		assertNotEquals(expectedUrl,actualUrl,"Navigated to flipkart");
		assertNull(verifyAssertNull);
		assertFalse(pageSource.contains(actualpageSource),"Substring Mynthra found");
		assertNotNull(verifyAssertNotNull);
	}
	

}
