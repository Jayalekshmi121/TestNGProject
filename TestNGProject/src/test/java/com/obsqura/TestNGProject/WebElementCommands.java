package com.obsqura.TestNGProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementCommands extends Base {
	@Test
	public void sendKeys() {
		WebElement searchbar=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbar.sendKeys("iphone");		
	}
	@Test
	public void sendKeysObsqura() {
		String inputMessage="Hello";
		String expectedMessage="Your Message : "+inputMessage;
		WebElement formMessage=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		formMessage.sendKeys(inputMessage);
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		WebElement yourMessage=driver.findElement(By.cssSelector("div#message-one"));
		String yourMessageText=yourMessage.getText();
		assertEquals(expectedMessage,yourMessageText,"Message not same");	
	}
	@Test
	public void singleInputField() {
		String expectedInput="Single Input Field";
		WebElement singleInput=driver.findElement(By.xpath("(//div[@class='card-header'])[2]"));
		String inputField=singleInput.getText();
		assertEquals(expectedInput,inputField,"Input field not same");
		
	}
	@Test
	public void showButton() 
	{
		String expectedbutton="Show Message";
		WebElement showMessage=driver.findElement(By.cssSelector("button#button-one"));
		String showMessageInput=showMessage.getText();
		assertEquals(expectedbutton,showMessageInput,"Button text is not show message");
	}
	@Test
	public void inputField()
	{
		String inputMessage="Hello";
		WebElement singleinputfieldTextBox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		boolean issingleinputfieldTextBoxDisplayed=singleinputfieldTextBox.isDisplayed();
		assertTrue(issingleinputfieldTextBoxDisplayed);
		singleinputfieldTextBox.sendKeys(inputMessage);
		singleinputfieldTextBox.clear();
		String tagName=singleinputfieldTextBox.getTagName();
		String placeHolder=singleinputfieldTextBox.getAttribute("placeholder");
		String className=singleinputfieldTextBox.getAttribute("class");
		WebElement showMessagebutton=driver.findElement(By.cssSelector("button#button-one"));
		String showMessageBackgroundColor=showMessagebutton.getCssValue("background-color");
		Point location=showMessagebutton.getLocation();
		int showMessageButtonX=location.getX();
		int showMessageButtonY=location.getY();
		Dimension showMessagebuttonDimension=showMessagebutton.getSize();
		int width=showMessagebuttonDimension.getWidth();
		int height=showMessagebuttonDimension.getHeight();
	}
	@Test
	public void verifyAlligmentOfGettotalButtonAndTexboxValueB()
	{
		WebElement getTotalButton=driver.findElement(By.cssSelector("button#button-two"));
		Point locationGetTotalButton=getTotalButton.getLocation();
		int getTotalButtonX=locationGetTotalButton.getX();
		int getTotalButtonY=locationGetTotalButton.getY();
		WebElement TexboxValueB=driver.findElement(By.cssSelector("input#value-b"));
		Point locationTexboxValueB=TexboxValueB.getLocation();
		int TexboxValueBX=locationTexboxValueB.getX();
		int TexboxValueBY=locationTexboxValueB.getY();
		boolean greaterComparison=(getTotalButtonY>TexboxValueBY);
		assertTrue(greaterComparison,"Get Total Button is not alligned below Texbox value B");
	}
	@Test
	public void fontColor()
	{
		String expectedColor="rgba(255, 255, 255, 1)";
		WebElement showMessage=driver.findElement(By.cssSelector("button#button-one"));
		String showMessageColor=showMessage.getCssValue("color");
		assertEquals(expectedColor,showMessageColor,"Color not equal");
	}
	@Test
	public void fontweight()
	{
		String expectedweight="400";
		WebElement showMessage=driver.findElement(By.cssSelector("button#button-one"));
		String showMessageFontWeight=showMessage.getCssValue("font-weight");
		assertEquals(expectedweight,showMessageFontWeight,"Weight not same");
	}
	@Test
	public void shoeMessageShape()
	{
		String expectedShape="4px";
		WebElement showMessage=driver.findElement(By.cssSelector("button#button-one"));
		String showMessageButtonShape=showMessage.getCssValue("border-radius");
		assertEquals(expectedShape,showMessageButtonShape,"Shape not Oval");
	}
	@Test
	public void backgroundColorGetTotalButton()
	{
		String expectedGetButtonBckgrndColor="rgba(0, 123, 255, 1)";
		WebElement getTotalButton=driver.findElement(By.cssSelector("button#button-two"));
		String getTotalButtonBackgroundColor=getTotalButton.getCssValue("background-color");
		assertEquals(expectedGetButtonBckgrndColor,getTotalButtonBackgroundColor,"Background Color not equal");
	}
	@Test
	public void twoInputField()
	{
		int inputValueA=60;
		int inputValueB=40;
		int sum=100;
		String expectedOutputObtained="Total A + B : "+sum;
		WebElement enterValueAfield=driver.findElement(By.cssSelector("input#value-a"));
		boolean isvalueAFieldDisplayed=enterValueAfield.isDisplayed();
		assertTrue(isvalueAFieldDisplayed,"Value A Field not displayed");
		boolean isvalueAFieldEnabled=enterValueAfield.isEnabled();
		assertTrue(isvalueAFieldEnabled,"Value A Field not enabled");
		enterValueAfield.sendKeys(Integer.toString(inputValueA));
		WebElement enterValueBfield=driver.findElement(By.cssSelector("input#value-b"));
		boolean isvalueBFieldDisplayed=enterValueBfield.isDisplayed();
		assertTrue(isvalueBFieldDisplayed,"Value B Field not displayed");
		boolean isvalueBFieldEnabled=enterValueBfield.isEnabled();
		assertTrue(isvalueBFieldEnabled,"Value B Field not enabled");
		enterValueBfield.sendKeys(Integer.toString(inputValueB));
		WebElement getTotalButton=driver.findElement(By.cssSelector("button#button-two"));
		boolean isgetTotalButtonEnabled=getTotalButton.isEnabled();
		assertTrue(isgetTotalButtonEnabled,"Get Total Button is not Enabled");
		getTotalButton.click();
		WebElement totalValueField=driver.findElement(By.cssSelector("div#message-two"));
		String actualoutputObtained=totalValueField.getText();
		assertEquals(expectedOutputObtained,actualoutputObtained,"Output obtained not same");
	}
}
