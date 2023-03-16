package com.obsqura.TestNGProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Locators extends Base{
	@Test
	public void locatorsById() 
	{
		driver.findElement(By.id("twotabsearchtextbox"));
		driver.findElement(By.id("nav-search-submit-button"));
		driver.findElement(By.id("nav-hamburger-menu"));
		driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		driver.findElement(By.id("nav-logo-sprites"));
		driver.navigate().to("https://www.amazon.com/s?k=toys&s=date-desc-rank&pd_rd_r=51016615-90c0-4b39-bd6b-047e2913c459&pd_rd_w=I37pe&pd_rd_wg=9DT6z&pf_rd_p=779cadfb-bc4d-465d-931f-0b68c1ba5cd5&pf_rd_r=SXPE4KMAS4YE08CB1832&qid=1632870778&ref=pd_gw_unk");
		driver.findElement(By.id("p_lbr_characters_browse-bin-title"));
		driver.findElement(By.id("nav-xshop"));
		driver.findElement(By.id("p_lbr_characters_browse-bin/Marvel"));
		driver.findElement(By.id("p_lbr_characters_browse-bin/Barbie"));
		driver.findElement(By.id("p_36/1253561011"));
	}
	@Test
	public void locatorsByName() {
		driver.findElement(By.name("glow-validation-token"));
		driver.findElement(By.name("dropdown-selection-ubb"));
		driver.navigate().to("https://www.amazon.com/s?k=gaming+keyboard&pd_rd_r=ccfa7183-cf10-4d48-b0ad-c71529d5c49e&pd_rd_w=B9ieM&pd_rd_wg=o8cua&pf_rd_p=12129333-2117-4490-9c17-6d31baf0582a&pf_rd_r=34Q1GWT4RRWA1YXZ3GKW&ref=pd_gw_unk");
		driver.findElement(By.name("field-keywords"));
		driver.findElement(By.name("pd_rd_r"));	
	}
	@Test
	public void locatorsByClass() {
		driver.findElement(By.className("skip-link"));	
		driver.findElement(By.className("nav-logo-locale"));
		driver.findElement(By.className("layoutToolbarPadding"));
		driver.findElement(By.className("icp-nav-link-inner"));
		driver.findElement(By.className("two-pane-results-container"));
		driver.navigate().to("https://www.amazon.com/s?bbn=16225007011&rh=n%3A16225007011%2Cn%3A13896617011&dc&fst=as%3Aoff&pd_rd_r=c5cb10d2-2b8d-4098-9076-e2ea22d9a0b2&pd_rd_w=TwNDr&pd_rd_wg=DXEUX&pf_rd_p=5b7fc375-ab40-4cc0-8c62-01d4de8b648d&pf_rd_r=GCZWH6TC58DNNXMD9Q7G&qid=1602294815&rnid=16225007011&ref=pd_gw_unk");
		driver.findElement(By.className("nav-search-field"));
		driver.findElement(By.className("autocomplete-results-container"));
		driver.findElement(By.className("left-pane-results-container"));
		driver.findElement(By.className("right-pane-results-container"));
		driver.findElement(By.className("nav-ewc-arrow"));
	}
	@Test
	public void locatorsByLinkText() {
		driver.findElement(By.linkText("Gift Cards"));
		driver.findElement(By.linkText("Sell"));
		driver.findElement(By.linkText("Registry"));
		driver.findElement(By.linkText("Today's Deals"));
		driver.findElement(By.linkText("Customer Service"));
	}
	@Test
	public void locatorsByPartialLinkText() {
		driver.findElement(By.partialLinkText("Gift"));
		driver.findElement(By.partialLinkText("Deals"));
		driver.findElement(By.partialLinkText("Service"));
		driver.findElement(By.partialLinkText("Today's"));
		driver.findElement(By.partialLinkText("Customer"));
		driver.findElement(By.partialLinkText("Cards"));		
	}
	@Test
	public void locatorsByTagName() {
		driver.findElement(By.tagName("a"));
		driver.findElement(By.tagName("div"));
		driver.findElement(By.tagName("span"));
		driver.findElement(By.tagName("input"));
		driver.findElement(By.tagName("script"));
		driver.findElement(By.tagName("header"));
		driver.findElement(By.tagName("label"));
		driver.findElement(By.tagName("form"));
		driver.findElement(By.tagName("img"));
		driver.findElement(By.tagName("link"));	
	}
	@Test
	public void locatorsByCssSelector() {
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")); //tag and id
		driver.findElement(By.cssSelector("input#nav-search-submit-button"));
		driver.findElement(By.cssSelector("a#nav-hamburger-menu"));
		driver.findElement(By.cssSelector("a.skip-link")); //tag and class
		driver.findElement(By.cssSelector("span.nav-logo-locale"));
		driver.findElement(By.cssSelector("div.layoutToolbarPadding"));
		driver.findElement(By.cssSelector("input[id=twotabsearchtextbox]")); //tag and attribute
		driver.findElement(By.cssSelector("span[id='glow-ingress-line1']"));
		driver.findElement(By.cssSelector("input[id='unifiedLocation1ClickAddress']"));
		driver.findElement(By.cssSelector("input.nav-progressive-attribute[id=unifiedLocation1ClickAddress]")); //tag, class and attribute
		driver.findElement(By.cssSelector("label.nav-progressive-attribute[id=searchDropdownDescription]"));
		driver.findElement(By.cssSelector("div.layoutToolbarPadding[id=nav-tools]"));
	}
	@Test
	public void locatorsByXPath() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));	
		driver.findElement(By.xpath("//div[text()='EN']"));
		driver.findElement(By.xpath("//a[text()='Sell']"));
		driver.findElement(By.xpath("//a[text()='Registry']"));
		driver.findElement(By.xpath("//span[text()='All']"));
		driver.findElement(By.xpath("//span[text()='Returns']"));
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));
		driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));			
	}
	@Test
	public void locatorsByXpathContains() {
		driver.findElement(By.xpath("//div[contains(@class,'my-2')]"));
		driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
		driver.findElement(By.xpath("//*[contains(@class,'form-control')]"));
		driver.findElement(By.xpath("//button[contains(@id,'button-two')]"));
		driver.findElement(By.xpath("//input[contains(@id,'value-b')]"));
	}
	@Test
	public void locatorsByXpathOr() {
		driver.findElement(By.xpath("//div[@class='my-2' or @id='message-one']"));
		driver.findElement(By.xpath("//a[@href='check-box-demo.php' or text()='Checkbox Demo']"));
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//button[@id='button-two' or  text()='Get Total']"));
		driver.findElement(By.xpath("//button[@id='button-one' or  text()='Show Message']"));
		driver.findElement(By.xpath("//label[@for='inputEmail4' or  text()='Enter Message']"));
	}
	@Test
	public void locatorsByXpathAnd() {
		driver.findElement(By.xpath("//div[@class='my-2' and @id='message-one']"));
		driver.findElement(By.xpath("//a[@href='check-box-demo.php' and text()='Checkbox Demo']"));
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//button[@id='button-two' and  text()='Get Total']"));
		driver.findElement(By.xpath("//button[@id='button-one' and  text()='Show Message']"));
		driver.findElement(By.xpath("//label[@for='inputEmail4' and  text()='Enter Message']"));
	}
	@Test
	public void locatorsByStartsWith() {
		driver.findElement(By.xpath("//div[starts-with(@id,'message-one')]"));
		driver.findElement(By.xpath("//a[starts-with(@href,'check-box-demo.php')]"));
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.xpath("//button[starts-with(@id,'button-one')]"));
		driver.findElement(By.xpath("//button[starts-with(@id,'button-two')]"));
		driver.findElement(By.xpath("//label[starts-with(@for,'inputEmail4')]"));
	}
	@Test
	public void locatorsByXpathParent() {
		driver.findElement(By.xpath("//label[@for='inputEmail4']//parent::div[@class='form-group']"));
		driver.findElement(By.xpath("//input[@id='value-a']//parent::div[@class='form-group']"));
		driver.findElement(By.xpath("//input[@id='value-b']//parent::div[@class='form-group']"));
		driver.findElement(By.xpath("//a[@href='simple-form-demo.php']//parent::li[@class='list-group-item']"));
	}
	@Test
	public void locatorsByXpathChild() {
		driver.findElement(By.xpath("//div[@class='card']//child::div[contains(text(),'Menu')]"));
		driver.findElement(By.xpath("//div[@class='form-group']//child::label[@for='inputEmail4']"));
		driver.findElement(By.xpath("//div[@class='form-group']//child::input[@id='value-a']"));
		driver.findElement(By.xpath("//div[@class='form-group']//child::input[@id='value-b']"));
		driver.findElement(By.xpath("//li[@class='list-group-item']//child::a[@href='simple-form-demo.php']"));
	}
	@Test
	public void locatorsByXpathFollowing() {
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']"));
		driver.findElement(By.xpath("//button[@id='button-one']//following::form"));
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']"));
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-two']"));
		driver.findElement(By.xpath("//button[@id='button-two']//following::div[@id='message-two']"));
	}
	@Test
	public void locatorsByXpathAncestor() {
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::form"));
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='container page']"));
		driver.findElement(By.xpath("//button[@id='button-two']//ancestor::form"));
		driver.findElement(By.xpath("//button[@id='button-two']//ancestor::div[@class='container page']"));
		driver.findElement(By.xpath("//button[@id='button-two']//ancestor::section"));
	}
	@Test
	public void locatorsByXpathPreceding() {
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='header-top']"));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='mb-sec']"));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='form-group']"));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='example my-3']"));
		driver.findElement(By.xpath("//button[@id='button-two']//preceding::form[@method='POST']"));
	}
	
	@Test
	public void locatorsByXpathSibling() {
		driver.findElement(By.xpath("//label[@for='inputEmail4']//following-sibling::input[@id='single-input-field']"));
		driver.findElement(By.xpath("//label[text()='Enter value A']//following-sibling::input[@id='value-a']"));
		driver.findElement(By.xpath("//label[text()='Enter value B']//following-sibling::input[@id='value-b']"));
		driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div[@id='message-one']"));
		driver.findElement(By.xpath("//button[@id='button-two']//following-sibling::div[@id='message-two']"));	
	}
	@Test
	public void locatorsByXpathDescendant() {
		driver.findElement(By.xpath("//div[@class='container page']//descendant::div[@class='row']"));
		driver.findElement(By.xpath("//div[@class='header-top']//descendant::div[@class='container']"));
		driver.findElement(By.xpath("//div[@class='header-top']//descendant::div[@class='row']"));
		driver.findElement(By.xpath("//section[@class='clearfix']//descendant::div[@class='container page']"));
		driver.findElement(By.xpath("//div[@class='mb-sec']//descendant::div[@class='container']"));	
	}
	@Test
	public void locatorsByXpathSelf() {
		driver.findElement(By.xpath("//button[@id='button-one']//self::button"));
		driver.findElement(By.xpath("//input[@id='single-input-field']//self::input"));
		driver.findElement(By.xpath("//input[@id='value-b']//self::input"));
		driver.findElement(By.xpath("//input[@id='value-a']//self::input"));
		driver.findElement(By.xpath("//button[@id='button-two']//self::button"));
	}
}
