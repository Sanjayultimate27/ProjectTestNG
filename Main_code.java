package mini_Project;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Main_code extends Methods {
	public static Logger log = Logger.getLogger(Main_code.class);
public static void main(String[] args) throws Throwable {
		BasicConfigurator.configure();
		FileInputStream f = new FileInputStream(".\\src\\test\\java\\mini_Project\\Hide.properties");
		Properties p = new Properties();
		p.load(f);
		
		Driver(p.getProperty("driver"));
		Browser(p.getProperty("Browser"));
		log.info("Browser Launched");
		max();
		sleep(3000);
		
		PageFactory.initElements(driver, POM.getInstance());
		
		POM.getUn().sendKeys(p.getProperty("UserName"));
		log.info("Username entered");
		
		POM.getPd().sendKeys(p.getProperty("Password"));
		log.info("Password entered");
		
		POM.getSignin().click();
		click(POM.getSignin());
		log.info("Account signed In");
		sleep(2000);
	
		Actions act = new Actions(driver);
		
		act.moveToElement(POM.getDressbutton()).build().perform();
		moveelement(POM.getDressbutton());
		log.info("Elemenet moved to dress button");
		sleep(2000);
		POM.getCasualbutton().click();
		click(POM.getCasualbutton());
		log.info("Page moved to casual dress");
		sleep(2000);
		click(POM.getClickdress());
		POM.getClickdress().click();
		
		POM.getIncrease().click();
		click(POM.getIncrease());
		log.info("Quantity increased");
		sendkey(POM.getSize(), "L");
		POM.getSize().sendKeys("L");
		log.info("Size changed");
		click(POM.getAddcart());
		POM.getAddcart().click();
		log.info("Dress added in cart");
		sleep(2000);
		
		POM.getProceed().click();
		click(POM.getProceed());
		log.info("Proceed to checkout");
		
		POM.getCheckout().click();
		click(POM.getCheckout());
		log.info("Checked Out");
		
		POM.getAddress().click();
		click(POM.getAddress());
		log.info("Address confirmed");
		
		POM.getCheckbox().click();
		click(POM.getCheckbox());
		log.info("Checkbox Accepted");
		click(POM.getShip());
		POM.getShip().click();
		log.info("Product shipped");
		
		POM.getPay().click();
		click(POM.getPay());
		log.info("Paid");
		
		POM.getConfirm().click();
		click(POM.getConfirm());
		log.info("Order confirmed");
		scroll(POM.getOrders());
		sleep(3000);
		
		log.info("Page moved to back to orders");
		Screenshot("Confirmation7");
		
		POM.getBack_to_orders().click();
		click(POM.getBack_to_orders());
		scroll(POM.getOrders());
		sleep(2000);
		Screenshot("Orders5");
		log.info("Page ends");
}
}
