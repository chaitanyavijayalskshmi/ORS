package com.dyt.ors.Screenpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.Generic.Weblibrary;
import com.dyt.Reports.Reporter;

public class Home extends Weblibrary{
	
	//===============WebElements for Home page==========
	@FindBy(xpath="//a[text()='Login']")
	public static WebElement link_Login;
	
	@FindBy(xpath="//a[text()='Register']")
	public static WebElement link_Register;
	
	//===================methods========================
	public static void navLoginpage() {		
		boolean bStatus = clickElement(link_Login);
		Reporter.log(bStatus, "Login link clicked", "Login link not clicked");
	}	
	
	
	//==================================================

}
