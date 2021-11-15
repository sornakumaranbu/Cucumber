package com.project.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Hotel {

	public static WebDriver driver;

	public Login_Hotel(WebDriver driver2) {
	
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getuName() {
		return uName;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	@FindBy(xpath = "//input[@name='username']")
	private WebElement uName;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement pass;

	@FindBy(xpath = "//input[@name='login']")
	private WebElement loginbtn;
}
