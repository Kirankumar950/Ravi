package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class CustomerModule1 extends BaseClass{

	@Test
	public void createModule() {
		Reporter.log("createmodule",true);
	}
	@Test
	public void modifyModule() {
		Reporter.log("modifyModule",true);
	}
	@Test
	public void deleteModule() {
		Reporter.log("deleteModule",true);
	}

}
