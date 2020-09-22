package com.fullcycle.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class ProductInformation{
	
	public ProductInformation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span/i[@class=\"icon-plus\"]]")
    private WebElement PlusButton;
	
	@FindBy(xpath = "//select[@name=\"group_1\"]/option")
    private Select SizeDropdown;
	
	@FindBy(xpath = "//a[@id=\"color_14\" and @title=\"Blue\"]")
    private WebElement SizeColor;
	
	@FindBy(xpath = "//button[span[text()=\"Add to cart\"]]")
    private WebElement AddToCartButton;
	
	public void clickPlusButton() {
		PlusButton.click();
	}
	
	public void selectSizeDropdown(String size) {
		SizeDropdown.selectByVisibleText(size);
	}
	
	public void selectColor() {
		AddToCartButton.click();
	}
	
}
