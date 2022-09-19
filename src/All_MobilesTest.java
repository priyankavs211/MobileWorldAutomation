import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class All_MobilesTest {

	
	WebDriver driver;
	@AfterMethod
	public void closeBro() {
	BrowserFactory.QuitBrowser(driver);
	}

	    @Parameters({"valid mobile name"})
	    @Test(description = "User is able to get details of the searched mobile name ",priority=1)
	    public void ValidSearchName() throws InterruptedException
	    {
	    	
	        driver = BrowserFactory.startapplication(driver, "Chrome", " https://mobileworld.banyanpro.com/");
	        All_mobiles_pom lgnpage = PageFactory.initElements(driver, All_mobiles_pom.class);
	        lgnpage.Allmobiles("Samsung galaxy s21");
	        String bodyText = driver.findElement(By.tagName("td")).getText();
	        Assert.assertTrue(bodyText.contains("Samsung Galaxy S21"));

	        
	        
	     
               }

                
    @Parameters({"Space before mobile name"})
    @Test(description = "Users is not  able to get details of the searched mobile name ",priority=2)
    public void Space() throws InterruptedException
     {
        	    	
      driver = BrowserFactory.startapplication(driver, "Chrome", " https://mobileworld.banyanpro.com/");
      All_mobiles_pom lgnpage = PageFactory.initElements(driver, All_mobiles_pom.class);
      lgnpage.Allmobiles("  Samsung galaxy s21");
      String bodyText = driver.findElement(By.tagName("td")).getText();
      Assert.assertTrue(bodyText.contains("Samsung Galaxy S21"));
     
        	        
        	        
      }
    @Parameters({"Mobile name which is not in the list"})
    @Test(description = "Users is not  able to get details of the searched mobile name ",priority=3)
    public void NoMobilename() throws InterruptedException
     {
        	    	
      driver = BrowserFactory.startapplication(driver, "Chrome", " https://mobileworld.banyanpro.com/");
      All_mobiles_pom lgnpage = PageFactory.initElements(driver, All_mobiles_pom.class);
      lgnpage.Allmobiles("Oppo A7");
      String bodyText = driver.findElement(By.tagName("td")).getText();
      Assert.assertTrue(bodyText.contains("Oppo A7"));
     
        	        
        	        
      }
    @Parameters({"Mobile name which conatins special character"})
    @Test(description = "Users is not  able to get details of the searched mobile name ",priority=3)
    public void SpecialCharacter() throws InterruptedException
     {
        	    	
      driver = BrowserFactory.startapplication(driver, "Chrome", " https://mobileworld.banyanpro.com/");
      All_mobiles_pom lgnpage = PageFactory.initElements(driver, All_mobiles_pom.class);
      lgnpage.Allmobiles("apple $%");
      String expectederrormsg = "Do not enter special characters";
      WebElement actualmsg=driver.findElement(null);
      
      Assert.assertEquals(actualmsg, expectederrormsg);
     
        	        
        	        
      }

    
    
}
