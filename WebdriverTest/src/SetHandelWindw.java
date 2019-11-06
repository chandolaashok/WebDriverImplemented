import java.io.File;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import javax.swing.plaf.FileChooserUI;
import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.reporters.jq.Main;

public class SetHandelWindw {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jharna.agrawal\\Desktop\\AshokDataALL\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin");
		driver.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[1]/span/div/div/a")).click();
		System.out.println("before switch");
		System.out.println(driver.getTitle());

		Set<String> ids = driver.getWindowHandles(); // window will be in a form
														// of strings , if there
														// are 4 window handle
														// id's it will result
														// to 4 window
		// set id in the form of strings, // like child id , then to child and
		// then again sub child, and these we need to store in set
		Iterator<String> it = ids.iterator();
		// String parentid=it.next();// will go to parent and grab the ID
		String childID = it.next();// it will go to child (one more step down)
									// an it will grab the child id.
		driver.switchTo().window(childID);
		System.out.println("After switching");
		System.out.println(driver.getTitle());
		// driver.switchTo().alert().driver.switchTo().alert().getText();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = " return documnet.getelementById(\\\"jhsgdljhgs\\\").value";
		String text = (String) js.executeScript(script);
		System.out.println(text);

		//DesiredCapabilities cd = new DesiredCapabilities();// customize chrome
		//cd.acceptInsecureCerts();
		//ChromeOptions c = new ChromeOptions();
		//c.merge(cd);

		
		
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
		
		
		
	File  src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	}

}
