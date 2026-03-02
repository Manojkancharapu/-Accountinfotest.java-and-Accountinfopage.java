package Automationexerciseproject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Accountinfotest extends Baseclass
{

	@Test
	public void verify_accountinfo() throws InterruptedException
	{

		SignupNloginpage snl = new SignupNloginpage(driver);
		snl.setname("manojkumar");
		snl.setpassword("manojeee1994@gmail.com");
		snl.clickbutton();

		Accountinfopage aip = new Accountinfopage(driver);
		aip.clickbtn();
		aip.setpassword("Manoj@123");
		aip.setday("21");
		aip.setmonth("April");
		aip.setyear("1993");
		Thread.sleep(5000);
		aip.clickcheckbox1();
		aip.clickcheckbox2();
		aip.setfirst_name("manoj");
		aip.setlast_name("kancharapu");
		aip.setcompany("abc");
		aip.setaddress("sklm");
		aip.setstate("ap");
		aip.setcountry("India");
		aip.setcity("adv");
		aip.setzipcode("532484");
		aip.setmobile("123456789");
		aip.clickbutton();
	}




}
