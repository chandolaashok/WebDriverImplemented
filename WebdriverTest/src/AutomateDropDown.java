import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

public class AutomateDropDown {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jharna.agrawal\\Desktop\\AshokDataALL\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		// a[@value='BLR']
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());// if
																													// it
																													// returns
																													// true
																													// it
																													// means
																													// chk
																													// box
																													// is
																													// select
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());// if
																													// it
																													// returns
																													// true
																													// it
																													// means
																													// chk
																													// box
																													// is
																													// selected

		// count number of chekboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		// driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		// driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.id("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		// driver.findElement(By.xpath("//span[contains(text(),'Hotels')]")).click();
		Select s = new Select(driver.findElement(By.id("ddl_Adult_MST")));
		// s.selectByIndex(6);
		// s.selectByValue("india");
		s.deselectByVisibleText("5 is visible");
		// driver.findElement(By.id("ljdhkj")).sendKeys(Keys.ENTER);
		// driver.findElement(By.id("sbdhb")).sendKeys(Keys.DOWN);
		// driver.findElement(By.id("sbdhb")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("lshgj")).getAttribute("style").contains("");

		// s.selectByValue("2");
		// s.selectByVisibleText("5");

	}

}
