package com.github.Scoobydoo181.Gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebAccess extends Thread
{
	private Browsers browserType;
	private String driverLocation;
	private String userName;
	private String password;
	
	public WebAccess(String threadName, Browsers browserType)
	{
		super(threadName);
		this.browserType = browserType;
		driverLocation = this.browserType.getLocation();
	}
	
	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public void run()
	{
		System.setProperty(browserType.getProperty(), browserType.getLocation());
		WebDriver driver = new ChromeDriver();
		
		switch(browserType) 
		{
			case CHROME:
				driver = new ChromeDriver();
				break;
			case EDGE:
				driver = new EdgeDriver();
				break;
			case FIREFOX:
				driver = new FirefoxDriver();
				break;
			case IE:
				driver = new InternetExplorerDriver();
				break;
			case OPERA:
				driver = new ChromeDriver();
				break;
				
		}
		
		
		driver.get("https://accounts.google.com//signin//v2//identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		WebElement userField = driver.findElement(By.name("identifier"));
		userField.sendKeys(userName);
		driver.findElement(By.name("identifierNext")).click();
		
		try
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		WebElement passField = driver.findElement(By.name("password"));
		passField.sendKeys(password);
		driver.findElement(By.id("passwordNext")).click();
		
		
	}
	
}
