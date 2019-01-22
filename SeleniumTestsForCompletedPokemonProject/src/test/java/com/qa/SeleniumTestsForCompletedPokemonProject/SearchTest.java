package com.qa.SeleniumTestsForCompletedPokemonProject;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.SeleniumTestsForCompletedPokemonProject.ResultPage;
import com.qa.SeleniumTestsForCompletedPokemonProject.SearchPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SearchTest {
	WebDriver driver = null;
	public static ExtentReports report;
	public static ExtentTest test;
	
	@BeforeClass
	public static void configureReport() {
		report = new ExtentReports("C:\\Users\\Joseph\\Desktop\\Reports\\PokemonSearchTest.html",true);
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
	public void pokemonSearchCorrect() throws InterruptedException {
		test = report.startTest("Searching for correct Pokemon");
		driver.get("");
		//Insert location of react front end here
		test.log(LogStatus.INFO, "Pokemon Project opened successfully");
		SearchPage search = PageFactory.initElements(driver,SearchPage.class);
		ResultPage result = PageFactory.initElements(driver,ResultPage.class);
		search.performSearch("clefairy");
		test.log(LogStatus.INFO, "Search Term entered");
		test.log(LogStatus.INFO, "Search occuring");
		Thread.sleep(3000);
		if(result.getTitle().getText().contains("clefairy")) {
			test.log(LogStatus.PASS, "Clefairy found!");
		}
		else {
			test.log(LogStatus.FAIL, "Clefairy NOT found!");
		}
		report.endTest(test);
		assertEquals("Resource for clefairy",result.getTitle().getText());
		
	}
	
	@Test
	public void pokemonSearchError() throws InterruptedException{
		test = report.startTest("Testing Error Handling");
		driver.get("");
		// Insert location of react front end here
		test.log(LogStatus.INFO, "Pokemon Project opened successfully");
		SearchPage search = PageFactory.initElements(driver,SearchPage.class);
		ResultPage result = PageFactory.initElements(driver,ResultPage.class);
		search.performSearch("asc01");
		test.log(LogStatus.INFO, "Search Term entered");
		test.log(LogStatus.INFO, "Search occuring");
		Thread.sleep(3000);
		if(result.getTitle().getText().contains("error")) {
			test.log(LogStatus.PASS, "Error handled Successfully");
		}
		else {
			test.log(LogStatus.FAIL, "Error handled unsuccessfully");
		}
		report.endTest(test);
		assertThat(result.getTitle().getText(),containsString("error"));
		
	}
	
	@Test
	public void pokemonSearchBlank() throws InterruptedException{
		test = report.startTest("Testing Handling of Blank search");
		driver.get("");
		//Insert location of react front end here
		test.log(LogStatus.INFO, "Pokemon Project opened successfully");
		SearchPage search = PageFactory.initElements(driver,SearchPage.class);
		ResultPage result = PageFactory.initElements(driver,ResultPage.class);
		search.performSearch("");
		test.log(LogStatus.INFO, "Search occuring");
		Thread.sleep(3000);
		if(result.getTitle().getText().contains("undefined")) {
			test.log(LogStatus.PASS, "Blank search handled Successfully");
		}
		else {
			test.log(LogStatus.FAIL, "Blank search unsuccessfully");
		}
		report.endTest(test);
		assertThat(result.getTitle().getText(),containsString("undefined"));
		
	}

}
