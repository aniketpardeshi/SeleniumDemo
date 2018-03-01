package MasterPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver dr;
	public static Properties prop;
	
	
	
	public Base() throws IOException
	{
		
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\ObjectRepository\\ObjectRepo.properties");
		
		 prop= new Properties();
		
		prop.load(fis);
		
		
		if (prop.getProperty("browser").equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\java\\com\\mercury\\ThirdPartyDrivers\\chromedriver.exe" );
			
			dr= new ChromeDriver();
		}else if(prop.getProperty("browser").equals("ff"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"src\\test\\java\\com\\mercury\\ThirdPartyDrivers\\geckodriver.exe" );
			dr= new FirefoxDriver();
			
		}
		else
		{
			
		}
		
		
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dr.manage().window().maximize();
		
		dr.get("http://newtours.demoaut.com/");
	}
	
	
	public static void custom_sendKeys(String ElementtoFind,String TexttoSent)
	{
		dr.findElement(By.xpath(ElementtoFind)).sendKeys(TexttoSent);
	}
	
	
	public static void custom_click(String Elementtoclicked)
	{
		dr.findElement(By.xpath(Elementtoclicked)).click();
	}


	
}
