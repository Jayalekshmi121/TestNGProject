package com.obsqura.TestNGProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindElementList extends Base {
	@Test
	public void findElementByList()
	{
		List<WebElement> inputFormCategories=driver.findElements(By.xpath("//li[@class='list-group-item']"));
		inputFormCategories.size();
	}

}
