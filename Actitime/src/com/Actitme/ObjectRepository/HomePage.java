package com.Actitme.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration
	
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement tasktab;
	
	@FindBy(xpath="//div[.='Reports']")
	private WebElement reportstab;
	
	@FindBy(xpath="//div[.='Users']")
	private WebElement userstab;
	
	@FindBy(id="logoutLink")
	private WebElement lgoutlnk;
	
	//initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		//utilization
		
	}

	public WebElement getTasktab() {
		return tasktab;
	}

	public WebElement getReportstab() {
		return reportstab;
	}

	public WebElement getUserstab() {
		return userstab;
	}

	public WebElement getLgoutlnk() {
		return lgoutlnk;
	}

}
