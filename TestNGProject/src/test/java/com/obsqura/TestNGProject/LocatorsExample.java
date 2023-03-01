package com.obsqura.TestNGProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorsExample extends Base {
	@Test
	public void byId() {
	driver.findElement(By.id("twotabsearchtextbox")); //0.277s 1
	}
	@Test
	public void byName() {
		driver.findElement(By.name("field-keywords"));  //0.175s 2
	}
	
	@Test
	public void byTagName() {
		driver.findElement(By.tagName("input"));  //0.124s
	}
	@Test
	public void byCssSelectorTagAndId() {
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));  //0.683s 
	}
	
	@Test
	public void byCssSelectorTagAndAttribute() {
		driver.findElement(By.cssSelector("input[type=text]"));	//0.252s 3
	}
	@Test
	public void byXPath() {
		driver.findElement(By.xpath("//input[@type='text']"));  //0.253s 4
	}
	
}
