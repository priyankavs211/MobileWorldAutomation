import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sign_UPTest {
	
	WebDriver driver;

	

    	

    @Parameters({"Invalid Firstname","valid last name","valid email","valid password","valid DOB","valid Gender","valid phone number","Short Bio"})
    @Test(description = "User is able to login with with less than 3 characters and more than 20 characters",priority=2)
    public void InValidLogin() throws InterruptedException
    {
    	
        driver = BrowserFactory.startapplication(driver, "Chrome",          " https://mobileworld.banyanpro.com/");
        Signuppom_page lgnpage = PageFactory.initElements(driver, Signuppom_page.class);
        lgnpage.SignUpApp("re", "pri","priyanka@gmail.com","re13","2/12/2000","9497752084","hi hello");
        
        String expectederrormsg = "Do not enter less than 3 character";
        String actualmsg = driver.getTitle();
        
        Assert.assertEquals(actualmsg, expectederrormsg);

        
//        BrowserFactory.QuitBrowser(driver);
        
    }
    @Parameters({"Valid Firstname ","Invalid last name","valid email","valid password","valid DOB","valid Gender","valid phone number","Short Bio"})
    @Test(description = "User is able to login with with more than 3 characters and less than 20 characters",priority=2)
    public void InValidlogin2() throws InterruptedException
    {
    	
        driver = BrowserFactory.startapplication(driver, "Chrome",          " https://mobileworld.banyanpro.com/");
        Signuppom_page lgnpage = PageFactory.initElements(driver, Signuppom_page.class);
        lgnpage.SignUpApp("rep", "priyankavschyrytfghchfsd","priyanka@gmail.com","re13","2/12/2000","9497752084","hi hello");
        
        
        String expectederrormsg = "Do not enter more than 20 characters";
        String actualmsg = driver.getTitle();
        
//        Assert.assertEquals(actualmsg, expectederrormsg);

        
//        BrowserFactory.QuitBrowser(driver);
        
    }

	
}
