package com.Mylestones;
import org.openqa.selenium.WebDriver;

public class Global {
//list of all variables to be used 
	
	public WebDriver driver;
	public String url = "https://staging.mylestones.com/";
	
	public String firstname = "Jaya"   ;
	
	public String lastname  = "krishna";
	
	public String email     = "aabbccddeeffgghh@gmail.com" ;
	
	public String pwd       = "1a2a3a" ;  
	
//list of all objects to be used
	public String first          =   "first_name" ;
	public String last           =   "last_name"  ;
	public String emailfind      =   "user_email" ;
	public String pwdfind        =   "user_password" ;
	public String signup         =   "user_sign_up"  ;
}