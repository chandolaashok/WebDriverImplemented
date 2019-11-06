import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestChrome {
	public static void main(String args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jharna.agrawal\\Desktop\\AshokDataALL\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		// driver.findElement(By.xpath("//*[@class='btn_lnks
		// btn_login']/span/text()")).submit();
		// String currentURL = driver.getCurrentUrl();
		// System.out.println(currentURL);
		// driver.findElement(By.id("login_email"));// web_element is an another
		// interface
		driver.findElement(By.cssSelector("#email"));

		driver.findElement(By.id("email")).sendKeys("This is my first code");
		driver.findElement(By.name("pass")).sendKeys("123454");
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.close();
		//WebDriverWait ww = new WebDriverWait(driver,5);
		//ww.until(ExpectedConditions.invisibilityOfElementLocated(locator));
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("jfgj"));
		a.moveToElement(driver.findElement(By.cssSelector("ljdfs"))).build().perform();
	//a.moveToElement(driver.findElement(By.cssSelector("sufh"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		//a.moveToElement(move).contextClick().build().perform();
	    driver.switchTo().window(args);// provide the window handel id here.. 
		Set<String> ids=driver.getWindowHandles();		
		Iterator<String> it=ids.iterator();
		String parentid=it.next();// it will grab the id (parent id)
	      String child=it.next();
	      driver.switchTo().frame(driver.findElement(By.cssSelector("kjhsij"))); // using web element
	      Actions aa = new Actions(driver);
	        WebElement source=driver.findElement(By.cssSelector("jhsk"));
	       WebElement destination=driver.findElement(By.className("kjgsljd"));
	aa.dragAndDrop(source, target)
	}

}
