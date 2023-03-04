package com.obsqura.TestNGProject;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButton extends Base {
	@Test
	public void radioButtonDemo() {
		SelectCategory findElementObject=new SelectCategory(driver);
		findElementObject.findElementByList("Radio Buttons Demo");
		WebElement radioButtonFemale=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		radioButtonFemale.click();
		boolean isRadioButtonFemaleisSelected=radioButtonFemale.isSelected();
		assertTrue(isRadioButtonFemaleisSelected,"Radio Button Female is not selected");
		WebElement radioButtonMale=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		radioButtonMale.click();
		//radioButtonMale.isSelected();
	}

}
