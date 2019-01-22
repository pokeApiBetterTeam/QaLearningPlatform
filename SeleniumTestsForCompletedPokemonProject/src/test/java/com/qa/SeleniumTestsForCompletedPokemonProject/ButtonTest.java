package com.qa.SeleniumTestsForCompletedPokemonProject;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ButtonTest {
	WebDriver driver = null;
	public static ExtentReports report;
	public static ExtentTest test;
	
	@BeforeClass
	public static void configureReport() {
		report = new ExtentReports("C:\\Users\\Joseph\\Desktop\\Reports\\PokemonButtonTest.html",true);
	}
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Joseph\\Desktop\\Chrome Webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	//replace my locations for your own for extent reports and setting up chrome driver
	@After
	public void teardown() {
		driver.quit();
	}
	
	@AfterClass
	public static void endReport() {
		report.flush();
	}
	
	@Test
	public void testReturnToHomepage() {
		test = report.startTest("Testing the home button");
		driver.get("");
		test.log(LogStatus.INFO, "Loading the starting page");
		ResultPage result = PageFactory.initElements(driver,ResultPage.class);
		//Insert location of react front end - ideally a result or error page.
		Actions a = new Actions(driver);
		WebElement HomeButton = driver.findElement(By.name(""));
		a.moveToElement(HomeButton).click().perform();
		test.log(LogStatus.INFO, "Clicking the home button");
		if(result.getTitle().getText().contains("Home")) {
			test.log(LogStatus.PASS, "Navigated back to Home page successfully");
		}
		else {
			test.log(LogStatus.FAIL, "Navigated back to Home page unsuccessfully");
		}
		report.endTest(test);
		assertThat(result.getTitle().getText(),containsString("Home"));
	}
	
	public void testDropDownMenu() {
		test = report.startTest("Testing the Drop Down Menu");
		driver.get("");
		test.log(LogStatus.INFO, "Loading the starting page");
		SearchPage search = PageFactory.initElements(driver,SearchPage.class);
		//Insert location of react front end - search page!
		Select drpPokemon = new Select(driver.findElement(By.name("")));
		//Replace insert name here with name of drop down menu
		String getIndex = drpPokemon.selectByIndex(0).getText();
		test.log(LogStatus.INFO, "Selecting index of Drop down menu");
		if(getIndex.equals("Title")) {
			test.log(LogStatus.PASS, "Correct index chosen!");
		}
		else {
			test.log(LogStatus.FAIL, "Incorrect index chosen!");
		}
		assertEquals("Title",getIndex);
		
	}

}
