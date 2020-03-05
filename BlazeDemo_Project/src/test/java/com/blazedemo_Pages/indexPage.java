package com.blazedemo_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class indexPage
{
	WebDriver driver;
	
	public indexPage(WebDriver driver) 
	{   
		System.out.println("Prachi");
        this.driver = driver; 
        PageFactory.initElements(driver, this);
        //System.out.println(driver.getCurrentUrl());
	}
	
	
	@FindBy(name="fromPort")
	public static WebElement drpFromCity;
	
	@FindBy(name="toPort")
	public static WebElement drpToCity;
	
	@FindBy(css="body > div.container > form > div > input")
	public static WebElement btnFindFlights;
	
	@FindBy(css="body > div.jumbotron > div > h1")
	public static WebElement indexTitle;
	
	@FindBy(css="body > div.jumbotron > div > p:nth-child(2)")
	public static WebElement indexSubTitle;
	
	@FindBy(xpath="//a[contains(text(),\"destination\")]")
	public static WebElement lnkDestination;
	
	@FindBy(css="body > div.container > h2")
	public static WebElement txtFromCity;
	
	@FindBy(css="body > div.container > form > h2")
	public static WebElement txtToCity;
	
}
