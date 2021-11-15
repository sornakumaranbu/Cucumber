package com.project.search.hotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public static WebDriver driver;

	public Search_Hotel(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultNos() {
		return adultNos;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;

	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotels;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomType;

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement roomNos;

	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement checkIn;

	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement checkOut;

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adultNos;

	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement searchBtn;

}
