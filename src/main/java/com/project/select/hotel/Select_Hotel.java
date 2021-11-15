package com.project.select.hotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

	public static WebDriver driver;

	public Select_Hotel(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getRadibtn() {
		return radibtn;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement radibtn;

	@FindBy(xpath = "//input[@name='continue']")
	private WebElement continuebtn;

}
