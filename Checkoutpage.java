package Automationexerciseproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkoutpage 
{
	WebDriver driver;
	WebDriverWait wait;

	//constructor

	public Checkoutpage(WebDriver driver)
	{
		if (driver == null) {
			throw new IllegalArgumentException("WebDriver passed to Productspage is null. Ensure Baseclass initializes driver before creating page objects.");
		}
		this.driver = driver;
		PageFactory.initElements(driver, this);

		// initialize wait here (Selenium 4)
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		System.out.println("Checkoutpage.<init> - driver=" + driver + ", wait initialized=" + (this.wait != null));

	}

	//locators

	@FindBy(xpath="//a[normalize-space()='Proceed To Checkout']")
	WebElement click_checkout;

	//Actions

	public void clickcheckoutBtn() 
	{
		wait.until(ExpectedConditions.elementToBeClickable(click_checkout)).click();
	}


}
