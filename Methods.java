package mini_Project;
import java.io.File;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Methods {
	public static WebDriver driver;
	public static void sendkey(WebElement element, String Value) {
		
		element.sendKeys(Value);

	}

	public static void click(WebElement element) 
	{
		element.click();

	}
	public static void Driver(String browser) {
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium_Demo\\Driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		
	}
	public static void Browser(String URL) {
		driver.get(URL);

	}

	public static void sleep(long value) throws Throwable {
		Thread.sleep(value);

	}

	public static void close(WebElement element) {
		driver.close();
	}
	
	public static void scroll(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)");
	}
	
	public static void moveelement(WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	public static void Screenshot(String name) throws Throwable
	{	
	TakesScreenshot scr = (TakesScreenshot) driver;	
	File Sas = scr.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium_Project\\Screenshot\\"+name+".png");
	FileHandler.copy(Sas, dest);
	}
	public static void max()
	{
		driver.manage().window().maximize();
	}

}
