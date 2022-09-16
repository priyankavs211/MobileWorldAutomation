import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {

WebDriver driver;

@AfterMethod
public void closeBro() {
BrowserFactory.QuitBrowser(driver);
}
    @Parameters({"validusername ", "validpassword"})
    @Test(description = "User is able to login with valid username and valid password",priority=1)
    public void ValidloginApp() throws InterruptedException
    {
    	
        driver = BrowserFactory.startapplication(driver, "Chrome", " https://mobileworld.banyanpro.com/");
        LoginPage lgnpage = PageFactory.initElements(driver, LoginPage.class);
        lgnpage.loginto("priya", "123ac");
        
        
    }
    @Parameters({"Invalidusername ", "validpassword"})
    @Test(description = "User is able to login with invalid username and valid password",priority=2)
    public void InValidloginApp() throws InterruptedException
    {
    	
        driver = BrowserFactory.startapplication(driver, "Chrome",          " https://mobileworld.banyanpro.com/");
        LoginPage lgnpage = PageFactory.initElements(driver, LoginPage.class);
        lgnpage.loginto("p", "1ac23");
        String expectedURL = "https://mobileworld.azurewebsites.net/sign.html";
        String actualURL = driver.getCurrentUrl();
        
        Assert.assertEquals(actualURL, expectedURL);
       
       
    }
    @Parameters({"validusername ", "invalidpassword"})
    @Test(description = "User is able to login with valid username and invalid password",priority=3)
    public void InValidPasswordApp() throws InterruptedException
    {
    	
        driver = BrowserFactory.startapplication(driver, "Chrome",          " https://mobileworld.banyanpro.com/");
        LoginPage lgnpage = PageFactory.initElements(driver, LoginPage.class);
        lgnpage.loginto("priya", "123");
        String expectedURL = "https://mobileworld.azurewebsites.net/sign.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
       
//        BrowserFactory.QuitBrowser(driver);
    }
    @Parameters({"Nousername ", "Nopassword"})
    @Test(description = "User is able to login with no username and no password",priority=4)
    public void InValidLogin() throws InterruptedException
    {
    	
        driver = BrowserFactory.startapplication(driver, "Chrome",          " https://mobileworld.banyanpro.com/");
        LoginPage lgnpage = PageFactory.initElements(driver, LoginPage.class);
        lgnpage.loginto("", "");
        String expectedURL = "https://mobileworld.azurewebsites.net/sign.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);

        
//        BrowserFactory.QuitBrowser(driver);
        
    }
    @Parameters({"username ", "Nopassword"})
    @Test(description = "User is able to login with  username and no password",priority=5)
    public void InValidLogin2() throws InterruptedException
    {
    	
        driver = BrowserFactory.startapplication(driver, "Chrome",          " https://mobileworld.banyanpro.com/");
        LoginPage lgnpage = PageFactory.initElements(driver, LoginPage.class);
        lgnpage.loginto("abcd", "");
        String expectedURL = "https://mobileworld.azurewebsites.net/sign.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
//        BrowserFactory.QuitBrowser(driver);
        
    }
    @Parameters({"Nousername ", "password"})
    @Test(description = "User is able to login with  username and no password",priority=6)
    public void InValidLogin3() throws InterruptedException
    {
    	
        driver = BrowserFactory.startapplication(driver, "Chrome",          " https://mobileworld.banyanpro.com/");
        LoginPage lgnpage = PageFactory.initElements(driver, LoginPage.class);
        lgnpage.loginto("", "abc123");
        String expectedURL = "https://mobileworld.azurewebsites.net/sign.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
//        BrowserFactory.QuitBrowser(driver);
        
    }
    
}
