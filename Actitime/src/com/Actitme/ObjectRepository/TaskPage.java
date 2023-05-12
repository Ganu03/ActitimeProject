package com.Actitme.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	
	//declaration
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newcust;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
	
	@FindBy(xpath="(//textarea[@class='textarea'])[9]")
	private WebElement custdesc;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createcust;

	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement canclecust;
	
	//initialization
	
	public TaskPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcust() {
		return newcust;
	}

	public WebElement getCustname() {
		return custname;
	}

	public WebElement getCustdesc() {
		return custdesc;
	}

	public WebElement getCreatecust() {
		return createcust;
	}

	public WebElement getCanclecust() {
		return canclecust;
	}
	

}
