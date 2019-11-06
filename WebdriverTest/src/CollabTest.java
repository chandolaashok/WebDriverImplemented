import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.ClickAction;
public class CollabTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jharna.agrawal\\Desktop\\AshokDataALL\\chromedriver\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://c8.ai/");
		 driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div[2]/div/a[1]/span")).click();
		 driver.findElement(By.xpath("//*[@id='login_email']")).sendKeys("ashok.chandola@brickwin.net");
		 driver.findElement(By.xpath("//*[@id='pwd']")).sendKeys("ashokchandola93@");
		 driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[6]/a[1]")).click();
		 //driver.findElement(By.xpath("/html/body/section/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/div/a")).click();
		 
		 
		 //driver.findElement(By.xpath("/html/body/section/div[2]/div[3]/div/div/div[1]/div[3]/div/div[2]/div[2]/div/div[2]/div/div[1]/a[1]")).click();
		 //driver.findElement(By.id("username")).sendKeys("Sales force test");//handle Edit boxes
		 //driver.findElement(By.name("pw")).sendKeys("Passs173953");
		 //System.out.println(driver.getTitle());
		   //driver.findElement(By.xpath("//*[@class='btn_lnks btn_login']/span/text()")).submit();
		   //String currentURL = driver.getCurrentUrl();
		   //System.out.println(currentURL);
		   //driver.findElement(By.id("login_email"));// web_element is an another interface 
		//driver.findElement(By.id("email")).sendKeys("This is my first code");
		  // driver.findElement(By.name("pass")).sendKeys("123454");
		   //driver.findElement(By.linkText("Forgotten account?")).click();
	          //driver.findElement(By.xpath("//*[@id='Login']")).click();
		  //driver.close();
		  
		 
		   

		
		
	}

}
