package com.qa.SeleniumTestsForCompletedPokemonProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage {
	@FindBy(xpath = "")
	private WebElement title;
	
	@FindBy(xpath= "")
	private WebElement HomeButton;
	
	@FindBy(xpath= "")
	private WebElement SecondButton;
	
	@FindBy(xpath= "")
	private WebElement ThirdButton;
	
	//Insert xpath of result page title 
	
	public WebElement getTitle() {
		return title;
	}
	
}
