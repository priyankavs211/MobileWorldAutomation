import java.net.HttpURLConnection;
import org.openqa.selenium.UnhandledAlertException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sign_UPTest {
	
WebDriver driver;
@AfterMethod
public void closeBro() {
BrowserFactory.QuitBrowser(driver);
}
    
	

    	

    @Parameters({"Invalid Firstname","valid last name","valid email","valid password","valid DOB","valid Gender","valid phone number","Short Bio"})
    @Test(description = "User is able to login with with less than 3 characters and more than 20 characters",priority=2)
    public void InValidLogin() throws InterruptedException
    {
    	
        driver = BrowserFactory.startapplication(driver, "Chrome",          " https://mobileworld.banyanpro.com/");
        Signuppom_page lgnpage = PageFactory.initElements(driver, Signuppom_page.class);
        lgnpage.SignUpApp("re", "pri","priyanka@gmail.com","re13","2/12/2000","9497752084","hi hello");
        Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/signup.html");
        
//        BrowserFactory.QuitBrowser(driver);
        
    }
    @Parameters({"Valid Firstname ","Invalid last name","valid email","valid password","valid DOB","valid Gender","valid phone number","Short Bio"})
    @Test(description = "User is able to login with with more than 3 characters and less than 20 characters",priority=2)
    public void InValidlogin2() throws InterruptedException
    {
    	
        driver = BrowserFactory.startapplication(driver, "Chrome",          " https://mobileworld.banyanpro.com/");
        Signuppom_page lgnpage = PageFactory.initElements(driver, Signuppom_page.class);
        lgnpage.SignUpApp("rep", "priyankavschyrytfghchfsd","priyanka@gmail.com","re13","2/12/2000","9497752084","hi hello");
     // Get the typed value
        Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/signup.html");
      
     		
       
        
//        BrowserFactory.QuitBrowser(driver);
        
    }
    @Parameters({"Valid Firstname ","valid last name","invalid email","valid password","valid DOB","valid Gender","valid phone number","Short Bio"})
    @Test(description = "User is unable to login without putting @ symbol ",priority=3)
    public void InValidlogin3() throws InterruptedException
    {
    	
        driver = BrowserFactory.startapplication(driver, "Chrome",          " https://mobileworld.banyanpro.com/");
        Signuppom_page lgnpage = PageFactory.initElements(driver, Signuppom_page.class);
        lgnpage.SignUpApp("rep", "priyanka","priyanka","re13","2/12/2000","9497752084","hi hello");
        
        WebElement emailField = driver.findElement(By.xpath("//input[ @type='Email']"));
        
        System.out.println(emailField.getAttribute("validationMessage"));
       
       
    
    }
    @Parameters({"Valid Firstname ","valid last name","valid email","valid password","NO DOB","valid Gender","valid phone number","Short Bio"})
    @Test(description = "User is unable to login without giving DOB ",priority=4)
    public void InValidlogin4() throws InterruptedException
    {
    	
        driver = BrowserFactory.startapplication(driver, "Chrome",          " https://mobileworld.banyanpro.com/");
        Signuppom_page lgnpage = PageFactory.initElements(driver, Signuppom_page.class);
        lgnpage.SignUpApp("rep", "priyanka","priyanka","re13","","9497752084","hi hello");
        
        WebElement dateofbirth= driver.findElement(By.xpath("//input[@type='date']"));
        Assert.assertEquals("https://mobileworld.banyanpro.com/signup.html", driver.getCurrentUrl());
       
       
       
    
    }
        
      
    

        
//        BrowserFactory.QuitBrowser(driver);
        
    }

	

