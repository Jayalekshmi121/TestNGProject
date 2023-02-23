package com.obsqura.TestNGProject;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class PageSourceCommand extends Base {
	@Test
	public void getPageSourceCommand() {
		String actualpageSource="window.ue_ihb = (window.ue_ihb || window.ueinit";
		String pageSource=driver.getPageSource();
		assertTrue(pageSource.contains(actualpageSource),"Page source not found");		
	}

}
