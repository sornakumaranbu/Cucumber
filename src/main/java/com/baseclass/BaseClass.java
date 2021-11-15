package com.baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Cucumber_AdactingProject\\DriverC\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\eclipse-workspace\\Cucumber_AdactingProject\\FireFoxDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public static void toscreenshot(String pic) throws Throwable {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\hp\\eclipse-workspace\\Cucumber_AdactingProject\\Screenshots" + pic + ".png");
		FileUtils.copyFile(source, destination);
	}

	public static void toMaximize() {

		driver.manage().window().maximize();
	}

	public static void towait(int time) {

		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public static void toquit() {
		driver.quit();
	}

	public static void toclose() {

		driver.close();
	}

	public static void torefresh() {

		driver.navigate().refresh();
	}

	public static void toforward() {

		driver.navigate().forward();
	}

	public static void toback() {

		driver.navigate().back();
	}

	public static void todefault() {

		driver.switchTo().defaultContent();
	}

	public static void toswitchframe(int index) {

		driver.switchTo().frame(index);
	}

	public static void toswitchframe(String str) {

		driver.switchTo().frame(str);
	}

	public static void toswitchframe(WebElement element) {

		driver.switchTo().frame(element);
	}

	public static void torobot() throws Throwable {

		Robot rbt = new Robot();

		rbt.keyPress(KeyEvent.VK_UP);
		rbt.keyPress(KeyEvent.VK_DOWN);

		rbt.keyRelease(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void tomoveToelement(WebElement element) {

		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();

	}

	public static void toexplicitWait(int seconds, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void togetUrl(String str) {

		driver.get(str);
	}

	public static void togetTitle(String str) {

		driver.getTitle();
	}

	public static void togetcurrentUrl() {

		driver.getCurrentUrl();
	}

	public static void togetSoucecode() {

		driver.getPageSource();
	}

	public static void tosendkeys(WebElement element, String str) {

		element.sendKeys(str);

	}

	public static void toisSelected(WebElement element) {

		boolean selected = element.isSelected();
		System.out.println(selected);
	}

	public static void toisEnabled(WebElement element) {

		boolean enabled = element.isEnabled();
		System.out.println(enabled);

	}
	
	public static void toSelect(WebElement element , int input) {
		
		Select s = new Select(element);
		s.selectByIndex(input);
	}
		
//	if(option.equals("index")) {
//		int parseInt = Integer.parseInt(input);
//			s.selectByIndex(input);
//		}
//		else if(option.equals("value")) {
//			s.selectByValue(input);
//		}else if(option.equals("text")) {
//			s.selectByVisibleText(input);
//		}
		
//	}

	public static void toisDispayed(WebElement element) {

		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}

	public static void toClick(WebElement element) {

		element.click();
	}

	public static void toClear(WebElement element) {

		element.clear();
	}

}


