package testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.Mylestones.General;

public class TC_01_Signup {
	@Test
	public void TC01() throws Exception {
		General j = new General();
		j.openapplication();
		Reporter.log("Application is opened");
		System.out.println("Application is opened");
		
		j.register_signup();
		Reporter.log("New user Sign-up is completed");
		System.out.println("New user Sign-up is completed");
		
		j.closeapplication();
		Reporter.log("Application is closed");
		System.out.println("Application is closed");
	}
}
