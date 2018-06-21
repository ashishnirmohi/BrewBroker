	package browserlocators;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
import org.testng.Assert;
	
	public class QuoteLocators {

	@FindBy(how=How.XPATH,using="//div[@id='app']/div/div/div[2]/div/div[2]/div[2]/div/div/button") 
	@CacheLookup
	WebElement login;
	
	@FindBy(how=How.XPATH,using="//input[@name='loginemail']")
	@CacheLookup
	WebElement email;
	
	@FindBy(how=How.XPATH,using="//input[@name='loginpassword']")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.XPATH,using="/html/body/div[4]/div/div/div/div/div[4]/input")
	@CacheLookup
	WebElement loginbutton;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[1]/div/div[2]/div[2]/div/a/span")
	@CacheLookup
	WebElement supplierlogo; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[1]/div/div[2]/div[2]/div/div/ul/li[3]/a")
	@CacheLookup
	WebElement dashboard; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/table/tbody/tr[1]/td[1]")
	@CacheLookup
	WebElement toreview; 
	
	@FindBy(how=How.XPATH,using="//a[@class='btn btn-green-bdr accept-requirements']")
	@CacheLookup
	WebElement createquoteallreq;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]")
	@CacheLookup
	WebElement scroll1; 

	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[13]/div[7]/div/div/input")
	@CacheLookup
	WebElement brewcost1; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[13]/div[9]/div[9]/div/div/input")
	@CacheLookup
	WebElement packagingcost1;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[13]/div[9]/div[10]/div/div/input")
	@CacheLookup
	WebElement priceperunit1; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[14]/div[7]/div/div/input")
	@CacheLookup
	WebElement brewcost2;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[14]/div[9]/div[9]/div/div/input")
	@CacheLookup
	WebElement packagingcost2;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[14]/div[9]/div[10]/div/div/input")
	@CacheLookup
	WebElement priceperunit2;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[19]/div/div/input")
	@CacheLookup
	WebElement warehousingcost;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[22]/div/div/input")
	@CacheLookup
	WebElement dutycost;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[2]/textarea")
	@CacheLookup
	WebElement commentBuyer;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[4]/a")
	@CacheLookup
	WebElement submitquote;
	
	public void login_link() {
		login.click();
	}
	
	public void loginsupplier(String username, String pass) {
		Assert.assertTrue(email.isDisplayed());
		email.sendKeys(username);
		Assert.assertTrue(password.isDisplayed());
		password.sendKeys(pass);
		loginbutton.click();	
	}
	
	public void supplier_logo() {
		Assert.assertTrue(supplierlogo.isDisplayed());
		supplierlogo.click();
	}
	
	public void dashboard_supplier() {
		Assert.assertTrue(dashboard.isDisplayed());
		dashboard.click();
	}
	
	public void toreview_tender() {
		Assert.assertTrue(toreview.isDisplayed());
		toreview.click();
	}

	public void createquote_allrequirement() {
		Assert.assertTrue(createquoteallreq.isDisplayed());
		createquoteallreq.click();
	}
	
	public WebDriver driver; 
		
	public void brewing_cost_one() {
		Assert.assertTrue(brewcost1.isDisplayed());
		brewcost1.sendKeys("120.00");
	}
	
	public void packaging_cost_one() {
		Assert.assertTrue(packagingcost1.isDisplayed());
		packagingcost1.sendKeys("50.00");
	}
	
	public void price_per_unit_one() {
		Assert.assertTrue(priceperunit1.isDisplayed());
		priceperunit1.sendKeys("5.00");
	}
	
	public void brewing_cost_two() {
	Assert.assertTrue(brewcost2.isDisplayed());
	brewcost2.sendKeys("500.00");	
	}
	
	public void packaging_cost_two() {
	Assert.assertTrue(packagingcost2.isDisplayed());
	packagingcost2.sendKeys("450.00");	
	}
	
	public void price_per_unit_two() {
		Assert.assertTrue(priceperunit1.isDisplayed());
		priceperunit2.sendKeys("2.00");
	}
	
	public void warehousing_cost() {
		Assert.assertTrue(warehousingcost.isDisplayed());
		warehousingcost.sendKeys("400.00");
	}
	
	public void duty_cost() {
	Assert.assertTrue(dutycost.isDisplayed());
	dutycost.sendKeys("55.00");	
	}
	
	public void comments_to_buyer() {
		Assert.assertTrue(commentBuyer.isDisplayed());
		commentBuyer.sendKeys("Per facilisi itaque dapibus, ullam soluta at repellat pede nullam, lacinia! Ultricies sed ut minim quibusdam ac, sit tincidunt consequat sint laoreet, cumque facilis ratione platea ad reiciendis, fusce.");
	}
	
	public void submit_quote() {
		Assert.assertTrue(submitquote.isDisplayed());
		submitquote.click();	
	}
}
