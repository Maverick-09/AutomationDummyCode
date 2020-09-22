package com.fullcycle.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderInformation {
	
	public OrderInformation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a/span[contains(text(),\"Proceed to checkout\")]")
    private WebElement ProceedToCheckoutButton;
	
	public void clickProceedToCheckoutButton() {
		ProceedToCheckoutButton.click();
	}

}
