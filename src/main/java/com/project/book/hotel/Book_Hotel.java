package com.project.book.hotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

	public static WebDriver driver;

	public Book_Hotel(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcDetails() {
		return ccDetails;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public WebElement getMyItinerary() {
		return myItinerary;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getLogOut() {
		return logOut;
	}

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement fName;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lName;

	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;

	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement ccDetails;

	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement ccType;

	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement expMonth;

	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement expYear;

	@FindBy(xpath = "//input[@name='ids[]']")
	private WebElement checkBox;

	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvv;

	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement bookNow;

	@FindBy(xpath = "//input[@name='my_itinerary']")
	private WebElement myItinerary;

	@FindBy(xpath = "//input[@name='logout']")
	private WebElement logOut;

}
