package com.mercury.Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mecury.Pages.MainPage;

public class MainPageTests {
	
	public MainPage mp;
	
	@Test
	public void _doLogin() throws IOException
	{
		mp= new MainPage();
		mp.login_fun();
				
	}

	
	@Test
	public void _doResgiter()
	{
		mp.register_fun();
	}
	
	

	@Test
	public void _doSupport()
	{
		mp.supoort_fun();;
	}
	
	@Test
	public void _doContact()
	{
		mp.contact_fun();
	}
}
