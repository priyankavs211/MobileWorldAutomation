import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signuppom_page {
	
	
 @FindBy(xpath="//button[@type='submit']")
	  WebElement SignIn;

 @FindBy(linkText="Sign up")
    WebElement signUp;
    
  @FindBy(id="myName")
  WebElement FirstName;
  
  @FindBy(xpath="//input[@placeholder='Last Name']")
  WebElement LastName;
  
  @FindBy(xpath="//input[@placeholder='Enter Email']")
  WebElement Email;
  
  @FindBy(xpath="//input[@placeholder='Password']")
  WebElement passwd;
  
  @FindBy(xpath="//input[@type='date']")
  WebElement dateofbirth;
  
  @FindBy(xpath="//div[@class='col-md-2']//input[@name='gender']")
  WebElement male;
  
  @FindBy(xpath="//div[@class='col-md-3']//input[@name='gender']")
  WebElement female;
  
  @FindBy(xpath="//input[@placeholder='91XXXXXXXXXX']")
  WebElement Mobile;
  
  
  @FindBy(xpath="//textarea[@placeholder='Short Bio']")
  WebElement Bio;
  
  @FindBy(xpath="//button[@type='submit']")
  WebElement register;
  
  
  @FindBy(xpath="//button[@type='Submit']")
  WebElement Sign_In;
  
 
  
  public void SignUpApp(String Fname,String Lname,String eml,String pssd,String dob,String phonenumber,String Shtbio ) throws InterruptedException
  {
	  SignIn.click();
	  
	  
	  signUp.click();
      
      
      FirstName.sendKeys(Fname);
     
      LastName.sendKeys(Lname);
      
      Email.sendKeys(eml);
     
      passwd.sendKeys(pssd);
      
      dateofbirth.sendKeys(dob);
      
      male.click();
     
      Mobile.sendKeys(phonenumber);
      Thread.sleep(2000);
      
      Bio.sendKeys(Shtbio);
      Thread.sleep(2000);
     
      register.click();
      Thread.sleep(2000);
      
      
    
      //Sign_In.click();
      //Thread.sleep(2000);
      
      
      
      
     
  } 
 
}
