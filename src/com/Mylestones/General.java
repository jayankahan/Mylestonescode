package com.Mylestones;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class General extends Global {
	
	public void openapplication() throws Exception{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\JAYAKRISHNA\\Downloads\\java softwares\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url); 
		;}
	
	public void closeapplication() {
		driver.close();
	}
	
	//sign-up as new user
	public void register_signup() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-danger btn-register register_button_redirect']")).click();
		driver.findElement(By.id(first)).sendKeys(firstname);
		driver.findElement(By.id(last)).sendKeys(lastname);
		driver.findElement(By.id(emailfind)).sendKeys(email);
		driver.findElement(By.id(pwdfind)).sendKeys(pwd);
		driver.findElement(By.id(signup)).click();
		Thread.sleep(2300);
		}
	
	
	public void Logout() throws Exception {
		Thread.sleep(2300);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		Thread.sleep(2300);
		driver.findElement(By.xpath("//img[@src='assets/img/logout.svg']")).click();
		
	}
	public void Login() throws Exception {

		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(2300);
		driver.findElement(By.id(emailfind)).sendKeys(email);
		driver.findElement(By.name(pwdfind)).sendKeys(pwd);
		driver.findElement(By.id("sign_up_button")).click();
		Thread.sleep(2300);
		}
	
	public void loginclick() throws Exception{
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(2300);
	}
	public void escapekey() throws Exception {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		Thread.sleep(2300);
	}
	public void forgot_reset_password() throws Exception{
		Thread.sleep(2300);
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Forgot your password?")).click();Thread.sleep(2300);
		Thread.sleep(3000);
		driver.findElement(By.id("user_login")).sendKeys(email);
		driver.findElement(By.xpath("//button[@class='form-submit btn btn-primary']")).click();                //class="form-submit btn btn-primary"
		Thread.sleep(2300);
	}
}
