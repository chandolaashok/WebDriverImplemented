import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;
public class TableExc {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jharna.agrawal\\Desktop\\AshokDataALL\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("");
	     WebElement table = driver.findElement(By.cssSelector(""));
	    int RowCount = table.findElements(By.cssSelector("#innings_1 > div:nth-child(4)")).size();//it will give us the row count but our intrust is at the third child
	    int count= table.findElements(By.cssSelector("#innings_1 > div:nth-child(4) div:nth-child(3) div:nth-child(3)']")).size();
	    for(int i=0; i<count; i++)
	    {
	    System.out.println(table.findElements(By.cssSelector("#innings_1 > div:nth-child(4) div:nth-child(3)']")).get(i).getText());
	    }
		
	}

}
