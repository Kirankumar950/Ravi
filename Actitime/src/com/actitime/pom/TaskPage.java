package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
@FindBy(xpath="//div[text()='Add New']")
private WebElement addBtn;

@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement nwBtn;

@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement enCun;

@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement ebCd;

@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
private WebElement seCu;

@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
private WebElement ouCm;

@FindBy(xpath="//div[text()='Create Customer']")
private WebElement crCu;
@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
private WebElement actualtext;

public WebElement getActualtext() {
	return actualtext;
}


public TaskPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}


public WebElement getAddBtn() {
	return addBtn;
}


public WebElement getNwBtn() {
	return nwBtn;
}


public WebElement getEnCun() {
	return enCun;
}


public WebElement getEbCd() {
	return ebCd;
}


public WebElement getSeCu() {
	return seCu;
}


public WebElement getOuCm() {
	return ouCm;
}


public WebElement getCrCu() {
	return crCu;
}

}
