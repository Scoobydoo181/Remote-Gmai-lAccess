package com.github.Scoobydoo181.Gmail;

import java.util.Scanner;

public class UserInterface
{
	public static synchronized void cmdPrompt()
	{
		System.out.println("Welcome to Remote Gmail Access, please select the browser you wish to use:\n ");
		
		System.out.println("Press: ");
		System.out.println("'A' for [Google Chrome]");
		System.out.println("'B' for [InternetExplorer]");
		System.out.println("'C' for [Microsoft Edge]");
		System.out.println("'D' for [Firefox]");
		System.out.println("'E' for [Opera]");
		
		Scanner in = new Scanner(System.in);
		
		String browser = in.nextLine();
		
		
		Browsers selectedBrowser = Browsers.CHROME;
		
		switch(browser)
		{
			case "A":
				selectedBrowser = Browsers.CHROME;
				break;
		
			case "B":
				selectedBrowser = Browsers.IE;
				break;
			case "C":
				selectedBrowser = Browsers.EDGE;
				break;
			case "D" :
				selectedBrowser = Browsers.FIREFOX;
				break;
			case "E" :
				selectedBrowser = Browsers.OPERA;
				break;
		}
		
		WebAccess gmailThread = new WebAccess(selectedBrowser + "", selectedBrowser);
		
		System.out.println("Please enter your Gmail address: ");
		String userName = in.nextLine();
		gmailThread.setUserName(userName);
		
		System.out.println("Please enter your Gmail password: ");
		String password = in.nextLine();
		gmailThread.setPassword(password);
		
		gmailThread.start();
		
		try
		{
			gmailThread.join();
		} 
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
}
