package com.generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InitializeTearDownEnvironment {
	private WebDriver webDriver;
	
	
	
	public WebDriver InitializeWebEnvironment(Properties objConfig)
	{
		String sBrowser = objConfig.getProperty("web.browse").trim().toLowerCase();
		
		switch(sBrowser)
		{
			case "chrome":
				System.setProperty("webdriver.chrome.driver", objConfig.getProperty("webdriver.chrome.driver").trim());
				
				
				ChromeOptions options = new ChromeOptions();
				Map<String, Object> prefs = new HashMap<String, Object>();
				prefs.put("profile.default_content_settings.popups", 0);
				options.setExperimentalOption("prefs", prefs);
				
				webDriver = new ChromeDriver(options);
				
		}		
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		return webDriver;
	}
}
