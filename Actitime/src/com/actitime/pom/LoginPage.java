package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BaseClass;

public class LoginPage extends BaseClass {
	@FindBy(id="username")
	private WebElement unTbx;//        decleration
	@FindBy(name="pwd")
	private WebElement pwTbx;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgBtn;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setLogin(String un,String pw) {
		unTbx.sendKeys(un);
		pwTbx.sendKeys(pw);
		lgBtn.click();
	}

}
