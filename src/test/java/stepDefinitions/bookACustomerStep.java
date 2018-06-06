package stepDefinitions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.BrowserFactory;
import pages.hotelBookingFormPage;

public class bookACustomerStep {

	WebDriver driver;
	
	ArrayList<String> custDetails = new ArrayList<String>();
	
	@Given("^I am on Hotel Booking Form$")
	public void i_launched_URL_on_browser() throws Throwable {		
		//Launching browser with hotel bookings URL		
		Thread.sleep(3000);
		driver = BrowserFactory.startBrowser("firefox", "http://hotel-test.equalexperts.io/");
	}

	@When("^I enter \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_enter_Anusha_Boppudi_true_checkIn_checkOut(String fname, String surName, String price, int deposite, String checkinDate, String checkoutDate) throws Throwable {
		
		//Finding elements on home page and adding the inputted values to the array for later assertions		
		hotelBookingFormPage htlbkPage = PageFactory.initElements(driver, hotelBookingFormPage.class);
		htlbkPage.addRecord(fname, surName, price, deposite, checkinDate, checkoutDate);
		custDetails.add(fname);
		custDetails.add(surName);
		custDetails.add(price);
		if(deposite == 0) {custDetails.add("true");}
		else {custDetails.add("false");}
		custDetails.add(checkinDate);
		custDetails.add(checkoutDate);
		
	}

	@When("^click on save button$")
	public void click_on_save_button() throws Throwable {
		//Saving a Record
		Thread.sleep(2000);
		hotelBookingFormPage htlbkPage = PageFactory.initElements(driver, hotelBookingFormPage.class);
		htlbkPage.saveRecord();	

	}

	@Then("^save deatils with delete button$")
	public void save_entered_details_in_a_table() throws Throwable {		
		//Getting the Size of the child Divs under bookings		
		Thread.sleep(2000);
		hotelBookingFormPage htlbkPage = PageFactory.initElements(driver, hotelBookingFormPage.class); 
		ArrayList<String> arlist = htlbkPage.getChildDivs();
		
		//Asserting Delete button
		Assert.assertEquals(7, arlist.size());
		
		//Asserting input values with saved values
		assert arlist.containsAll(custDetails);
		
		Thread.sleep(3000);
		//closing the browser
		driver.quit();
	}

	
}
