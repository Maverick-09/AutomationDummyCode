package com.fullcycle.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenCategories {
	
	public WomenCategories(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a/span[text()=\"More\"]")
    private WebElement MoreButton;
	
	
	public void clickMoreButton() {
		MoreButton.click();
	}

}
