package com.pom.manager.com;

import org.openqa.selenium.WebDriver;

import com.project.book.hotel.Book_Hotel;
import com.project.login.Login_Hotel;
import com.project.search.hotel.Search_Hotel;
import com.project.select.hotel.Select_Hotel;

public class Pom_Manager {

	public static WebDriver driver;

	private Login_Hotel lh;

	private Search_Hotel sh;

	private Select_Hotel select;

	private Book_Hotel bh;

	public Pom_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Login_Hotel login() {

		lh = new Login_Hotel(driver);

		return lh;

	}

	public Search_Hotel search() {

		sh = new Search_Hotel(driver);

		return sh;
	}

	public Select_Hotel select() {

		select = new Select_Hotel(driver);

		return select;
	}

	public Book_Hotel book() {

		bh = new Book_Hotel(driver);

		return bh;
	}
}
