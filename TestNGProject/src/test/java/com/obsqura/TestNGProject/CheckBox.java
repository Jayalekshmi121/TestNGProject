package com.obsqura.TestNGProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBox extends Base {
	@Test
	public void checkBoxDemo() 
	{
		SelectCategory findElementObject=new SelectCategory(driver);
		findElementObject.findElementByList("Checkbox Demo");
		WebElement clickOnthisCheckBox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		clickOnthisCheckBox.click();
	}

}
