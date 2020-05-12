package com.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest extends Pojo{

	private WebDriver webDriver;
	private WebDriverWait webDriverWait;
	private Properties objConfig;
	private InitializeTearDownEnvironment objInitializeTearDownEnvironment;
	
	
	
	public  void initializeWebEnvironment()
	{
		this.loadConfigProperties();
		objInitializeTearDownEnvironment = new InitializeTearDownEnvironment();
		webDriver = objInitializeTearDownEnvironment.InitializeWebEnvironment(objConfig);
		
		this.setDriver(webDriver);
		
		webDriverWait = new WebDriverWait(webDriver, 10);
		
		
		
	}
	
	public void loadConfigProperties()
	{
		objConfig = new Properties();
		try {
			objConfig.load(new FileInputStream("D:\\1_Automation_Testing\\MavenProject\\LOVE_Automation_Trinity_Framework\\src\\test\\java\\resources\\config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
}
