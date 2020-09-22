package com.fullcycle.tests;


import org.testng.annotations.Test;

import com.fullcycle.base.TestBase;
import com.fullcycle.pageclass.HomePage;
import com.fullcycle.pageclass.OrderInformation;
import com.fullcycle.pageclass.ProductInformation;
import com.fullcycle.pageclass.WomenCategories;

public class TestCase_001 extends TestBase{


	@Test
	public void placeOrder() {
		
		HomePage objHpage = new HomePage(driver);
		WomenCategories objCat = new WomenCategories(driver);	
		ProductInformation objPinf = new ProductInformation(driver);
		OrderInformation objOinf = new OrderInformation(driver);
		
		objHpage.clickWomenTshirts();
		objCat.clickMoreButton();
		objPinf.clickPlusButton();
		objPinf.selectSizeDropdown("L");
		objPinf.selectColor();
		objOinf.clickProceedToCheckoutButton();
		
	}

}
