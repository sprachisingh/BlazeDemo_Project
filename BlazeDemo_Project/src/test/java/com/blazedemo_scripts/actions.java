package com.blazedemo_scripts;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class actions 
{
	boolean isMatch = false;
	String messageText = "";
	WebDriver currentDriver;
	Capabilities cap;
	String TCStatus = "FAIL";
	

	
	// LAUNCHING A BROWSER AND OPENING URL
	public WebDriver launchBrowser(WebDriver driver , String browser, String URL)
	{
		System.out.println("Launching Browser");
		if(browser == "Chrome")
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sprac\\OneDrive\\Desktop\\PRACHI\\TEST AUTOMATION\\SELENIUM\\Browser_Driver\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(browser == "Firefox")
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\sprac\\OneDrive\\Desktop\\PRACHI\\TEST AUTOMATION\\SELENIUM\\Browser_Driver\\Firefox_Gecko\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		if(browser == "IE")
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\sprac\\OneDrive\\Desktop\\PRACHI\\TEST AUTOMATION\\SELENIUM\\Browser_Driver\\IE\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(URL);
		System.out.println(URL + "      This URL was provided");
		
		/*cap = ((RemoteWebDriver) driver).getCapabilities();
		
		if(cap.getBrowserName().toLowerCase().equals(browser.toLowerCase()))
		{
			messageText = browser + " browser is launched.";
			if(driver.getCurrentUrl().toLowerCase().equals(URL.toLowerCase()))
			{
				messageText = messageText + "\nCorrect URL opened.";
				TCStatus = "PASS";
			}
			else
			{
				messageText = messageText + "\nIncorrect URL opened.";
				TCStatus = "FAIL";
			}
		}
		else 
		{
			messageText = browser + " browser is not launched.";
			TCStatus = "FAIL";
		}
		System.out.println(messageText);*/
		System.out.println(driver.getCurrentUrl());
		return driver;
	}
	
	
	// SELECTING DROPDOWN OPTION
	public void selectDropDownItem(WebElement el , String item)
	{
		Select dropdown = new Select(el);
		dropdown.selectByVisibleText(item);
		System.out.println("I was here");
	}
	
	public boolean verifyText(WebElement el , String item) 
	{
		if (el.getText() == item)
		{
			isMatch = true;
		}
		else
		{
			isMatch = false;
		}
		return isMatch;
	}

	public void clickItem(WebElement el) 
	{
		// TODO Auto-generated method stub
		el.click();
	}
}
