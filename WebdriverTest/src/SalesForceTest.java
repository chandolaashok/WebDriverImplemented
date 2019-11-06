import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
public class SalesForceTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jharna.agrawal\\Desktop\\AshokDataALL\\chromedriver\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://login.salesforce.com");
		 driver.findElement(By.id("username")).sendKeys("Sales force test");//handle Edit boxes
		 driver.findElement(By.name("pw")).sendKeys("Passs173953");
		 //System.out.println(driver.getTitle());
		   //driver.findElement(By.xpath("//*[@class='btn_lnks btn_login']/span/text()")).submit();
		   //String currentURL = driver.getCurrentUrl();
		   //System.out.println(currentURL);
		   //driver.findElement(By.id("login_email"));// web_element is an another interface 
		   
		//driver.findElement(By.id("email")).sendKeys("This is my first code");
		  // driver.findElement(By.name("pass")).sendKeys("123454");
		   //driver.findElement(By.linkText("Forgotten account?")).click();
		  
	          driver.findElement(By.xpath("//*[@id='Login']")).click();
	          
	          
		  driver.close();
		  
		 
		   

		
		
	}

}
