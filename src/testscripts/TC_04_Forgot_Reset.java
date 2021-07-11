package testscripts;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.Mylestones.General;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
public class TC_04_Forgot_Reset{

	@Test
	public void TC_04Forgot_reset() throws Exception {
		General j = new General();
		j.openapplication();
		   Reporter.log("Application is opened");
		   System.out.println("Application is opened");
		 j.forgot_reset_password();	   
		 j.closeapplication();

	}


}

