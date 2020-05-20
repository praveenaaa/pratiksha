package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.pages.add_product_page;

public class Verifytest_me_app_add_product_cart_test {
	@Test
	public void verifysuccessful_add_product() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C://driver99999//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	 
	driver.manage().window().maximize();
	 

	driver.get("http://localhost:8099/TestMeApp"); 

	 add_product_page add_product= new add_product_page(driver);


	
	 add_product.add_product_to_the_cart("lalitha", "password123");
	// LoginPage.
	 
	driver.quit();
	 
	}
	 
	 
	}

