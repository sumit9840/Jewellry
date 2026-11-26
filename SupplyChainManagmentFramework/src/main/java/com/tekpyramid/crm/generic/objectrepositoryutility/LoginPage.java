package com.tekpyramid.crm.generic.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="login:username")
	private WebElement usernameEdt;
	
	@FindBy(id="login:password")
	private WebElement passwordEdt;
	
	@FindBy(id="login:type")
	private WebElement loginTypeDD;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginBtn;
	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginTypeDD() {
		return loginTypeDD;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public void LoginToApp(String url, String username, String password) {
		driver.manage().window().maximize();
	}

}
