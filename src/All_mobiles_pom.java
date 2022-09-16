import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class All_mobiles_pom {
	
	@FindBy(linkText="All Mobiles")
	  WebElement allmobiles;
	  
	@FindBy(id="myInput")
	  WebElement search;  
	  public void Allmobiles(String MobileName) throws InterruptedException
	  {
		  allmobiles.click();
		  Thread.sleep(2000);
		  search.sendKeys(MobileName);
		  Thread.sleep(2000);
		  
	  }
	  

}
