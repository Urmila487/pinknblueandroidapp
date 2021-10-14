package appiumtests;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ExperienceAppNowTest {
	
	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		try {
			openPinkNblue();
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}	

	}


	public static void openPinkNblue() throws Exception {
		
		//Set Desired Capabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Nokia 6.1 Plus");
		cap.setCapability("udid", "DRGID18091700128");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.flair.pinknblue");
		cap.setCapability("appActivity", "com.flair.pinknblue.activity.SplashActivity");
	
		//Set URL
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		
		//Print Application started
		System.out.println("Application Started");
		Thread.sleep(10000);
		
		//Click ExperienceApp Now button 
		MobileElement ExperienceAppNow = driver.findElement(By.id("com.flair.pinknblue:id/btnExperienceAppNow"));
		ExperienceAppNow.click();
		
		// Click Location
		MobileElement Location = driver.findElement(By.id("com.flair.pinknblue:id/tvLocationHome"));
		Location.click();
	
		// Select Location
		MobileElement SelectedLocation = driver.findElement(By.id("com.flair.pinknblue:id/tvLocation"));
		SelectedLocation.click();
		
		//Click Side Menu Icon (Right corner)
		MobileElement MenuIcon = driver.findElement(By.id("com.flair.pinknblue:id/menuIconImgVw"));
		MenuIcon.click();
		
		// Click Logout
		MobileElement Logout = driver.findElement(By.id("com.flair.pinknblue:id/llLogout"));
		Logout.click();
		
		// Click Yes,Sign up button
		MobileElement YesBtn = driver.findElement(By.id("com.flair.pinknblue:id/btnYes"));
		YesBtn.click();
		
		// Click Continue with Google button
		MobileElement ContinuewithGoogle = driver.findElement(By.id("com.flair.pinknblue:id/sign_in_button"));
		ContinuewithGoogle.click();
		
		// Click on Email id
		MobileElement accountDisplayName = driver.findElement(By.id("com.google.android.gms:id/account_display_name"));
		accountDisplayName.click();
		Thread.sleep(1000);
		
		// Click Exclusive Learning
		MobileElement Learning = driver.findElement(By.id("com.flair.pinknblue:id/tvTitle"));
		Learning.click();
		
		// Click Back arrow button
		MobileElement Backarrow = driver.findElement(By.id("com.flair.pinknblue:id/llBack"));
		Backarrow.click();
		
		// Print Application Completed
		System.out.println("Application Completed");
	}

}