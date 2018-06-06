package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.BrowserFactory;
import pages.hotelBookingFormPage;

public class bookingFormStep {

	WebDriver driver;
//	WebElement divElement;
	String headerText;

	@Given("^I launched URL on browser$")
	public void i_launched_URL_on_browser() {
		
		//launching a browser with hotel bookings url
		driver = BrowserFactory.startBrowser("firefox", "http://hotel-test.equalexperts.io/");

	}

	@When("^I check header of the page$")
	public void i_check_header_of_the_page() {
		
		//getting header of the page 
//		divElement = driver.findElement(By.cssSelector("body > div.container > div.jumbotron > h1"));
		hotelBookingFormPage htlbkPage = PageFactory.initElements(driver, hotelBookingFormPage.class);
		headerText = htlbkPage.headerLabel.getText();

	}

	@Then("^I see header name as Hotel booking form$")
	public void i_see_header_name_as_Hotel_booking_form() throws Throwable {
	  //asserting header and closing the browser
//		String str = divElement.getText();
		System.out.println("header text-->"+headerText);
		Assert.assertEquals("Hotel booking form", headerText);
		Thread.sleep(1000);
		//closing the browser
		driver.close();
		
	}

}
