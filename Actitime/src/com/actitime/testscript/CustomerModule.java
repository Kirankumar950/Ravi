package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
@Test
public void testcreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
	
	Reporter.log("createCustomer",true);
	FileLib f=new FileLib();
String customername = f.getExcelData("Sheet1", 1, 2);
	String customerDescription = f.getExcelData("Sheet1", 1, 3);
	HomePage h=new HomePage(driver);
	h.setTask();
	TaskPage t=new TaskPage(driver);
	t.getAddBtn().click();
	t.getNwBtn().click();
	t.getEnCun().sendKeys(customername);
	t.getEbCd().sendKeys(customerDescription);
	t.getSeCu().click();
	t.getOuCm().click();
	t.getCrCu().click();
	 Thread.sleep(10000);
String atext = t.getActualtext().getText();
	Assert.assertEquals(customername, atext);
	Assert.fail();
}
}
