package pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class hotelBookingFormPage {
	
	WebDriver driver;
	
	public hotelBookingFormPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how=How.CSS,using="body > div.container > div.jumbotron > h1")
	public WebElement headerLabel;
	
	@FindBy(how=How.ID,using="firstname")
	WebElement fNameInput;
	
	@FindBy(how=How.ID,using="lastname")
	WebElement lNameInput;
	
	@FindBy(how=How.ID,using="totalprice")
	WebElement priceInput;
	
	@FindBy(how=How.ID,using="depositpaid")
	WebElement depositDrpDown;
	
	@FindBy(how=How.ID,using="checkin")
	WebElement checkinDatePick;
	
	@FindBy(how=How.ID,using="checkout")
	WebElement checkoutDatePick;
	
	@FindBy(how=How.CSS,using="#form > div > div:nth-child(7) > input[type=\"button\"]")
	WebElement saveButton;
	
	//add all details
	public void addRecord(String fname, String lname, String price, int deposite, String checkinDate, String checkOutDate) throws Throwable
	{
		fNameInput.sendKeys(fname);
		lNameInput.sendKeys(lname);
		priceInput.sendKeys(price);
		
		Select dropdown = new Select(depositDrpDown);
		dropdown.selectByIndex(deposite);
		
		Thread.sleep(1000);
		checkinDatePick.sendKeys(checkinDate);
		
		Thread.sleep(1000);
		checkoutDatePick.sendKeys(checkOutDate);		
	}
	
	//save the record by clickng save button
	public void saveRecord() {
		saveButton.click();
	}
	
	//Get Div classes and recently added record details
	public ArrayList<String> getChildDivs() throws Throwable
	{
		ArrayList<String> ar = new ArrayList<String>();
		int count = driver.findElements(By.xpath("//*[@id=\"bookings\"]/div")).size();
		System.out.println("count -->"+count);
		
		//loop through the all divs and getting recently added one and asserting the values
		for(int i = 1; i<=count; i++)
		{
			
			int colCount = driver.findElements(By.xpath("//*[@id=\"bookings\"]/div["+i+"]/div")).size();
			System.out.println("colCount -->"+colCount);
			if(i==count)
			{
				System.out.println("Entered if " + i);
				for(int j=1; j<=colCount; j++)
				{	
					Thread.sleep(1000);
					System.out.println("Entered loop j--"+j);
						String value = driver.findElement(By.xpath("//*[@id=\"bookings\"]/div["+count+"]/div["+j+"]")).getText();
						ar.add(value);						
				}
			}
		}
		
		return ar;
	}
	
	
//	public void deleteRecord() {		
//		int count = driver.findElements(By.xpath("//*[@id=\"bookings\"]/div")).size();
//		if(count>=2)
//		{
//			driver.findElement(By.xpath("//*[@id=\"bookings\"]/div["+count+"]/div[7]/input")).click();
//			
//		}
//	}
	

}
