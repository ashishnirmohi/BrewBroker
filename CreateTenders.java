package brewbroker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import browserlocators.TenderLocators;
import helper.BrowserFactory;

public class CreateTenders{
	
	@Test(priority=1)
	public void create_tender()throws Exception  {
	WebDriver driver= BrowserFactory.startBrowser("chrome","http://brewbroker-react.herokuapp.com/");	
	driver.navigate().to("http://brewbroker-react.herokuapp.com/");
	
	TenderLocators tender = PageFactory.initElements(driver, TenderLocators.class);
	Thread.sleep(5000);
	
	/*====================================================login BrewBroker Buyer ===================================================================*/
	tender.login_link(); Thread.sleep(5000);
	tender.login_brew("ashishbuyer001@mailinator.com", "@Test1234"); Thread.sleep(4000);
	
	/*===========================Step One ====================================================*/
	tender.brewbroker_logo(); Thread.sleep(5000);
	tender.dashboard_link(); Thread.sleep(5000);
	tender.newTender(); Thread.sleep(5000);
	tender.ServiceYouNeedBoth(); Thread.sleep(4000);
	tender.nameOfTender(); Thread.sleep(4000);
	tender.descriptionTender(); Thread.sleep(4000);
	tender.submitQuoteBy(); Thread.sleep(4000);
	tender.deliverContractBy(); Thread.sleep(4000);
	tender.nextForm();  Thread.sleep(5000);
	
	/*============================================ Step Two ==============================================*/
	tender.brewingServices(); Thread.sleep(3000);
	tender.style_Ales(); Thread.sleep(3000);
	tender.ales_ABP(); Thread.sleep(3000);
	tender.ales_icanprovide(); Thread.sleep(3000);
	tender.style_lager(); Thread.sleep(4000);
	tender.lager_ABP(); Thread.sleep(4000);
	tender.lager_icanprovide(); Thread.sleep(4000);
	tender.next_Form_two();  Thread.sleep(3000);
	
	/*===============================================Step Three =====================================================*/
	tender.contract_type(); Thread.sleep(4000);
	tender.volume_ales(); Thread.sleep(4000);
	tender.container_type(); Thread.sleep(5000);
	tender.size_type(); Thread.sleep(4000); 
	tender.shape_type(); Thread.sleep(4000);
	tender.color_type(); Thread.sleep(5000);
	tender.shelflife_type(); Thread.sleep(4000);
	tender.labelling_type(); Thread.sleep(4000);
	tender.tickales();
	
	tender.volume_lager(); Thread.sleep(4000);
	tender.container_typelager(); Thread.sleep(5000);
	tender.size_typelager(); Thread.sleep(4000); 
	tender.shape_typelager(); Thread.sleep(4000);
	tender.color_typelager(); Thread.sleep(5000);
	tender.shelflife_typelager(); Thread.sleep(4000);
	tender.labelling_typelager(); Thread.sleep(4000);
	tender.ticklager();
	tender.continue_step_three(); Thread.sleep(4000);
	
	
	/*=================================Step Four=========================================================================*/
	tender.duty(); Thread.sleep(4000);
	tender.duty_continue(); Thread.sleep(4000);
	
	/*====================================Step Five========================================================================*/
	tender.arrange_collection(); Thread.sleep(4000);
	tender.storage_click(); Thread.sleep(4000);
	tender.ambient_click(); Thread.sleep(4000);
	tender.duration_click(); Thread.sleep(4000);
	tender.stepfive_sontinue(); Thread.sleep(4000);
	
	/*===============================================Step Six==================================================================*/
	tender.standards(); Thread.sleep(4000);
	tender.qualifications(); Thread.sleep(4000);
	tender.communication(); Thread.sleep(4000);
	tender.stepsix_continue(); Thread.sleep(4000);
	
	/*==============================================Step Seven================================================*/
	tender.continue_step_seven(); Thread.sleep(9000);
	
	/*================================================Step eight=====================================================*/
	/*
	tender.scroll_one(); Thread.sleep(5000);
	tender.select_supplier(); Thread.sleep(14000);
	tender.submit_tender(); Thread.sleep(4000);
	*/
	
	
}
	
}
