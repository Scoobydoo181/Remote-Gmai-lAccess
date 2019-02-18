package com.github.Scoobydoo181.Gmail;

public enum Browsers
{
	CHROME("C:\\Users\\scoob\\OneDrive\\Documents\\Programming Projects\\Java\\GithubProjects\\RemoteGmailAccess\\BrowserDrivers\\chromedriver.exe","webdriver.chrome.driver"),
	IE("C:\\Users\\scoob\\OneDrive\\Documents\\Programming Projects\\Java\\GithubProjects\\RemoteGmailAccess\\BrowserDrivers\\IEDriverServer.exe","webdriver.ie.driver"),
	EDGE("C:\\Users\\scoob\\OneDrive\\Documents\\Programming Projects\\Java\\GithubProjects\\RemoteGmailAccess\\BrowserDrivers\\MicrosoftWebDriver.exe","webdriver.edge.driver"),
	FIREFOX("C:\\Users\\scoob\\OneDrive\\Documents\\Programming Projects\\Java\\GithubProjects\\RemoteGmailAccess\\BrowserDrivers\\geckodriver.exe","webdriver.firefox.driver"),
	OPERA("C:\\Users\\scoob\\OneDrive\\Documents\\Programming Projects\\Java\\GithubProjects\\RemoteGmailAccess\\BrowserDrivers\\operadriver.exe","webdriver.opera.driver");
	
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
