package com.github.Scoobydoo181.Gmail;

public enum Browsers
{
	CHROME("BrowserDrivers\\chromedriver.exe","webdriver.chrome.driver"),
	IE("BrowserDrivers\\IEDriverServer.exe","webdriver.ie.driver"),
	EDGE("BrowserDrivers\\MicrosoftWebDriver.exe","webdriver.edge.driver"),
	FIREFOX("BrowserDrivers\\geckodriver.exe","webdriver.firefox.driver"),
	OPERA("BrowserDrivers\\operadriver.exe","webdriver.opera.driver");
	
	private String fileLocation;
	private String sysProperty;
	Browsers(String location, String sysProperty)
	{
		fileLocation = location;
		this.sysProperty = sysProperty;
	}
	
	public String getLocation()
	{
		return fileLocation;
	}
	
	public String getProperty()
	{
		return sysProperty;
	}
}
