package com.blazedemo_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import com.blazedemo_Pages.indexPage;

public class selectCities_Script 
{
	WebDriver dr;
	actions act = new actions();
	indexPage page;
	
	
	@BeforeTest
	public void preTest()
	{
		dr = act.launchBrowser(dr , "Chrome", "http://blazedemo.com/");
		page = new indexPage(dr);
	}
	
	
	@Test
	public void selectCities() throws InterruptedException 
	{
		act.selectDropDownItem(page.drpFromCity, "Boston");
		act.selectDropDownItem(page.drpToCity, "Cairo");
		act.clickItem(page.btnFindFlights);
		act.wait();
	}
	
	
	@AfterTest
	public void postTest()
	{	
		//dr.quit();
	}
	

}
