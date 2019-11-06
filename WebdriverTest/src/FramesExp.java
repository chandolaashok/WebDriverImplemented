import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;
public class FramesExp {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jharna.agrawal\\Desktop\\AshokDataALL\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		 //driver.findElement(By.tagName("iframes")).getSize();// to find number of frames present in your page
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));//  we can use frames three ways, 1. by id
		// 2. by string or 3 By Web element , so here we are using web element (by taking web element inside the frame.)
		
		driver.findElement(By.id("draggable")).click();	
		Actions a = new Actions(driver);// now to perform drag and drop functionality we have to use actions class here
		WebElement source= driver.findElement(By.id("draggable")); 
		WebElement target= driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();//to come out from frames
	  
	  
	} 
	
	
	
}
