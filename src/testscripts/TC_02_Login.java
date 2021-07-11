package testscripts;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.Mylestones.General;

public class TC_02_Login  {
   @Test
   public void TC_02_LOGIN() throws Exception {
	   General j = new General();
	   
	   j.openapplication();
	   Reporter.log("Application is opened");
	   System.out.println("Application is opened");
	  
	   j.Login();
	   Reporter.log("login is completed");
	   System.out.println("Login is completed");
	   Thread.sleep(3000);
	   
	   
	   j.closeapplication();
	   Reporter.log("Application is closed");
	   System.out.println("Application is closed");
	   
   }
}
