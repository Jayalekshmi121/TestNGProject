package com.obsqura.TestNGProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectInput extends Base {
	@Test
	public void selectInputDemo() 
	{
		String inputColor="Green";
		String expectedColor="Selected Color : "+inputColor;
		SelectCategory findElementObject=new SelectCategory(driver);
		findElementObject.findElementByList("Select Input");
		WebElement selectColor=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select selectobject=new Select(selectColor);
		selectobject.selectByIndex(2);
		//String actualColor=selectobject.selectByIndex(3);
		
	}

}
