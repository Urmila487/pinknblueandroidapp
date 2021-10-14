package appiumtests;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SignupSignin {
	
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
		
		//Click Signup/Signin button
		MobileElement SignUp = driver.findElement(By.id("com.flair.pinknblue:id/btnSignup"));
		SignUp.click();
		
		// Select Girl image
		MobileElement selectGirl = driver.findElement(By.id("com.flair.pinknblue:id/llUnSelectedGirl"));
		selectGirl.click();
		
		// Enter Kids name
		MobileElement kidsName = driver.findElement(By.id("com.flair.pinknblue:id/etChildName"));
		kidsName.click();
		kidsName.sendKeys("Kavya");
		
		// Click to DD
		MobileElement DD = driver.findElement(By.id("com.flair.pinknblue:id/tvDay"));
		DD.click();
		
		//Click to Confirm button
		MobileElement Confirm = driver.findElement(By.id("com.flair.pinknblue:id/btn_confirm"));
		Confirm.click();
		
		//Click to Mom 
		MobileElement Mom = driver.findElement(By.id("com.flair.pinknblue:id/btnMom"));
		Mom.click();
	
		//Click to arrow button
		MobileElement Submit = driver.findElement(By.id("com.flair.pinknblue:id/ibSubmit"));
		Submit.click();
		
		// Enter Phone number
		MobileElement EnterNumber = driver.findElement(By.id("com.flair.pinknblue:id/etPhoneNumber"));
		EnterNumber.click();
		EnterNumber.sendKeys("9925089456");
		
		//Click arrow button
		MobileElement arrowBtn = driver.findElement(By.id("com.flair.pinknblue:id/ivOtp"));
		arrowBtn.click();
		
		// Enter OTP
		MobileElement otp1 = driver.findElement(By.id("com.flair.pinknblue:id/etOtp1"));
		otp1.click();
		otp1.sendKeys("1234");
		
		// Print Application Completed
		System.out.println("Application Completed");
	}

	
}
