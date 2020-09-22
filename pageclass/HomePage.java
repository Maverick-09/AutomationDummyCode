package com.fullcycle.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[a[@title=\"Tops\"]]/ul/li/a[text()=\"T-shirts\"]")
    private WebElement FilterTshirts;
	
	public void clickWomenTshirts() {
		FilterTshirts.click();
	}

}
