package com.obsqura.TestNGProject;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NavigateCommand extends Base {
	@Test
	public void navigateUrl() {
		String expectedUrl="https://www.flipkart.com/";
		String expectedUrl1="https://www.amazon.com/";
		driver.navigate().to("https://www.flipkart.com/");
		String actualUrl=driver.getCurrentUrl();
		assertEquals(expectedUrl,actualUrl,"Url not same");
		driver.navigate().back();
		String actualUrl1=driver.getCurrentUrl();
		assertEquals(expectedUrl1,actualUrl1,"Url not the same");
	}
	@Test
	public void softAssertCommands() {
		String expectedUrl="https://www.flipkart.com/com";
		driver.navigate().to("https://www.flipkart.com/");
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl1="https://www.amazon.com/";
		String actualUrl1=driver.getCurrentUrl();
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(expectedUrl,actualUrl,"Url not same");
		softAssert.assertEquals(expectedUrl1,actualUrl1,"Url not the same");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		softAssert.assertAll();
	}

}
