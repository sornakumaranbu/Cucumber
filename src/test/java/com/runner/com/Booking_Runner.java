package com.runner.com;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.filereader.com.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\adactin\\com", glue = "com.stepdefenition.hotelbooking.com", plugin = {
		"pretty", "html:AdactinReport",
		"com.cucumber.listener.ExtentCucumberFormatter:AdactinReport/extendReport.html" })

public class Booking_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws Throwable {
		String browser = FileReaderManager.getInstanceFR().getInstanceCR().getBrowser();
		driver = BaseClass.browserLaunch(browser);

	}

	@AfterClass
	public static void close() {

		BaseClass.toclose();
	}

}
