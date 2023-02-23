package com.obsqura.TestNGProject;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class GetUrlCommand extends Base{
	@Test
	public void getUrlCommand() {
		
		String expectedUrl ="https://www.amazon.in/";
		String actualUrl=driver.getCurrentUrl();
		assertEquals(expectedUrl,actualUrl,"Url not same");
	}

}
