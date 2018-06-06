package stepDefinitions;

import static org.junit.Assert.assertTrue;

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

public class deleteARecordStep {

	WebDriver driver;
	int count;

	@Given("^I am on hotel booking form page$")
	public void i_am_on_hotel_booking_form_page() throws Throwable {
		
		//launching a browser with hotel bookings url
		driver = BrowserFactory.startBrowser("firefox", "http://hotel-test.equalexperts.io/");
	}

	@When("^I click on delete button of existing record$")
	public void i_click_on_delete_button_of_existing_record() throws Throwable {
		Thread.sleep(2000);
		count = driver.findElements(By.xpath("//*[@id=\"bookings\"]/div")).size();
		if(count>=2)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"bookings\"]/div["+count+"]/div[7]/input")).click();
			
		}
		
	}

	@Then("^I see record has deleted$")
	public void i_see_record_has_deleted() throws Throwable {
		
		//Checking whether record has deleted or not
		Thread.sleep(1000);
		int currentCount = driver.findElements(By.xpath("//*[@id=\"bookings\"]/div")).size();
		assertTrue( currentCount < count );
		Thread.sleep(1000);
		
		//closing the browser
		driver.quit();;		
	}

}
