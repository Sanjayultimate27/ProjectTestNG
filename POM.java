package mini_Project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM {
	
	private static POM pinstance;
	
	
	private POM()
	{
		
	}
	public static POM getInstance()
	{
		if(pinstance == null)
		{
			pinstance = new POM();
		}
		return pinstance;
		
	}
	
	public static WebElement getUn() {
		return un;
	}

	public static WebElement getPd() {
		return pd;
	}

	public static WebElement getSignin() {
		return signin;
	}

	public static WebElement getDressbutton() {
		return dressbutton;
	}

	public static WebElement getCasualbutton() {
		return casualbutton;
	}

	public static WebElement getClickdress() {
		return clickdress;
	}

	public static WebElement getIncrease() {
		return increase;
	}

	public static WebElement getSize() {
		return size;
	}
	
	public static WebElement getAddcart() {
		return addcart;
	}

	public static WebElement getProceed() {
		return proceed;
	}

	public static WebElement getCheckout() {
		return checkout;
	}

	public static WebElement getAddress() {
		return address;
	}

	public static WebElement getCheckbox() {
		return checkbox;
	}

	public static WebElement getShip() {
		return ship;
	}

	public static WebElement getPay() {
		return pay;
	}

	public static WebElement getConfirm() {
		return confirm;
	}

	public static WebElement getAlert() {
		return alert;
	}

	public static WebElement getBack_to_orders() {
		return back_to_orders;
	}

	public static WebElement getOrders() {
		return orders;
	}
	
	@FindBy(xpath = "//input[@id='email']")
	public static WebElement un;

	@FindBy(xpath = "//input[@id='passwd']")
	public static WebElement pd;
	
	@FindBy(xpath = "//span[normalize-space()='Sign in']")
	public static WebElement signin;
	
	@FindBy(xpath = "(//a[@title =  'Dresses'])[2]")
	public static WebElement dressbutton;
	
	@FindBy(xpath = "//li[@class='sfHover']//a[@title='Casual Dresses'][normalize-space()='Casual Dresses']")
	public static WebElement casualbutton;
	
	@FindBy(xpath = "//a[normalize-space()='Printed Dress']")
	public static WebElement clickdress;
	
	@FindBy(xpath = "//i[@class='icon-plus']")
	public static WebElement increase;
	
	@FindBy(xpath = "//select[@id='group_1']")
	public static WebElement size;
	
	@FindBy(xpath = "//span[normalize-space()='Add to cart']")
	public static WebElement addcart;

	@FindBy(xpath = "//span[normalize-space()='Proceed to checkout']")
	public static WebElement proceed;
	
	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")
	public static WebElement checkout;
	
	@FindBy(xpath = "//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")
	public static WebElement address;
	
	@FindBy(xpath = "//input[@id='cgv']")
	public static WebElement checkbox;
	
	@FindBy(xpath = "//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")
	public static WebElement ship;
	
	@FindBy(xpath = "//a[@title='Pay by check.']//span[contains(text(),'(order processing will be longer)')]")
	public static WebElement pay;
	
	@FindBy(xpath = "//span[normalize-space()='I confirm my order']")
	public static WebElement confirm;
	
	@FindBy(xpath = "//h4[normalize-space()='Newsletter']")
	public static WebElement alert;
	
	@FindBy(xpath = "//a[normalize-space()='Back to orders']")
	public static WebElement back_to_orders;
	
	@FindBy(xpath = "//h1[normalize-space()='Order history']")
	public static WebElement orders;
}
