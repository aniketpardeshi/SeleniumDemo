package com.mecury.Pages;

import java.io.IOException;

import org.openqa.selenium.By;

import MasterPage.Base;

public class MainPage extends Base {

	
	
	
	private static final String Texttoclick = null;

	public MainPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public void login_fun() throws IOException
	{
		    
			Base.custom_sendKeys(prop.getProperty("xpath_username_textbox"), prop.getProperty("usrname"));
			
			Base.custom_sendKeys(prop.getProperty("xpath_password_textbox"), prop.getProperty("password"));
			
			Base.custom_click(prop.getProperty("xpath_login_button"));
			
			
			//dr.findElement(By.xpath(prop.getProperty("xpath_username_textbox"))).sendKeys(prop.getProperty("usrname"));
			//dr.findElement(By.xpath(prop.getProperty("xpath_password_textbox"))).sendKeys(prop.getProperty("password"));
			
			//Base.custom_click(prop.getProperty("xpath_login_button")Textclick();
			
			//dr.findElement(By.xpath(prop.getProperty("xpath_login_button"))).click();
			
			dr.quit();
	}
	
	public void register_fun()
	{
		System.out.println("I am in Resgiter functionality method");
	}
	
	public void supoort_fun()
	{
		System.out.println("I am in support functionality method");
	}
    
	public void contact_fun()
    {
    	System.out.println("I am in contact functionality method");
    }
}
