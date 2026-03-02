package Automationexerciseproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Accountinfopage extends Baseclass
{
	WebDriver driver;

	//constructor

	public  Accountinfopage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	//locatrors
	@FindBy(xpath="//b[contains(text(),'Enter Account Information')]")
	WebElement validation;

	@FindBy(xpath="//input[@value='Mr']")
	WebElement radio_btn;

	@FindBy(xpath="//input[@type='password']")
	WebElement password;

	@FindBy(xpath="//select[@id='days']")
	WebElement day_dropdown ;

	@FindBy(xpath="//select[@id='months']")
	WebElement month_dropdown ;

	@FindBy(xpath="//select[@id='years']")
	WebElement year_dropdown ;

	@FindBy(xpath="//input[@id='newsletter']")
	WebElement  newsbtn;

	@FindBy(xpath="//input[@id='optin']")
	WebElement optinsbtn ;

	@FindBy(xpath="//input[@id='first_name']")
	WebElement first_name ;

	@FindBy(xpath="//input[@id='last_name']")
	WebElement last_name ;

	@FindBy(xpath="//input[@id='company']")
	WebElement company;

	@FindBy(xpath="//input[@id='address1']")
	WebElement address;

	@FindBy(xpath="//select[@id='country']")
	WebElement country;

	@FindBy(xpath="//input[@id='state']")
	WebElement state;

	@FindBy(xpath="//input[@id='city']")
	WebElement city;

	@FindBy(xpath="//input[@id='zipcode']")
	WebElement zipcode;

	@FindBy(xpath="//input[@id='mobile_number']")
	WebElement m_no;

	@FindBy(xpath="//button[normalize-space()='Create Account']")
	WebElement clickbtn ;

	//Actions

	public void clickbtn() 
	{
		radio_btn.click();
	}

	public void setpassword(String pwd) 
	{
		password.sendKeys(pwd);
	}

	public void setday(String day) 
	{
		Select sc = new Select(day_dropdown);
		sc.selectByVisibleText(day);
	}

	public void setmonth(String month) 
	{
		Select sc = new Select(month_dropdown);
		sc.selectByVisibleText(month);
	}

	public void setyear(String year) 
	{
		Select sc = new Select(year_dropdown);
		sc.selectByVisibleText(year);
	}

	public void clickcheckbox1() 
	{
		newsbtn.click();
	}

	public void clickcheckbox2() 
	{
		optinsbtn.click();
	}

	public void setfirst_name(String name) 
	{
		first_name.sendKeys(name);
	}

	public void setlast_name(String lname) 
	{
		last_name.sendKeys(lname);
	}

	public void setcompany(String com) 
	{
		company.sendKeys(com);
	}

	public void setaddress(String add) 
	{
		address.sendKeys(add);
	}

	public void setstate(String sta) 
	{
		state.sendKeys(sta);
	}

	public void setcountry(String cou) 
	{
		Select sc = new Select(country);
		sc.selectByVisibleText(cou);
	}


	public void setcity(String cy)
	{
		city.sendKeys(cy);
	}

	public void setzipcode(String code) 
	{
		zipcode.sendKeys(code);
	}

	public void setmobile(String number) 
	{
		m_no.sendKeys(number);
	}

	public void clickbutton() 
	{
		clickbtn.click();
	}

	public boolean validate_element()
	{
		return validation.isDisplayed();
	}



























}
