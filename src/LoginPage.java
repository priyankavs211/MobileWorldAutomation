import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

  @FindBy(xpath="//button[@type='submit']")
    WebElement signin;
    
  @FindBy(id="username")
    WebElement username;
    
  @FindBy(id="password")
    WebElement password;
    
  @FindBy(xpath="//a[@type='submit']")
    WebElement LogIn;
    
   
    
  
//sign_in pom
  public void loginto(String usrnme, String pswrd) throws InterruptedException
  {
  	signin.click();
  	Thread.sleep(1000);
      username.sendKeys(usrnme);
      Thread.sleep(1000);
      password.sendKeys(pswrd);
      Thread.sleep(1000);
      LogIn.click();
  }
  
  
  
}
