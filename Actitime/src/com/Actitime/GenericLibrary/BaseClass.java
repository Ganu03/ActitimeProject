package com.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Actitme.ObjectRepository.HomePage;
import com.Actitme.ObjectRepository.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	FileLibrary f=new FileLibrary();
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("Database connected",true);
	}
	
	@BeforeClass
	public void launchbrowser() throws IOException {
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String Url = f.readDataFromPropertyFile("url");
		driver.get(Url);
		Reporter.log("Browser Launched",true);
	}
	
	@BeforeMethod
	public void login() throws IOException {
		LoginPage lp=new LoginPage(driver);
		String un = f.readDataFromPropertyFile("username");
		String pw = f.readDataFromPropertyFile("password");
		lp.getUntbx().sendKeys(un);
		lp.getPwbtx().sendKeys(pw);
		lp.getLgbtn().click();
		Reporter.log("Loggged in Successfully",true);
	}
	
	@AfterMethod
	public void logout() {
		HomePage hp=new HomePage(driver);
		hp.getLgoutlnk().click();
		Reporter.log("Logged out Successfully",true);
	}
	
	@AfterClass
	public void closebrowser() {
		driver.close();
		Reporter.log("Browser closed",true);
	}
	
	@AfterSuite
	public void databasedisconnection() {
		Reporter.log("Database disconnected",true);
	}	
}
