package com.qa.SeleniumTestsForCompletedPokemonProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
	@FindBy(xpath= "")
	private WebElement searchBar;
	
	@FindBy(xpath= "")
	private WebElement SearchPageTitle;
	
	@FindBy(xpath= "")
	private WebElement HomeButton;
	
	@FindBy(xpath= "")
	private WebElement SecondButton;
	
	@FindBy(xpath= "")
	private WebElement ThirdButton;
	
	@FindBy(xpath= "")
	private WebElement DropDown;
	
	//Insert relevant xpaths into spaces 
	
	public void performSearch(String searchTerm) {
		searchBar.sendKeys(Keys.CONTROL + "a");
		searchBar.sendKeys(Keys.DELETE);
		searchBar.sendKeys(searchTerm);
		searchBar.submit();
	}
	
}
