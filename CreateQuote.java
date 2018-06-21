package brewbroker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import browserlocators.QuoteLocators;
import helper.BrowserFactory;

public class CreateQuote {

	@Test(priority=1)
	public void create_quote()throws Exception  {
	WebDriver driver= BrowserFactory.startBrowser("chrome","http://brewbroker-react.herokuapp.com/");	
	driver.navigate().to("http://brewbroker-react.herokuapp.com/");
	
	QuoteLocators quote = PageFactory.initElements(driver, QuoteLocators.class);
	Thread.sleep(5000);
	
	/*=================================== login BrewBroker Supplier ==============================================*/
	quote.login_link(); Thread.sleep(4000);
	quote.loginsupplier("BitingMcGee@mailinator.com", "BBharbour1!"); Thread.sleep(4000);
	
	/*======================================= Step One ==============================================================*/
	quote.supplier_logo(); Thread.sleep(4000); 
	quote.dashboard_supplier(); Thread.sleep(8000);
	quote.toreview_tender(); Thread.sleep(8000);
	/*============================================ Step Three ===========================================================*/
	quote.createquote_allrequirement(); Thread.sleep(4000); 
	quote.brewing_cost_one(); Thread.sleep(4000); 
	quote.packaging_cost_one(); Thread.sleep(4000); 
	quote.price_per_unit_one(); Thread.sleep(4000); 
	quote.brewing_cost_two(); Thread.sleep(4000); 
	quote.packaging_cost_two(); Thread.sleep(4000); 
	quote.price_per_unit_two(); Thread.sleep(4000); 
	quote.warehousing_cost(); Thread.sleep(4000);
	quote.duty_cost(); Thread.sleep(5000);
	quote.comments_to_buyer(); Thread.sleep(8000);
	quote.submit_quote(); Thread.sleep(9000);
}
}