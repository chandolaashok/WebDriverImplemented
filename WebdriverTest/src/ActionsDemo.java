import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;
public class ActionsDemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jharna.agrawal\\Desktop\\AshokDataALL\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Actions a = new Actions(driver); //driver will now get the capabilities of action class
		WebElement move= driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		//ActionsDemo.javaFor File Upload option we can remove the "Communication" section since none of the mentioned buttons are available in this type of event.a.moveToElement(move).build().perform();// move to specific element, but passing that web elemt as an argument.
		// now we need to build this entire action, 
		//build and perform can perform other actions as well now....
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		 
			}

}
