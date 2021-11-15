package com.stepdefenition.hotelbooking.com;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.filereader.com.FileReaderManager;
import com.pom.manager.com.Pom_Manager;
import com.runner.com.Booking_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinBooking_StepDef extends BaseClass {

	public static WebDriver driver = Booking_Runner.driver;

	Pom_Manager pom = new Pom_Manager(driver);

	@Given("^User launch application$")
	public void user_launch_application() throws Throwable {

		String geturl = FileReaderManager.getInstanceFR().getInstanceCR().geturl();
		togetUrl(geturl);

	}

	@When("^User enter the valid username in the usename field$")
	public void user_enter_the_valid_username_in_the_usename_field() throws Throwable {

		String getuserName = FileReaderManager.getInstanceFR().getInstanceCR().getuserName();
		tosendkeys(pom.login().getuName(), getuserName);
	}

	@When("^User enter the valid password in the password field$")
	public void user_enter_the_valid_password_in_the_password_field() throws Throwable {

		String getpassword = FileReaderManager.getInstanceFR().getInstanceCR().getpassword();
		tosendkeys(pom.login().getPass(), getpassword);
	}

	@Then("^User click the login button$")
	public void user_click_the_login_button() throws Throwable {

		toClick(pom.login().getLoginbtn());
	}

	@Given("^User navigate search hotel$")
	public void user_navigate_search_hotel() throws Throwable {
	}

	@When("^User select location$")
	public void user_select_location() throws Throwable {

		toSelect(pom.search().getLocation(), 3);

	}

	@When("^User select hotel$")
	public void user_select_hotel() throws Throwable {

		toSelect(pom.search().getHotels(), 3);
	}

	@When("^User select hotel room type$")
	public void user_select_hotel_room_type() throws Throwable {

		toSelect(pom.search().getRoomType(), 2);
	}

	@When("^User select no of rooms$")
	public void user_select_no_of_rooms() throws Throwable {

		toSelect(pom.search().getRoomNos(), 1);
	}

	@When("^User enter check-in date$")
	public void user_enter_check_in_date() throws Throwable {

		toClear(pom.search().getCheckIn());
		tosendkeys(pom.search().getCheckIn(), "15/11/2021");
	}

	@When("^User enter check-out date$")
	public void user_enter_check_out_date() throws Throwable {

		toClear(pom.search().getCheckOut());
		tosendkeys(pom.search().getCheckOut(), "16/11/2021");
	}

	@When("^user enter how many adults per room$")
	public void user_enter_how_many_adults_per_room() throws Throwable {

		toSelect(pom.search().getAdultNos(), 1);
	}

	@Then("^User click search button$")
	public void user_click_search_button() throws Throwable {

		toClick(pom.search().getSearchBtn());
	}

	@Given("^User navigate to select hotel page$")
	public void user_navigate_to_select_hotel_page() throws Throwable {
	}

	@When("^User select perticular hotel$")
	public void user_select_perticular_hotel() throws Throwable {

		toClick(pom.select().getRadibtn());
	}

	@Then("^User click on continue button$")
	public void user_click_on_continue_button() throws Throwable {

		toClick(pom.select().getContinuebtn());
	}

	@Given("^user navigate to book hotel page$")
	public void user_navigate_to_book_hotel_page() throws Throwable {
	}

	@When("^user enter first name in the first name field$")
	public void user_enter_first_name_in_the_first_name_field() throws Throwable {

		tosendkeys(pom.book().getfName(), "Karigalan");
	}

	@When("^user enter last name in the lastname name field$")
	public void user_enter_last_name_in_the_lastname_name_field() throws Throwable {

		tosendkeys(pom.book().getlName(), "Chozan");
	}

	@When("^user enter address in the address field$")
	public void user_enter_address_in_the_address_field() throws Throwable {
		
		tosendkeys(pom.book().getAddress(), "7/11 south madavpuram street,");
		tosendkeys(pom.book().getAddress(), "Alandur, chennai-16.");

	}

	@When("^user enter (\\d+) digit credit card no$")
	public void user_enter_digit_credit_card_no(int arg1) throws Throwable {

		String getcreditcard = FileReaderManager.getInstanceFR().getInstanceCR().getcreditcard();
		tosendkeys(pom.book().getCcDetails(), getcreditcard);

	}

	@When("^user select type of credit card$")
	public void user_select_type_of_credit_card() throws Throwable {
		
		toSelect(pom.book().getCcType(), 2);
		
	}

	@When("^user select card expiry month from the dropdown$")
	public void user_select_card_expiry_month_from_the_dropdown() throws Throwable {
		
		towait(5);
		toSelect(pom.book().getExpMonth(), 3);
	}

	@When("^user select card expiry year from the dropdown$")
	public void user_select_card_expiry_year_from_the_dropdown() throws Throwable {
		
		toexplicitWait(5,pom.book().getExpYear());
		toSelect(pom.book().getExpYear(), 12);
	}

	@When("^user enter the cvv no in the cvv field$")
	public void user_enter_the_cvv_no_in_the_cvv_field() throws Throwable {
		
		tosendkeys(pom.book().getCvv(), "874");
	}

	@When("^user clicks on book now button$")
	public void user_clicks_on_book_now_button() throws Throwable {
		
		toClick(pom.book().getBookNow());
	}

	@When("^user clicks on myitinerary$")
	public void user_clicks_on_myitinerary() throws Throwable {
		
		toClick(pom.book().getMyItinerary());
	}

	@When("^user clicks on order it check box$")
	public void user_clicks_on_order_it_check_box() throws Throwable {
		
		toClick(pom.book().getCheckBox());
		toscreenshot("Hotelbooking");
	}

	@Then("^user logout session$")
	public void user_logout_session() throws Throwable {
		
		toClick(pom.book().getLogOut());
	}

}
