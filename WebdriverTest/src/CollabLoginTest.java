import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class CollabLoginTest {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jharna.agrawal\\Desktop\\AshokDataALL\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://c8.ai");
		driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div[2]/div/a[1]/span")).click();

		driver.findElement(By.xpath("//*[@id='login_emai']")).sendKeys("ashok.chandola@brickwin.net");
		driver.findElement(By.xpath("//*[@id='pwd']")).sendKeys("ashokchandola93@");
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[6]/a[1]")).click();
		// driver.findElement(By.xpath("/html/body/section/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/div/a")).click();

	}

}
