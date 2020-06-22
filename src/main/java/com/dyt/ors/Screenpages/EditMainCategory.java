package com.dyt.ors.Screenpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dyt.Generic.Weblibrary;
import com.dyt.Reports.Reporter;

public class EditMainCategory extends Weblibrary{
	@FindBy(xpath="//table[@id='dataTable']/tbody/tr[2]/td[5]/a[1]/i")
	public static WebElement click_editicon;	
		@FindBy(xpath="//input[@name='ors_mc_category_name']")
		public static WebElement edit_Maincategory;	
		
		@FindBy(xpath="//input[@name='ors_order']")
		public static WebElement edit_Assignedorder;
		
		@FindBy(xpath="//input[@name='catgImage']")
		public static WebElement edit_Image;		
		
		@FindBy(xpath="//input[@class='btn btn-success']")
		public static WebElement Submit_button;	

		
		
		//=================Login methods=========================
		
		public static void EditMainCategoryPage(String user, String OrderValue) {
			boolean bStatus;
			
			bStatus = clickElement(click_editicon);
			Reporter.log(bStatus, "editicon clicked", "editicon not clicked");
			bStatus = setValueEscape(edit_Maincategory, user);
			Reporter.log(bStatus, "Username entered", "Username not entered");
					
			bStatus = selectListItemByValue(edit_Assignedorder, OrderValue);
			Reporter.log(bStatus, "Order Value Selected", "Order Value not Selected");
			
			/*bStatus = uploadFile(Choose_Image,elementupload, filepath);
			Reporter.log(bStatus, "Image Uploaded", "Image not Uploaded");*/
			
			
			bStatus = clickElement(Submit_button);
			Reporter.log(bStatus, "Submit button clicked", "Submit button not clicked");
		}


	}



