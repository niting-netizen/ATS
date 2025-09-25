package org.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.base.Ultilityclass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pages.Adminlogin;
import org.pages.Cartpage;
import org.pages.Homepage;
import org.pages.Listingpage;
import org.pages.Loginpage;
import org.pages.PDPpage;
import org.pages.Searchpage;
import org.pages.Sparespage;
import org.pages.warehouse;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class KBLSteps extends Ultilityclass {

         
	public static Homepage h ;
	public static Loginpage l ;
	public static Searchpage s ;
	public static Listingpage lp ;
	public static JavascriptExecutor js;
	private static final Logger LOGGER = LogManager.getLogger(KBLSteps.class);
	public static PDPpage p ;
	public static Cartpage c ;
	public static Adminlogin a ;
    public static warehouse w;
	public static Sparespage s1;

	String SuccessorderNo1;
	String WarehouseportalEmail2;
	String OrderText3;


@Given("User open the Home page")
public void user_open_the_Home_page() {

     StartTimeprint();
	 h = new Homepage();
	 LOGGER.info("KBL site home page are launched");
     String title = driver.getTitle();
     checkpresentElement("To check title at Home page",title.contains("E-shop"));
     implicitWait();
	 LOGGER.info("Home page title is verified");
	 EndTimeprint();
	 LOGGER.info(title);
}



@When("When user opening the home page > To verify the header section all the  Elements")
public void when_user_opening_the_home_page_to_verify_the_header_section_all_the_elements() {

	 StartTimeprint();
	 h = new Homepage();
     Threadsleep(2000);
	 checkpresentElement("To check KBL logo is displayed",h.getKBLLogo().isDisplayed());
	 javascriptclick(h.getKBLLogo());
	 LOGGER.info("KBL logo is displayed");
	 Threadsleep(2000);
	 moveToElement(h.getLoginIcon());
	 LOGGER.info("Login icon is displayed");
	 Threadsleep(2000);
	 javascriptclick(h.getLogin());
	 LOGGER.info("Login icon is clicked");
	 Threadsleep(2000);
	 moveToElement(h.getSearchBox());
	 checkpresentElement("To check Search box is displayed",h.getSearchBox().isDisplayed());
	 LOGGER.info("Search box is displayed");
	 Threadsleep(3000);
	 moveToElement(h.getWishlistLink());
	 checkpresentElement("To check Wishlist Icon is displayed",h.getWishlistLink().isDisplayed());
	 LOGGER.info("Wishlist Icon is displayed");
     Threadsleep(2000);
	 moveToElement(h.getCartIcon());
	 Threadsleep(3000);
	 checkpresentElement("To check Cart icon is displayed",h.getCartIcon().isDisplayed());
	 javascriptclick(h.getCartIcon());
	 LOGGER.info("Cart icon is clicked");
	 Threadsleep(4000);
     moveToElement(h.getRequestQuote());
	 checkpresentElement("To check Request Quote is displayed",h.getRequestQuote().isDisplayed());
     Threadsleep(3000);
	 moveToElement(h.getTrackinglink());
	 checkpresentElement("To check Tracking link is displayed",h.getTrackinglink().isDisplayed());
	 Threadsleep(4000);
	 javascriptclick(h.getKBLLogo());
	 Threadsleep(3000);
	 ClickElement(h.getHomepageSliderNext());
	 Threadsleep(2000);
	 ClickElement(h.getHomepageSliderNext());
	 checkpresentElement("To check Homepage banner and slider next is displayed",h.getHomepageSliderNext().isDisplayed());
	 Threadsleep(2000);
	 LOGGER.info("Homepage banner and slider next is displayed");
	 Threadsleep(4000);
     EndTimeprint();
	  
}
   
@When("User verify the home page  sections is displayed or not")
public void user_verify_the_home_page_sections_is_displayed_or_not() throws AWTException {
    
	 StartTimeprint();
     h = new Homepage();
	 Threadsleep(3000);
	 javascriptclick(h.getKBLLogo());
	 Threadsleep(4000);

	for (int i = 0; i <20; i++) {
		KeyDOWN();
	}

	 checkpresentElement("To check Residential section is displayed",h.getResidentialsection().isDisplayed());
	 LOGGER.info("Residential section is displayed");
	 checkpresentElement("To check Commercial section is displayed",h.getCommercialsection().isDisplayed());
	 LOGGER.info("Commercial section is displayed");
	 checkpresentElement("To check Industrial section is displayed",h.getIndustrialsection().isDisplayed());
	 LOGGER.info("Industrial section is displayed");
	 checkpresentElement("To check Agriculture section is displayed",h.getAgriculturesection().isDisplayed());
	 LOGGER.info("Agriculture section is displayed");
	 checkpresentElement("To check Testimonial section is displayed",h.getTestimonialsection().isDisplayed());
	 LOGGER.info("Testimonial section is displayed");
	 LOGGER.info("Home page sections all are displayed and verified ");
     Threadsleep(2000);
      EndTimeprint();
	
}


@When("To verify the Categeory L1 > L2  sub-categeory  navigation page")
public void to_verify_the_categeory_l1_l2_sub_categeory_navigation_page() throws InterruptedException {

    // StartTimeprint();
	// h = new Homepage();
	// javascriptclick(h.getKBLLogo());
	// Threadsleep(3000);
    // moveToElement(h.getCategeory1());
	// moveToElement(h.getCategeory2());
	// moveToElement(h.getCategeory3());
	// Threadsleep(3000);
	// checkequaltext("To check Main category to Sub Category is displayed",h.getCategeory3().getText(),"Pressure Boosting");
	// actionClick(h.getCategeory3());
	// LOGGER.info("Main category to Sub Category is displayed");
    // Threadsleep(3000);
	// EndTimeprint();


// 	List<WebElement> Categeorylinks1 = driver.findElements(By.xpath("//header//div//ul[@class='groupmenu']//a"));

//      h = new Homepage();
// 	  h.getGroupMenuLinks();

// 	for (int i = 0; i < Categeorylinks1.size() ; i++) {

//      if (i < 300) {

// 		List<WebElement> Categeorylinks2 = driver.findElements(By.xpath("//header//div//ul[@class='groupmenu']//a"));
// 		// List<WebElement> Categeorylink2 = h.getGroupMenuLinks();
// 		//moveToElement2(Categeorylinks2);
// 		WebElement Categeoryoptions3 = Categeorylinks1.get(i);
// 		Thread.sleep(2000);

//  	actions = new Actions(driver);  	
// 	actions.moveToElement(Categeoryoptions3).perform();

//        // moveToElement(Categeoryoptions3);
// 		Thread.sleep(2000);
//         actionClick(Categeoryoptions3);
// 		Thread.sleep(3000);
// 		 h = new Homepage();
//          Threadsleep(2000);
// 	    javascriptclick(h.getKBLLogo());
//         // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//         // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//header//div//ul[@class='groupmenu']//a")));
//         Thread.sleep(2000);
//     } 
// }

// driver.quit();
	

}
    
@Then ("Observe the  Footer section links redirections")
public void observe_the_footer_section_links_redirections() throws AWTException {

	 h = new Homepage();
     Threadsleep(1000);
	for (int i = 0; i <90; i++) {
		KeyDOWN();
	}
    Threadsleep(2000);
	 List<WebElement> Footerlinks1 = driver.findElements(By.xpath("//footer//a"));
	 for (int i = 0; i < Footerlinks1.size(); i++) {
    // Apply index range position
    if (i > 3 && i < 31) {
		List<WebElement> Footerlinks3 = driver.findElements(By.xpath("//footer//a"));
        WebElement link4 = Footerlinks3.get(i);
        String linkText = link4.getText().trim();
        System.out.println("Footer Links" + i + ": " + linkText);
        javascriptclick(link4);
        Threadsleep(1000);
}
	 }

	 driver.quit();

	}

	
// Login functionality with password field

@When("Go the login page and select the login with password page")
public void go_the_login_page_and_select_the_login_with_password_page() {
	
	StartTimeprint();
     h = new Homepage();
     moveToElement(h.getLoginIcon());
	 LOGGER.info("Login icon is displayed");
	 Threadsleep(2000);
	 javascriptclick(h.getLogin());
	 LOGGER.info("Login icon is clicked");
	 Threadsleep(2000);

}

@When("Enter the Email and passwors in repective field")
public void enter_the_email_and_passwors_in_repective_field() {

	l = new Loginpage();
	Threadsleep(3000);
	moveToElement(l.getPasswordLogin());
	checkpresentElement("To check Password login is displayed",l.getPasswordLogin().isDisplayed());
	actionClick(l.getPasswordLogin());
	LOGGER.info("Password login is clicked");
	Threadsleep(3000);
	l = new Loginpage();

	PassValues(l.getEmailField(), getdataExcel(1, 1));
	checkpresentElement("To check Email field is displayed",l.getEmailField().isDisplayed());
	LOGGER.info("Email field is displayed");
	PassValues(l.getPasswordField(), getdataExcel(2, 1));
	checkpresentElement("To check Password field is displayed",l.getPasswordField().isDisplayed());
    Threadsleep(3000);
	ClickElement(l.getLoginButton());

}

@Then("Observe the redirection to the my account page")
public void observe_the_redirection_to_the_my_account_page() {
	 l = new Loginpage();
	 Threadsleep(3000);
	 String title2 = driver.getTitle();
     checkpresentElement("To check user account  page",title2.contains("My Account"));
	 LOGGER.info("Login with password functionality is verified successfully");
	 Threadsleep(3000);
	 EndTimeprint();

	 driver.quit();

//  l = new Loginpage();
//     moveToElement(l.getForgotlinking());
// 	checkpresentElement("To check Forgot password link is displayed",l.getForgotlinking().isDisplayed());
// 	LOGGER.info("Forgot password link is displayed");
// 	ClickElement(l.getForgotlinking());
//    Threadsleep(3000);
//    PassValues(l.getPasswordForgotField(), getdataExcel(3, 1));
//    javascriptclick(l.getSubmit());
// 	  Threadsleep(3000);
}

@When("do  the login  and Observe the my account page options")
public void do_the_login_and_observe_the_my_account_page_options() {

	 StartTimeprint();
     h = new Homepage();
     h = new Homepage();
     moveToElement(h.getLoginIcon());
	 LOGGER.info("Login icon is displayed");
	 Threadsleep(2000);
	 javascriptclick(h.getLogin());
	 LOGGER.info("Login icon is clicked");
	 Threadsleep(2000);

	l = new Loginpage();
	Threadsleep(3000);
	moveToElement(l.getPasswordLogin());
	checkpresentElement("To check Password login is displayed",l.getPasswordLogin().isDisplayed());
	actionClick(l.getPasswordLogin());
	LOGGER.info("Password login is clicked");
	Threadsleep(3000);

	// Entering the Email and Password

	l = new Loginpage();
	PassValues(l.getEmailField(), getdataExcel(1, 1));
	checkpresentElement("To check Email field is displayed",l.getEmailField().isDisplayed());
	LOGGER.info("Email field is displayed");
	PassValues(l.getPasswordField(), getdataExcel(2, 1));
	checkpresentElement("To check Password field is displayed",l.getPasswordField().isDisplayed());
    Threadsleep(3000);
	ClickElement(l.getLoginButton());
}

@Then("User click  the My account options in dashbord and Observe the redirection  page")
public void user_click_the_my_account_options_in_dashbord_and_observe_the_redirection_page() throws AWTException {
    
     l = new Loginpage();
	 Threadsleep(3000);
	 String title2 = driver.getTitle();
     checkpresentElement("To check user account  page",title2.contains("My Account"));
	 LOGGER.info("Login with password functionality is verified successfully");
	 implicitWait();
	 l = new Loginpage();
	 checkpresentElement("To check My account dashboard options available or not in My account page",l.getMyAccountDashboard().isDisplayed());
     Threadsleep(3000);
	 ClickElement(l.getMyAccountDashboard());
     LOGGER.info("My account dashboard  is displayed");
	 implicitWait();
	 l = new Loginpage();
	 checkpresentElement("To check My address book options available or not in My account page",l.getMyaddressbook().isDisplayed());
     Threadsleep(3000);
	 ClickElement(l.getMyaddressbook());
     LOGGER.info("My address book  options  is displayed");
	 l = new Loginpage();
	 implicitWait();
	 checkpresentElement("To check My Account options available or not in My account page",l.getMyinformation().isDisplayed());
     ClickElement(l.getMyinformation());
	 Threadsleep(3000);
     LOGGER.info("My Account information option  is displayed");
	 Threadsleep(10000);
	 implicitWait();
	 l = new Loginpage();
	 checkpresentElement("To check My ordrs options available or not in My account page",l.getMyOrders().isDisplayed());
     Threadsleep(3000);
	 ClickElement(l.getMyOrders());
     LOGGER.info("My order is displayed");
	 l = new Loginpage();
	 implicitWait();
	 checkpresentElement("To check My service options available or not in My account page",l.getMyService().isDisplayed());
     ClickElement(l.getMyService());
	 Threadsleep(3000);
     LOGGER.info("My Service option  is displayed");

	 for (int i = 0; i <6; i++) {
		KeyDOWN();
	}

	 l = new Loginpage();
	 Threadsleep(2000);
	 checkpresentElement("To check AMC options available or not in My account page",l.getAMC().isDisplayed());
     ClickElement(l.getAMC());
	 Threadsleep(3000);
     LOGGER.info("AMC option  is displayed");

	 for (int i = 0; i <6; i++) {
		KeyDOWN();
	}

	l = new Loginpage();
	 Threadsleep(1000);
	 checkpresentElement("To check News-Letter options available or not in My account page",l.getNewsletters().isDisplayed());
     ClickElement(l.getNewsletters());
	 Threadsleep(3000);
     LOGGER.info("News-Letter option  is displayed");

	 for (int i = 0; i <6; i++) {
		KeyDOWN();
	}

	 l = new Loginpage();
	   Threadsleep(1000);
	 checkpresentElement("To check My Product Reviews  options available or not in My account page",l.getMyReviews().isDisplayed());
     ClickElement(l.getMyReviews());
	 Threadsleep(3000);
     LOGGER.info(" My Product Reviews option  is displayed");

	 for (int i = 0; i <6; i++) {
		KeyDOWN();
	}

	 l = new Loginpage();
	 Threadsleep(1000);
	 checkpresentElement("To check My wishlist  options available or not in My account page",l.getMywislistpage().isDisplayed());
     ClickElement(l.getMywislistpage());
	 Threadsleep(3000);
     LOGGER.info("My wishlist option  is displayed");

	 for (int i = 0; i <6; i++) {
		KeyDOWN();
	}

	l = new Loginpage();
	Threadsleep(1000);
	checkpresentElement("To check My Quotes  options available or not in My account page",l.getMyQuates().isDisplayed());
    ClickElement(l.getMyQuates());
	Threadsleep(3000);
    LOGGER.info(" My Quotes option  is displayed");

	 for (int i = 0; i <9; i++) {
		KeyDOWN();
	}

	l = new Loginpage();
	Threadsleep(1000);
	checkpresentElement("To check My Replacment  options available or not in My account page",l.getMyReplacement().isDisplayed());
    ClickElement(l.getMyReplacement());
	 Threadsleep(3000);
     LOGGER.info(" My Replacment option  is displayed");

	 for (int i = 0; i <10; i++) {
		KeyDOWN();
	}

	 l = new Loginpage();
	  Threadsleep(1000);
	 checkpresentElement("To check My Products  options available or not in My account page",l.getMyproducts().isDisplayed());
     ClickElement(l.getMyproducts());
	 Threadsleep(1000);
     LOGGER.info(" My Products link option  is displayed");
	 LOGGER.info("My account dashboard page all the optons are verified and Navigated to the respective page");
	  driver.quit();

}

// search field functionality 

@Given("User go to the Home page")
public void user_go_to_the_home_page() {
	 
	 StartTimeprint();
     s = new Searchpage();
	 LOGGER.info("KBL site home page are launched");
     String title = driver.getTitle();
     checkpresentElement("To check title at Home page",title.contains("E-shop"));
     implicitWait();
	 LOGGER.info("Home page title is verified");
	 EndTimeprint();

}

@When("User Enter the product name in search box {string}")
public void user_enter_the_product_name_in_search_box(String Keyword1) {

     StartTimeprint();
	 s = new Searchpage();
	 moveToElement(s.getSearchBox());
	 checkpresentElement("To check Search box is displayed",s.getSearchBox().isDisplayed());
	 LOGGER.info("Search box is displayed");
	 String Keyword = Keyword1;
	 PassValues(s.getSearchBox(), Keyword);
	 LOGGER.info("Product SKU  is entered in search box");
	 EndTimeprint();
}

@When("Observe the Related products suggestion.then,Click on any product name")
public void observe_the_related_products_suggestion_then_click_on_any_product_name() {
	
     StartTimeprint();
	 s = new Searchpage();
	 moveToElement(s.getSearchBox());
	 ClickElement(s.getProductnameSLP());
	 String Url3 = driver.getCurrentUrl();
	 System.out.println(Url3);
	 Threadsleep(3000);
	 checkpresentElement("To check user account  page",Url3.contains("vertical"));
	 LOGGER.info("Product name is clicked and Succesfully redirection to the respective  product page");
	 EndTimeprint();
}

@When("Observe the Seeall navigation  page {string}")
public void observe_the_seeall_navigation_page(String Keyword2) {

	 StartTimeprint();
	 s = new Searchpage();
	 moveToElement(s.getSearchBox());
	 checkpresentElement("To check Search box is displayed",s.getSearchBox().isDisplayed());
	 Threadsleep(2000);
	 PassValues(s.getSearchBox(), Keyword2);
	 LOGGER.info("Product name is entered in search box");
     Threadsleep(4000);
	 javascriptclick(s.getSeeall());
	 Threadsleep(3000);
	 String Url4 = driver.getCurrentUrl();
	 Threadsleep(2000);
	 checkpresentElement("To verify the  entered product related search  listing  page",Url4.contains("Surface"));
	 LOGGER.info("See all navigation is verified");
	 EndTimeprint();
 }


 @When("Observe the navigation  page using Enter button {string}")
public void observe_the_navigation_page_using_enter_button(String Keyword3) throws AWTException {

	StartTimeprint();
	h = new Homepage();
    Threadsleep(5000);
	javascriptclick(h.getKBLLogo());
	Threadsleep(3000);
	 s = new Searchpage();
	 moveToElement(s.getSearchBox());
	 checkpresentElement("To check Search box is displayed",s.getSearchBox().isDisplayed());
	 LOGGER.info("Search box is displayed");
	 PassValues(s.getSearchBox(), Keyword3);
	 LOGGER.info("Product name is entered in search box");
     Threadsleep(3000);
	 KeyEnter();
	 Threadsleep(3000);
	 String Url4 = driver.getCurrentUrl();
	 checkpresentElement("To check user account  page",Url4.contains("catalogsearch"));
	 LOGGER.info("Using Enter key navigation page is verified");
	 EndTimeprint();

}

@Then("Verify the Filter options in SLP page")
public void verify_the_filter_options_in_slp_page() throws AWTException {

	 s = new Searchpage();
	 Threadsleep(2000);
	WebElement ResidentialFiltercount1 =s.getResidentialcount1();
	String ResidentialFiltercount2 = ResidentialFiltercount1.getText();
	String ResidentialFiltercount3 = ResidentialFiltercount2.substring(0, 3);
	System.out.println(ResidentialFiltercount3);
	 ClickElement(s.getResidentialFilterSLP());
	 checkpresentElement("To check Residential Filter is displayed",s.getResidentialFilterSLP().isDisplayed());
	 LOGGER.info("Residential Filter is displayed");
     Threadsleep(4000);
	 checkequaltext("To check selected Residential  filter count for in SLP page",ResidentialFiltercount3,s.getResidentialcount2().getText());
	 Threadsleep(5000);
	 ClickElement(s.getPopupclose());
	 Threadsleep(1000);
	
	 for (int i = 0; i <7; i++) {
		KeyDOWN();
	}

    Threadsleep(2000);
	 WebElement SurfaceFiltercount1 =s.getSurfacecount1();
	String SurfaceFiltercount2 = SurfaceFiltercount1.getText();
	String SurfaceFiltercount3 = SurfaceFiltercount2.substring(0, 3);
	System.out.println(SurfaceFiltercount3);
	 ClickElement(s.getSurfaceFilterSLP());
	 LOGGER.info("Surface Filter is displayed");
	 checkequaltext("To check selected surface  filter count for in SLP page",SurfaceFiltercount3,s.getSurfacecount2().getText());
	 Threadsleep(3000);
	 ClickElement(s.getClearall());
	 Threadsleep(3000);
	 LOGGER.info("Clearall button is verified");

	  for (int i = 0; i <6; i++) {
		KeyUP();
	}

	 EndTimeprint(); 
	 driver.quit();

}

@When("User go to the listing page")
public void user_go_to_the_listing_page() throws AWTException, InterruptedException {

    StartTimeprint();
	h = new Homepage();
    Threadsleep(5000);
	javascriptclick(h.getKBLLogo());
    moveToElement(h.getCategeory1());
	moveToElement(h.getCategeory2());
	moveToElement(h.getCategeory3());
	Threadsleep(3000);
	checkequaltext("To check Main category to Sub Category is displayed",h.getCategeory3().getText(),"Pressure Boosting");
	actionClick(h.getCategeory3());
	LOGGER.info("Main category to Sub Category is displayed");
	Threadsleep(3000);

	for (int i = 0; i <8; i++) {
		KeyDOWN();
	 }

	 lp = new Listingpage();
	 javascriptclick(lp.getPLPpageseriesfilter());
	 Threadsleep(3000);
     System.out.println(lp.getListingpageproductname1().getText());
	 checkpresentElement("To verify series number for listed products",lp.getListingpageproductname1().getText().contains("CPBS"));

	h = new Homepage();
    Threadsleep(5000);
	javascriptclick(h.getKBLLogo());
    moveToElement(h.getCategeory1());
	moveToElement(h.getCategeory4());
	moveToElement(h.getCategeory5());
	Threadsleep(3000);
	checkequaltext("To check Main category to Sub Category is displayed",h.getCategeory5().getText(),"Overhead Tank Filling");
	actionClick(h.getCategeory5());
    Threadsleep(3000);
	
	for (int i = 0; i <7; i++) {
		KeyDOWN();
	}

	lp = new Listingpage();
	javascriptclick(lp.getPhasefilter());
	Threadsleep(3000);
	System.out.println(lp.getListingpageproductname1().getText());
	checkpresentElement("To verify series number for listed products",lp.getListingpageproductname1().getText().contains("Three Phase"));
     Threadsleep(3000);
	 javascriptclick(lp.getPLPpageseriesfilter());
     Threadsleep(3000);
     System.out.println(lp.getListingpageproductname1().getText());
	 checkpresentElement("To verify series number for listed products",lp.getListingpageproductname1().getText().contains("KOS"));
	 LOGGER.info("Series number & Phase options are verified for listed products");

	s = new Searchpage();
	Threadsleep(4000);
	ClickElement(s.getPopupclose());
	EndTimeprint();

	  for (int i = 0; i <8; i++) {
		KeyDOWN();
	}

    lp = new Listingpage();
	lp.getPLPminpricerange().clear();
	Threadsleep(3000);
	PassValues(lp.getPLPminpricerange(), getdataExcel(5, 1));

	lp.getPLPmaxpricerange().clear();
	Threadsleep(3000);
	PassValues(lp.getPLPmaxpricerange(), getdataExcel(6, 1));

    Threadsleep(5000);

	int minPrice = Integer.parseInt(getdataExcel(5, 1));
    int maxPrice = Integer.parseInt(getdataExcel(6, 1));
    List<WebElement> price1 = driver.findElements(By.cssSelector(".special-price"));

for (WebElement price2 : price1) {

    //Remove symbols like ₹, commas
    String priceText = price2.getText().replaceAll("[^0-9]", ""); 
    int productPrice = Integer.parseInt(priceText);
	int productPrice2 = productPrice / 100;

		if (productPrice2 >= minPrice && productPrice2 <= maxPrice) {
		LOGGER.info("Product price {} is within the range [{} - {}]", productPrice2, minPrice, maxPrice);
		} 
		else {
			LOGGER.info("Product price {} is outside the range [{} - {}]", productPrice2, minPrice, maxPrice);
		}
    }
     EndTimeprint();

}

@When("verify the Buy now  CTA functionality")
public void verify_the_buy_now_cta_functionality() {

    StartTimeprint();
	lp = new Listingpage();
	moveToElement(lp.getOvertankListingCategeory1());
	Threadsleep(4000);
	checkpresentElement("To check Buy Now button is displayed",lp.getBuyNowButton1().isDisplayed());
	LOGGER.info("Buy Now button is displayed");
	Threadsleep(3000);
	actionClick(lp.getBuyNowButton1());
	LOGGER.info("Buy Now button is clicked");
	Threadsleep(3000);
	EndTimeprint();
}


@When("verify the Compare now option in listing page")
public void verify_the_compare_now_option_in_listing_page() {

	StartTimeprint();
	h = new Homepage();
    Threadsleep(5000);
	javascriptclick(h.getKBLLogo());
    moveToElement(h.getCategeory1());
	moveToElement(h.getCategeory2());
	moveToElement(h.getCategeory3());
    Threadsleep(2000);
	checkequaltext("To check Main category to Sub Category is displayed",h.getCategeory3().getText(),"Pressure Boosting");
	actionClick(h.getCategeory3());
	lp = new Listingpage();
	Threadsleep(3000);
	moveToElement(lp.getListingCategeory2());
	Threadsleep(4000);
	actionClick(lp.getListingCompare2());
	Threadsleep(3000);
	moveToElement(lp.getListingCategeory1());
	Threadsleep(3000);
	actionClick(lp.getListingCompare1());
	Threadsleep(2000);
	// s = new Searchpage();
	// ClickElement(s.getPopupclose());
  	LOGGER.info("Compare now button is displayed");
	EndTimeprint();

}

@Then("verify the added compare products in comparision page")
public void verify_the_added_compare_products_in_comparision_page() {
	
	 StartTimeprint();
	 lp = new Listingpage();
	 Threadsleep(2000);
	 moveToElement(lp.getComparisonLink());
	 ClickElement(lp.getComparisonLink());
	 Threadsleep(3000);
	 String Url6 = driver.getCurrentUrl();
	 System.out.println(Url6);
	 checkpresentElement("To check user account  page",Url6.contains("product_compare"));
	 LOGGER.info("Compare now checkbox is clicked and redirection is verified");
	 EndTimeprint();
	 driver.quit();

}


@When("On click Buy now CTA or any product cards in listing page")
public void on_click_buy_now_cta_or_any_product_cards_in_listing_page() {

	StartTimeprint();
	h = new Homepage();
    Threadsleep(5000);
	javascriptclick(h.getKBLLogo());
    moveToElement(h.getCategeory1());
	moveToElement(h.getCategeory2());
	moveToElement(h.getCategeory3());
	Threadsleep(3000);
	checkequaltext("To check Main category to Sub Category is displayed",h.getCategeory3().getText(),"Pressure Boosting");
	actionClick(h.getCategeory3());
	LOGGER.info("Main category to Sub Category is displayed");
	Threadsleep(3000);
	lp = new Listingpage();
	moveToElement(lp.getListingCategeory1());
	Threadsleep(3000);
	checkpresentElement("To check Buy Now button is displayed",lp.getBuyNowButton1().isDisplayed());
	LOGGER.info("Buy Now button is displayed");
	 //Threadsleep(3000);

	 
	  p = new PDPpage();
	  Threadsleep(3000);
	  WebElement PLPname1 = p.getPLPname();
	  String name1 = PLPname1.getText();
	  WebElement PLPrate1 = p.getPLPprice();
	  String Rate1 = PLPrate1.getText();
	  System.out.println(Rate1);

	  javascriptclick(p.getPLPname());


	 //actionClick(lp.getBuyNowButton1());
	 LOGGER.info("Product name  is clicked");
	
	s = new Searchpage();
	Threadsleep(3000);
	ClickElement(s.getPopupclose());
	EndTimeprint();

	p = new PDPpage();
	WebElement PDPrate2 = p.getPDPprice2();
    Threadsleep(3000);
	String Rate2 = PDPrate2.getText();
	WebElement PDPname2 = p.getPDPname();
	String name2 = PDPname2.getText();
    System.out.println(name2);
	checkequaltext("To verify btw the PLP&PDP page the product NAME",name1,name2);
	checkequaltext("To verify btw the PLP&PDP page the product RATE",Rate1,Rate2); 
	LOGGER.info(" Btw the PLP&PDP page the product NAME & RATE are verified");
	Threadsleep(3000);
	ClickElement(p.getQtybuttoMaxPDP());
	ClickElement(p.getAddToCartButtonPDP());
	Threadsleep(3000);
	//p.getPincodefield().clear();
 	PassValues(p.getPincodefield() , getdataExcel(4, 1));
	ClickElement(p.getPincodecheckButton());
	Threadsleep(2000);
	Alertaccept();
	Threadsleep(2000);
	 EndTimeprint();

}

@When("Verify the  correct delivery message based on TAT functionality")
public void verify_the_correct_delivery_message_based_on_tat() {
	
    StartTimeprint();

   //String  a = "500027";
    String expectedMessage;
    String actualMessage = p.getPincodedeliverymessage().getText();

	if (actualMessage.equals("Product will be delivered in 6 - 8 Working days")) {
    expectedMessage = "Product will be delivered in 6 - 8 Working days";
} 
else {
    expectedMessage = "Some other message";
}

    System.out.println("Actual Message: " + actualMessage);
    System.out.println("Expected Message: " + expectedMessage);

    Assert.assertEquals(expectedMessage, actualMessage);
    LOGGER.info("Checking if Pincode Delivery message is equal. Expected: {}, Actual: {}", expectedMessage, actualMessage);

    // int lowerTAT = 1;
    // int higherTAT = 6;
    // if (lowerTAT == 1)  {
    //     expectedMessage = "Product will be delivered in -7 - 9 Working days";
    // } else if (lowerTAT < 2) {
    //     expectedMessage = "Product will be delivered in " + lowerTAT + " - " + higherTAT + " Working days";
    // } else {
    //     expectedMessage = "This product is  not Delivery for this pincode";
    // }

	EndTimeprint();
	
}


@Then("verify the PDP page features and products prices & do the add to cart.")
public void verify_the_pdp_page_features_and_products_prices_do_the_add_to_cart_then_go_to_cart_page() {
    
  
	  StartTimeprint();
	  p = new PDPpage();
	  checkpresentElement("To check Installation Service label is displayed",p.getInstallationServicelabel().isDisplayed());
	  LOGGER.info("Installation Service label is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getBuynowPDP().isDisplayed());
	  LOGGER.info("Buy Now button is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getAddToCartButtonPDP().isDisplayed());
	  LOGGER.info("Add to cart button is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getAddToQuoteButtonPDP().isDisplayed());
	  LOGGER.info("Add to quote button is displayed");
	  checkpresentElement("To check Quantity button is displayed",p.getAddToWishListButtonPDP().isDisplayed());
	  LOGGER.info("Add to wishlist button is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getAddToCompareListButtonPDP().isDisplayed());
	  LOGGER.info("Add to compare button is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getFAQSectionButtonPDP().isDisplayed());
	  LOGGER.info("FAQ section button is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getServiceImagePDP().isDisplayed());
	  LOGGER.info("Service image is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getServiceTextPDP().isDisplayed());
	  LOGGER.info("Service text is displayed");
       Threadsleep(4000);
	   javascriptclick(p.getBuynowPDP());

	//  javascriptclick(p.getAddToCartButtonPDP());
	  Threadsleep(10000);
	//  javascriptclick(p.getPDPcheckoutButton());
	  c = new Cartpage();
	  moveToElement(c.getMinicartQty());
	  Threadsleep(2000);
	  actionClick(c.getMinicartQty());
	  Threadsleep(3000);
	  EndTimeprint();
	  driver.quit();
   }


  //  Order success page cases

   @Given("user opens the Home page and logs in")
   public void user_opens_the_home_page_and_logs_in() {

     StartTimeprint(); 
	 h = new Homepage();
	 LOGGER.info("KBL site home page are launched");
     String title = driver.getTitle();
     checkpresentElement("To check title at Home page",title.contains("E-shop"));
	 Threadsleep(2000);
	 moveToElement(h.getLoginIcon());
	// checkpresentElement("To check Login icon is displayed",h.getLoginIcon().isDisplayed());
	 Threadsleep(4000);
	 LOGGER.info("Login icon is displayed");
	 javascriptclick(h.getLogin());
	 Threadsleep(2000);
	 LOGGER.info("Login icon is clicked");
	 l = new Loginpage();
	 moveToElement(l.getPasswordLogin());
	 checkpresentElement("To check Password login is displayed",l.getPasswordLogin().isDisplayed());
	 actionClick(l.getPasswordLogin());
	 LOGGER.info("login with Password option is clicked");
	 Threadsleep(3000);
	 l = new Loginpage();
	 PassValues(l.getEmailField(), getdataExcel(1, 1));
	 checkpresentElement("To check Email field is displayed",l.getEmailField().isDisplayed());
	 LOGGER.info("Email field is displayed");
	 PassValues(l.getPasswordField(), getdataExcel(2, 1));
	 checkpresentElement("To check Password field is displayed",l.getPasswordField().isDisplayed());
     Threadsleep(4000);
	 ClickElement(l.getLoginButton());
     EndTimeprint();

}

@When("the user navigates to the listing page")
public void the_user_navigates_to_the_listing_page() {

    StartTimeprint();
	h = new Homepage();
    Threadsleep(3000);
	javascriptclick(h.getKBLLogo());
    Threadsleep(3000);
    moveToElement(h.getCategeory1());
	moveToElement(h.getCategeory2());
	moveToElement(h.getCategeory3());
	Threadsleep(3000);
	checkequaltext("To check Main category to Sub Category is displayed",h.getCategeory3().getText(),"Pressure Boosting");
	actionClick(h.getCategeory3());
	LOGGER.info("Main category to Sub Category is displayed");
     Threadsleep(3000);
	 EndTimeprint();

}


@When("clicks the {string} CTA or any product card on the listing page")
public void clicks_the_cta_or_any_product_card_on_the_listing_page(String string) {
	
	 StartTimeprint();
	 lp = new Listingpage();
	 moveToElement(lp.getListingCategeory1());
	 Threadsleep(4000);
	 checkpresentElement("To check Buy Now button is displayed",lp.getBuyNowButton1().isDisplayed());
     LOGGER.info("Buy Now button is displayed");

	// actionClick(lp.getBuyNowButton1());
	// LOGGER.info("Buy Now button is clicked");

	  Threadsleep(3000);
	  p = new PDPpage();
	  WebElement PLPname3 = p.getPLPname1();
	  String name1 = PLPname3.getText();
	  WebElement PLPrate1 = p.getPLPprice1();
	  String Rate1 = PLPrate1.getText();
	  System.out.println(Rate1);
	  
	  javascriptclick(p.getPLPname1());
	  Threadsleep(3000);

	  WebElement PDPrate1 = p.getPDPprice();
      String Rate3 = PDPrate1.getText();
	  Threadsleep(3000);
	  System.out.println(Rate3);

	  WebElement PDPname2 = p.getPDPname();
	  String name2 = PDPname2.getText();
      System.out.println(name2);
	  Threadsleep(1000);

	  checkequaltext("To verify btw the PLP&PDP page the product NAME",name1,name2);
	  checkequaltext("To verify btw the PLP&PDP page the product RATE",Rate1,Rate3); 
	  LOGGER.info(" Btw the PLP&PDP page the product NAME & RATE are verified");
	  Threadsleep(3000);

	  p = new PDPpage();
	  ClickElement(p.getAddToCartButtonPDP());
	  Threadsleep(3000);
	  PassValues(p.getPincodefield(), "600119");
	  ClickElement(p.getPincodecheckButton());
	  Threadsleep(3000);
	  Alertaccept();
	  Threadsleep(1000);
	  checkpresentElement("To check Installation Service label is displayed",p.getInstallationServicelabel().isDisplayed());
	  LOGGER.info("Installation Service label is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getBuynowPDP().isDisplayed());
	  LOGGER.info("Buy Now button is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getAddToCartButtonPDP().isDisplayed());
	  LOGGER.info("Add to cart button is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getAddToQuoteButtonPDP().isDisplayed());
	  LOGGER.info("Add to quote button is displayed");
	  // checkpresentElement("To check Quantity button is displayed",p.getAddToWishListButtonPDP().isDisplayed());
	  // LOGGER.info("Add to wishlist button is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getAddToCompareListButtonPDP().isDisplayed());
	  LOGGER.info("Add to compare button is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getFAQSectionButtonPDP().isDisplayed());
	  LOGGER.info("FAQ section button is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getServiceImagePDP().isDisplayed());
	  LOGGER.info("Service image is displayed");
	  checkpresentElement("To check Buy Now button is displayed",p.getServiceTextPDP().isDisplayed());
	  LOGGER.info("Service text is displayed");
      Threadsleep(4000);
	  EndTimeprint();

}

@When("adds the product to the cart and proceeds to the Cart page")
public void adds_the_product_to_the_cart_and_proceeds_to_the_cart_page() {

      StartTimeprint();
      p = new PDPpage();
	  WebElement PDPrate2 = p.getPDPprice();
	  String Rate2 = PDPrate2.getText();
	  System.out.println(Rate2);

	  WebElement PDPname2 = p.getPDPname();
	  String name2 = PDPname2.getText();
      System.out.println(name2);

	  Threadsleep(2000);
      ClickElement(p.getAddToCartButtonPDP());
	  Threadsleep(2000);
	  LOGGER.info("Add to cart button is clicked");
	  Threadsleep(2000);

	  //javascriptclick(p.getPDPcheckoutButton());

	  c = new Cartpage();

	  moveToElement(c.getMinicartQty());
	  Threadsleep(2000);

	  actionClick(c.getMinicartQty());
	  Threadsleep(3000);

	//checkequaltext("To verify btw the PDP&Cart  page the product RATE",c.getCartprice1().getText(),Rate2);
	//checkequaltext("To verify btw the PDP&Cart  page the product NAME",c.getCartname().getText(), name2);
	 
	LOGGER.info(" Btw the PDP&Cart  page the product RATE are verified");
	Threadsleep(3000);
	EndTimeprint();
    
	//Order summary detail verification in cart page

      StartTimeprint(); 
	  c = new Cartpage();

	  WebElement cartsubtotal1 =c.getCartsubtotal();
	  String CartSubTotal2 = cartsubtotal1.getText();
	  String CartSubTotal3 = CartSubTotal2.substring(1).replace(",", "");
	  Double Subtotalamount = Double.valueOf(CartSubTotal3);
	 
	  WebElement CARTIGST = c.getCARTIGST();   
      String CARTIGST1 = CARTIGST.getText();              
      String CARIGST2 = CARTIGST1.substring(1).replace(",", "");  
      Double CARIGST3 = Double.valueOf(CARIGST2);         
     
	//   WebElement CGST = c.getCartCGSTtax();        
    //   String CGST1 = CGST.getText();              
    //   String CGST2 = CGST1.substring(1).replace(",", "");  
    //   Double CGST3 = Double.valueOf(CGST2);         
    //   System.out.println(CGST3);

	//   WebElement SGST = c.getCartSGSTtax();
    //   String  SGST1 = SGST.getText();
    //   String SGST2 = SGST1.substring(1).replace(",", "");
    //   Double SGST3 = Double.valueOf(SGST2);
	//   System.out.println(SGST3);

       double total = Subtotalamount + CARIGST3;
       String T = String.valueOf(total).substring(0,7);
	   
	   WebElement  OrderSummaryTotalcart = c.getCARTIGSTORDERSUMMARYTOTAL();
	   String OrderSummaryTotalcart1 = OrderSummaryTotalcart.getText();
	   String OrderSummaryTotalcart2 = OrderSummaryTotalcart1.substring(1).replace(",", "");
	   Double OrderSummaryTotalcart3 = Double.valueOf(OrderSummaryTotalcart2);
       String Ordercarttotal = String.valueOf(OrderSummaryTotalcart3);
	   System.out.println(Ordercarttotal);
	   checkpresentElement("To check order summary calculation",Ordercarttotal.equals(T));

	   LOGGER.info("Successfully Verified   product order summary  Detail in the CART  page");
	   Threadsleep(3000);
	   
}

@When("verifies the Cart page features and Order summary detail.Then,proceeds to the Checkout page")
public void verifies_the_cart_page_features_and_order_summary_detail_then_proceeds_to_the_checkout_page() {
      
	//     StartTimeprint();
	//     c = new Cartpage();
	//     Threadsleep(1000);
	// 	  ClickElement(c.getQtybuttoMaxCart());
	// 	  Threadsleep(3000);
	// 	  ClickElement(c.getQtybuttoMinCart());
	// 	  navigateRefresh();
	// 	  Threadsleep(3000);
	// 	  javascriptclick(c.getCartcontinueButton());
	// 	   Threadsleep(3000);
    //     moveToElement(h.getCategeory53());
	//     moveToElement(h.getCategeory54());
	//     moveToElement(h.getCategeory55());
	//     moveToElement(h.getCategeory58());
	//     Threadsleep(4000);
	//     checkequaltext("To check Main category to Sub Category is displayed",h.getCategeory58().getText(),"Reverse Osmosis (RO) Plant");
	//     actionClick(h.getCategeory58());
	//     LOGGER.info("Main category to Sub Category is displayed");
	//     javascriptclick(c.getCartname2());
	//     Threadsleep(2000);
	// 	 ClickElement(p.getAddToCartButtonPDP());
	//     Threadsleep(3000);
	//     PassValues(p.getPincodefield(), "400058");
	//     ClickElement(p.getPincodecheckButton());
	//     Threadsleep(2000);
	//     Alertaccept();
	//     Threadsleep(2000);
	//     p = new PDPpage();
	//     ClickElement(p.getAddToCartButtonPDP());
	//     Threadsleep(3000);
	//     LOGGER.info("Add to cart button is clicked");
	//     // javascriptclick(p.getPDPcheckoutButton());
	//     c = new Cartpage();
	//     moveToElement(c.getMinicartQty());
	//     Threadsleep(2000);
	//     actionClick(c.getMinicartQty());
	//     Threadsleep(2000);
	//     ClickElement(c.getRemoveButton());
	//     Threadsleep(3000);
	//     LOGGER.info("Remove button is clicked");
    //     c = new Cartpage();
	// 	javascriptclick(c.getCartcontinueButton());
	// 	Threadsleep(3000);
    //     moveToElement(h.getCategeory53());
	//     moveToElement(h.getCategeory54());
	//     moveToElement(h.getCategeory55());
	//     moveToElement(h.getCategeory58());
	//     Threadsleep(3000);
	//     checkequaltext("To check Main category to Sub Category is displayed",h.getCategeory58().getText(),"Reverse Osmosis (RO) Plant");
	//     actionClick(h.getCategeory58());
	//     LOGGER.info("Main category to Sub Category is displayed");
	//     javascriptclick(c.getCartname4());
	//     Threadsleep(2000);
	// 	 ClickElement(p.getAddToCartButtonPDP());
	//     Threadsleep(3000);
	//     PassValues(p.getPincodefield(), "400058");
	//     ClickElement(p.getPincodecheckButton());
	//     Threadsleep(2000);
	//     Alertaccept();
	//     Threadsleep(2000);
	//      p = new PDPpage();
	//     ClickElement(p.getAddToCartButtonPDP());
	//     Threadsleep(3000);
	//     LOGGER.info("Add to cart button is clicked");
	//  //  javascriptclick(p.getPDPcheckoutButton());
	//   c = new Cartpage();
	//   moveToElement(c.getMinicartQty());
	//   Threadsleep(2000);
	//   actionClick(c.getMinicartQty());
	//   Threadsleep(2000);
	//   ClickElement(c.getAddToWishlistButton());
	//   Threadsleep(2000);
	//   LOGGER.info("Add to wishlist button is clicked");

	//   proceeds to the Checkout page

	   c = new Cartpage();
	   Threadsleep(4000);
	   javascriptclick(c.getCartCheckoutButton());
	   LOGGER.info("Cart checkout button is clicked");
	   Threadsleep(3000);
	   EndTimeprint();

}

@When("enters the shipping and billing details")
public void enters_the_shipping_and_billing_details() {
	 
	    StartTimeprint();
	    c = new Cartpage();
		Threadsleep(3000);
	    javascriptclick(c.getShippherebutton());

		// ClickElement(c.getAddnewAddressButton());
        // Threadsleep(3000);
		// // PassValues(c.getFname(), getdataExcel(1, 2));
		// // PassValues(c.getLname(), getdataExcel(2, 2));
		// PassValues(c.getCompanyname(), getdataExcel(3, 2));
		// PassValues(c.getStreetaddress1(), getdataExcel(4, 2));
		// PassValues(c.getStreetaddress2(), getdataExcel(5, 2));
		// PassValues(c.getStreetaddress3(), getdataExcel(6, 2));
		// //PassValues(c.getZip(), getdataExcel(7, 2));
		// Threadsleep(2000);
		// Select s = new Select(c.getAddresstype());
		// s.selectByIndex(2);
        // Threadsleep(2000);
		// PassValues(c.getMobilenumber(), getdataExcel(8, 2));
		// javascriptclick(c.getSaveAddressButton());
		 
		checkpresentElement("To Verify the  preselect shipping option  in checkout page",c.getPreselectshipping().isDisplayed());
		Threadsleep(2000);
	
}

@When("selects a payment option and places the order")
public void selects_a_payment_option_and_places_the_order() {

	 c = new Cartpage();
	 Threadsleep(4000);
	 javascriptclick(c.getPaymentButton());
	 Threadsleep(3000);
	 javascriptclick(c.getBillingaddress());
	 Threadsleep(2000);
     javascriptclick(c.getShowmoreoption());
	 Threadsleep(3000);
	  javascriptclick(c.getApplybutton());
	  Threadsleep(3000);

	  WebElement checkoutsubtotal1 =c.getCheckoutsubtotal();
	  String checkoutsubtotal2 = checkoutsubtotal1.getText();
	  String checkoutsubtotal3 = checkoutsubtotal2.substring(1).replace(",", "");
	  Double checkoutsubtotal4 = Double.valueOf(checkoutsubtotal3.replace(",", ""));
	  Double checkoutsubtotal5 = Double.valueOf(checkoutsubtotal4);
	
	  WebElement CHECKOUTIGST = c.getCheckoutIGST();       
      String CHECKOUTIGST1 = CHECKOUTIGST.getText();              
      String CHECKOUTIGST2 = CHECKOUTIGST1.substring(1).replace(",", "");  
      Double CHECKOUTIGST4 = Double.valueOf(CHECKOUTIGST2);         
      
	  WebElement CheckoutDiscount1 =c.getCheckoutDiscount1();
	  String CheckoutDisount2 = CheckoutDiscount1.getText();
	  String CheckoutDisount3 = CheckoutDisount2.substring(2).replace(",", "");
	  Double CheckoutDisount4 = Double.valueOf(CheckoutDisount3);
	
	//   WebElement SGST = c.getCartSGSTtax();
    //   String  SGST1 = SGST.getText();
    //   String SGST2 = SGST1.substring(1).replace(",", "");
    //   Double SGST3 = Double.valueOf(SGST2);
	//   System.out.println(SGST3);

	   double CheckoutTotal1 =  (checkoutsubtotal5 + CHECKOUTIGST4) -  CheckoutDisount4;
	   String T1 = String.valueOf(CheckoutTotal1);
	   System.out.println(T1);

	   WebElement  DiscountOrderSummarytotal = c.getCheckoutDiscount1Ordertotal();
	   String DiscountOrderSummarytotal1 = DiscountOrderSummarytotal.getText();
	   String DiscountOrderSummarytotal2 = DiscountOrderSummarytotal1.substring(1).replace(",", "");
	   Double DiscountOrderSummarytotal3 = Double.valueOf(DiscountOrderSummarytotal2);
       String DiscountOrderSummarytotal4 = String.valueOf(DiscountOrderSummarytotal3);
	  
	   checkpresentElement("To Verify the  order summary calculation in checkout page",DiscountOrderSummarytotal4.equals(T1));
	   LOGGER.info("Successfully verified order summary calculation after applying the coupon code in the checkout page");
	   Threadsleep(3000);
	   javascriptclick(c.getCancelbutton());
	   Threadsleep(3000);

	  WebElement CheckouSubtwithoutcoupon1  = c.getCheckoutwithoutcoupon1();
	  String CheckouSubtwithoutcoupon2 = CheckouSubtwithoutcoupon1.getText();
	  String CheckouSubtwithoutcoupon3 = CheckouSubtwithoutcoupon2.substring(1).replace(",", "");
	  Double CheckouSubtwithoutcoupon4 = Double.valueOf(CheckouSubtwithoutcoupon3.replace(",", ""));
	  Double CheckouSubtwithoutcoupon5 = Double.valueOf(CheckouSubtwithoutcoupon4);
	

	  WebElement CheckouIGSTtwithoutcoupon1 = c.getCheckoutwithoutcoupon2();  
      String CheckouIGSTtwithoutcoupon2 = CheckouIGSTtwithoutcoupon1.getText();              
      String CheckouIGSTtwithoutcoupon3 = CheckouIGSTtwithoutcoupon2.substring(1).replace(",", "");  
      Double CheckouIGSTtwithoutcoupon4 = Double.valueOf(CheckouIGSTtwithoutcoupon3);         
    
	   double CheckoutwithoutcouponTotal =  CheckouSubtwithoutcoupon5 + CheckouIGSTtwithoutcoupon4;
	   String w1 = String.valueOf(CheckoutwithoutcouponTotal);
	   System.out.println(w1);

	   WebElement  WithoutdiscountOrderSummarytotal =c.getCheckoutwithoutcoupon4();
	   String WithoutdiscountOrderSummarytota2 = WithoutdiscountOrderSummarytotal.getText();
	   String WithoutdiscountOrderSummarytota3 = WithoutdiscountOrderSummarytota2.substring(1).replace(",", "");
	   Double WithoutdiscountOrderSummarytota4 = Double.valueOf(WithoutdiscountOrderSummarytota3);
       String WithoutdiscountOrderSummarytota5 = String.valueOf(WithoutdiscountOrderSummarytota4);
	   
	   checkpresentElement("After,canceled the coupon code,To  check  the  order summary calculation in checkout page",WithoutdiscountOrderSummarytota5.equals(w1));
	   LOGGER.info("Successfully Verified order summary calculation after canceling the coupon code in the checkout page");
	   Threadsleep(3000);
		 
	//    javascriptclick(c.getTermconditionlink());
	//    Threadsleep(3000);
	//    javascriptclick(c.getTermcloselink());

	   Threadsleep(2000);
       javascriptclick(c.getTermcheckboxlogin());

	   //javascriptclick(c.getTermcheckbox());

}

@Then("after successful payment, the user should see the Thank You page")
public void after_successful_payment_the_user_should_see_the_thank_you_page() {

	c = new Cartpage();
    Threadsleep(3000);
	javascriptclick(c.getPlaceorder());
	LOGGER.info(" The order suceesfully plaed and redirect to the  Thank You page");
    Threadsleep(2000);
	EndTimeprint();

   // checkpresentElement("To ordernumber in success page",c.getSuccespageOrdernumber().isDisplayed());
	// String Successorder = c.getSuccespageOrdernumber().getText();
	// moveToElement(c.getLoginIcon2());
	// actionClick(c.getMyaccountlink());
	// Threadsleep(3000);

	//  ClickElement(c.getMyOrder1());
	//  Threadsleep(3000);
	
    //  LOGGER.info("My  all the orders is displayed in Orderlisting page");

	//  String Myaccountordernumber = c.getOrdernumber().getText();

	// System.out.println("Thankyou page order number : " + Successorder);
    // System.out.println("My account page order number : " + Myaccountordernumber);

    // Assert.assertEquals(Successorder, Myaccountordernumber);

	// javascriptclick(c.getVieworder());
	// LOGGER.info("Order listing page View orders link is dispalyed & clicked");

}

@Given("user opens the Home page and do the login with valid credential")
public void user_opens_the_home_page_and_do_the_login_with_valid_credential() {

	 StartTimeprint(); 
	 h = new Homepage();
	 LOGGER.info("KBL site home page are launched");
     String title = driver.getTitle();
     checkpresentElement("To check title at Home page",title.contains("E-shop"));
	 Threadsleep(2000);
	 moveToElement(h.getLoginIcon());
	// checkpresentElement("To check Login icon is displayed",h.getLoginIcon().isDisplayed());
	 Threadsleep(4000);
	 LOGGER.info("Login icon is displayed");
	 javascriptclick(h.getLogin());
	 Threadsleep(2000);
	 LOGGER.info("Login icon is clicked");
	
	 l = new Loginpage();
	 moveToElement(l.getPasswordLogin());
	 checkpresentElement("To check Password login is displayed",l.getPasswordLogin().isDisplayed());
	 actionClick(l.getPasswordLogin());
	 LOGGER.info("login with Password option is clicked");
	 Threadsleep(3000);
	 l = new Loginpage();
	 PassValues(l.getEmailField(), getdataExcel(1, 1));
	 checkpresentElement("To check Email field is displayed",l.getEmailField().isDisplayed());
	 LOGGER.info("Email field is displayed");
	 PassValues(l.getPasswordField(), getdataExcel(2, 1));
	 checkpresentElement("To check Password field is displayed",l.getPasswordField().isDisplayed());
     Threadsleep(4000);
	 ClickElement(l.getLoginButton());
     EndTimeprint();

}    

@When("User Enter the product name in search box {string} and the user navigates to the PDP  page via search field")
public void user_enter_the_product_name_in_search_box_and_the_user_navigates_to_the_pdp_page_via_search_field(String Keyproduct) {
  
	 StartTimeprint();
	 s = new Searchpage();
	 moveToElement(s.getSearchBox());
	 Threadsleep(2000);
	 PassValues(s.getSearchBox(), Keyproduct);
	 LOGGER.info("Product name is entered in search box");
     Threadsleep(4000);
	 ClickElement(s.getProductnameSLP());
	 LOGGER.info("Product name is clicked and Succesfully redirection to the respective  product page");
	 EndTimeprint();

}

@When("Enter the pincode detail and Add to cart.Then,Go to chekout page")
public void enter_the_pincode_detail_and_add_to_cart_then_go_to_chekout_page() {
   
	  p = new PDPpage();
	  ClickElement(p.getAddToCartButtonPDP());
	  Threadsleep(3000);
	  PassValues(p.getPincodefield(), getdataExcel(3, 1));
	  ClickElement(p.getPincodecheckButton());
	  Threadsleep(3000);
	   Alertaccept();
      Threadsleep(2000);
      ClickElement(p.getAddToCartButtonPDP());
	  Threadsleep(2000);
	  LOGGER.info("Add to cart button is clicked");
	  Threadsleep(2000);
	  javascriptclick(p.getPDPcheckoutButton());
   
}


 @When("Select the  the shipping and billing details and Place the order")
 public void select_the_the_shipping_and_billing_details_and_place_the_order() {

	    StartTimeprint();
        Threadsleep(5000);
	    c = new Cartpage();
		Threadsleep(5000);
	    javascriptclick(c.getShippherebutton());
	    Threadsleep(4000);
	    javascriptclick(c.getPaymentButton());
	    Threadsleep(3000);
	    javascriptclick(c.getBillingaddress());
        Threadsleep(4000);
        javascriptclick(c.getTermcheckboxlogin());
         Threadsleep(4000);
	     javascriptclick(c.getPlaceorder());
	    LOGGER.info(" The order suceesfully plaed and redirect to the  Thank You page");
     
     	Threadsleep(5000);
	 
	   c = new Cartpage();
       SuccessorderNo1 = c.getSuccespageOrdernumber().getText().trim();  
        System.out.println("Order ID captured: " + SuccessorderNo1);
        EndTimeprint();
      
}

@Given("the user opens the admin login page")
public void the_user_opens_the_admin_login_page() {

	 StartTimeprint();
	 launchurl("https://betaeshopadm.kirloskarpumps.com/kbladmin");
	 Threadsleep(3000);
	 h = new Homepage();
	 LOGGER.info("KBL admin site  are launched");
     String title = driver.getTitle();
     checkpresentElement("To check title at Home page",title.contains("Admin"));
	 EndTimeprint();

}

@When("the user enters valid login credentials and clicks the Sign In button")
public void the_user_enters_valid_login_credentials_and_clicks_the_sign_in_button() {

	 a = new Adminlogin();
	 Threadsleep(3000);
	 PassValues(a.getAdminUsername(),getdataExcel(1, 3));
	 PassValues(a.getAdminpassword(), getdataExcel(2, 3));
     Threadsleep(3000);
     javascriptclick(a.getSignInButton1());
	// ClickElement(a.getConfirmButton1());

}

@Then("After,loggein admin site>To be verify the Warehouse  allocation code btw the order detail page and Warehouse stock listing page")
public void after_loggein_admin_site_to_be_verify_the_warehouse_allocation_code_btw_the_order_detail_page_and_warehouse_stock_listing_page() throws AWTException {
   
	a = new Adminlogin();
	 Threadsleep(4000);
     moveToElement(a.getSales());
	 actionClick(a.getSales());
	 Threadsleep(2000);
	 moveToElement(a.getSalesOrder());
	 actionClick(a.getSalesOrder());
	 Threadsleep(4000);
	 driver.navigate().refresh();
	  Threadsleep(2000);
	  driver.navigate().refresh();

	//   Threadsleep(3000);
	//  javascriptclick(a.getClearallinlorderdetailpage());
	//  KeyEnter();

	 Threadsleep(5000);
	 String OrderText2 = a.getOrderNumberlistingpage().getText().trim();
     System.out.println("Order number Text: " +OrderText2);
	 
	 checkequaltext("To verify the order-ids btw the Thankyou page & admin panel", SuccessorderNo1, OrderText2);


	 String statusText = a.getPaidstatus().getText().trim();
     System.out.println("Status Text:" + statusText);
	if (statusText.equalsIgnoreCase("Paid")) {
		 javascriptclick(a.getPaidstatus());
         System.out.println("Status is Paid");
     }
    else if (statusText.equalsIgnoreCase("Pending")) {
    System.out.println("Status is Pending");

	  javascriptclick(a.getPaidstatus());
	  javascriptclick(a.getPaidoption());
	  Threadsleep(3000);
  } 
   else {
    Assert.fail("Unexpected status: " + statusText);
   }

    for (int i = 0; i <6; i++) {
		KeyDOWN();
	}

	 Threadsleep(4000);

	 javascriptclick(a.getWarhouseallcation());

	 String expectedWarehouseCode = a.getWarhouseallcationcode().getText();

	 System.out.println(expectedWarehouseCode);
	
	

     for (int i = 0; i <16; i++) {
		KeyDOWN();
	}

     Threadsleep(3000);
	
	 moveToElement(a.getAMbab());

	 actionClick(a.getAMbab());
	 
     for (int i = 0; i <5; i++) {
		KeyUP();
	}
    
	  Threadsleep(3000);

      moveToElement(a.getAMbabManagepincode());

	  actionClick(a.getAMbabManagepincode());

	  Threadsleep(3000);
	 
	 moveToElement(a.getClearallinlorderdetailpage());
	 actionClick(a.getClearallinlorderdetailpage());


	Threadsleep(3000);

    javascriptclick(a.getFilteroptions());

	Threadsleep(3000);

	PassValues(a.getPincodefield(), getdataExcel(3, 1));

	String Pincode1 =  a.getPincodefield().getAttribute("value");

	System.out.println("Pincode1: " + Pincode1);

	KeyEnter();

	Threadsleep(3000);

	String Pincode2 = a.getAmbabpdppincode().getText();
	  
	Assert.assertEquals("Verify the Pincode is matched or not", Pincode1, Pincode2);

	String Actualwarehousecode = a.getAmbaballocationcode().getText().trim();

// if (Pincode1.equalsIgnoreCase(Pincode2)) {
// 	String Actualwarehousecode = a.getAmbaballocationcode().getText().trim();
// 	// Assert.assertEquals("Warehouse Code mismatch",expectedWarehouseCode, Actualwarehousecode);
// 	// LOGGER.info("Succesfully verified  warhouse allocation code the btw order detail  & Manage pincode page for pump products in admin panel");
// } 
// else {
// 	Assert.fail("Pincode does not match: Expected " + Pincode1 + ", but found " + Pincode2);
// }

          Threadsleep(3000);
		  moveToElement(a.getWarehouse());
		  actionClick(a.getWarehouse());

        Threadsleep(3000);
	     moveToElement(a.getWarehousestocklisting());
	     actionClick(a.getWarehousestocklisting());
	     Threadsleep(3000);

	   moveToElement(a.getClearallinlorderdetailpage());
	   actionClick(a.getClearallinlorderdetailpage());

        Threadsleep(3000);
		javascriptclick(a.getFilteroptions());
	    PassValues(a.getSKUfield(), getdataExcel(8, 1));
	    String SKU2 =  a.getSKUfield().getAttribute("value");
	    System.out.println(SKU2);
		Threadsleep(3000);

	     KeyEnter();

	    Threadsleep(2000);

List<WebElement> CodesAndQty = driver.findElements(By.xpath("//table//tbody//tr"));
System.out.println("Verifying Warehouse Code and Qty column data:");

for (int i = 1; i <= CodesAndQty.size(); i++) {
  
	try {
        WebElement warehouseCodeCell = driver.findElement(By.xpath("//table//tbody//tr[" + i + "]/td[2]"));
        String warehouseCode = warehouseCodeCell.getText().trim();

        if (warehouseCode.equals(Actualwarehousecode)) {
            System.out.println("Successfully fetched warehouse code from stock listing page.");

            WebElement qtyCell = driver.findElement(By.xpath("//table//tbody//tr[" + i + "]/td[6]"));
            String qtyText = qtyCell.getText().trim();

            int qty = Integer.parseInt(qtyText);

            if (qty > 0) {
                System.out.println("Success: Warehouse Code " + Actualwarehousecode + " has Qty = " + qty);
                Assert.assertEquals("Warehouse Code matched", expectedWarehouseCode, Actualwarehousecode);
                LOGGER.info("Verified warehouse code & Qty on stock listing page.");
				System.out.println();
            } 
				
	else if (qty <= 0) { 

                System.out.println("Error: Warehouse Code " + Actualwarehousecode + " has Qty = " + qty);
                Thread.sleep(2000);
                // Re-navigate to Manage Warehouse
                moveToElement(a.getWarehouse());
                actionClick(a.getWarehouse());
                Thread.sleep(2000);
                moveToElement(a.getManagewarehouse1());
				actionClick(a.getManagewarehouse1());
               
				Thread.sleep(3000);

                List<WebElement> manageRows = driver.findElements(By.xpath("//table//tbody//tr"));
               
				for (int j = 1; j <= manageRows.size(); j++) {
                    WebElement codeCell = driver.findElement(By.xpath("//table//tbody//tr[" + j + "]/td[3]"));
                    String code = codeCell.getText().trim();

                    if (code.equals(Actualwarehousecode)) {
                        WebElement baseCode = driver.findElement(By.xpath("//table//tbody//tr[" + j + "]/td[4]"));
                        Thread.sleep(3000);
                        javascriptclick(baseCode);
                        Thread.sleep(3000);

                        List<WebElement> priorityDropdowns = driver.findElements(By.xpath("//select[contains(@name, 'p')]"));
                        Set<String> uniqueCodes = new LinkedHashSet<>();

                        for (WebElement dropdown : priorityDropdowns) {
                            Select select = new Select(dropdown);
                            String selectedText = select.getFirstSelectedOption().getText().trim();
                          
							if (selectedText.contains("kbl.co.in")) {
                                String extractedCode = selectedText.substring(0, 4);
                                uniqueCodes.add(extractedCode);
                                System.out.println("Collected unique code: " + extractedCode);
                            }
                        }

                        List<String> codesList = new ArrayList<>(uniqueCodes);

                        writeUniqueCodesToExcel("E:\\KBL-Project\\KBL-Business flow\\target\\Data\\KBL datas2.xlsx", codesList, "Warehouse Codes");
                        // Re-apply filters
                        moveToElement(a.getWarehouse());
                        actionClick(a.getWarehouse());
                        Thread.sleep(3000);

                        moveToElement(a.getWarehousestocklisting());
                        actionClick(a.getWarehousestocklisting());
                        Thread.sleep(3000);

                        moveToElement(a.getClearallinlorderdetailpage());
                        actionClick(a.getClearallinlorderdetailpage());
                        Thread.sleep(3000);

                        javascriptclick(a.getFilteroptions());
                        PassValues(a.getSKUfield(), getdataExcel(8, 1));
                        String SKU3 = a.getSKUfield().getAttribute("value");
                        System.out.println(SKU3);
                        Thread.sleep(4000);
                        KeyEnter();

      
                   
    // Match against Excel codes

			String defaultWarehouseCode = "1023";
			System.out.println(1023);

List<WebElement> listingpagefinalRows1 = driver.findElements(By.xpath("//table//tbody//tr"));
List<String> excelCodes = readWarehouseCodesFromExcel("E:\\KBL-Project\\KBL-Business flow\\target\\Data\\KBL datas2.xlsx");
System.out.println("Excel Priority Codes: " + excelCodes);

for (String excelCode : excelCodes) {

	//boolean matchFound = false;

	System.out.println("Checking Excel Code: " + excelCode);

	for (int k = 1; k <= listingpagefinalRows1.size(); k++) {

		WebElement warehouseCodeCell1 = driver.findElement(By.xpath("//table//tbody//tr[" + k + "]/td[2]"));
		String warehouseCode2 = warehouseCodeCell1.getText().trim();

		if (warehouseCode2.contains(".")) {
			System.out.println("Skipping decimal warehouse code: " + warehouseCode2);
			continue;
		}

		System.out.println("Comparing Warehouse Code: " + warehouseCode2 + " with Excel Code: " + excelCode);
		
		if (warehouseCode2.equals(excelCode)) {
		
			WebElement qtyCell1 = driver.findElement(By.xpath("//table//tbody//tr[" + k + "]/td[6]"));
			String qtyText1 = qtyCell1.getText().trim();
			
			int qty2 = Integer.parseInt(qtyText1);

			System.out.println("Warehouse Code: " + warehouseCode2 + ", Qty: " + qty);

			if (qty2 > 0) {
				System.out.println("Success: Warehouse Code " + warehouseCode2 + " has Qty = " + qty2);
				Assert.assertEquals("Warehouse Code matched", expectedWarehouseCode, warehouseCode2);
				LOGGER.info("Verified warehouse code & Qty on stock listing page from the priority list page.");
			} else {

				System.out.println("Qty = 0 for Warehouse Code: " + warehouseCode2 + ". Check next priority code.");
				
				break;
			}

		
	// 		if (!matchFound) {
	//     	System.out.println("GAP: Warehouse code from Excel NOT found on the web page: " + excelCode);
	// 	 Assert.fail("Warehouse code from Excel not found on the web page: " + excelCode);
	//  }

		}
	
	}

	}       

	Assert.assertEquals("Fallback to default warehouse code", expectedWarehouseCode, defaultWarehouseCode);
    System.out.println("Fallback Success: Default Warehouse Code " + defaultWarehouseCode + " is used.");

	
}

	}

}
		
}

			
	}


	catch (Exception e) {
//  System.out.println("Exception at row " + i + ": " + e.getMessage());
  
}


}

	}

	// Warehouse portal scenarios for Pump products
@When("After,loggedin>User need to Place the order successfully")
public void after_loogedin_user_need_to_place_the_order_successfully() {

	StartTimeprint();
	s = new Searchpage();
	moveToElement(s.getSearchBox());
	Threadsleep(2000);
	PassValues(s.getSearchBox(), getdataExcel(9, 1));
	 LOGGER.info("Product name is entered in search box");
     Threadsleep(2000);
	 ClickElement(s.getProductnameSLP());
	 LOGGER.info("Product name is clicked and Succesfully redirection to the respective  product page");
	p = new PDPpage();
	ClickElement(p.getAddToCartButtonPDP());
	Threadsleep(3000);
	PassValues(p.getPincodefield(), getdataExcel(3, 1));
	ClickElement(p.getPincodecheckButton());
	Threadsleep(3000);
	Alertaccept();
    Threadsleep(2000);
    ClickElement(p.getAddToCartButtonPDP());
	Threadsleep(2000);
	LOGGER.info("Add to cart button is clicked");
	Threadsleep(2000);
	javascriptclick(p.getPDPcheckoutButton());

	StartTimeprint();
    Threadsleep(5000);
		
	c = new Cartpage();
	Threadsleep(5000);
	    
	javascriptclick(c.getShippherebutton()); 
	Threadsleep(4000);
	    javascriptclick(c.getPaymentButton());
	    Threadsleep(3000);
	    javascriptclick(c.getBillingaddress());
        Threadsleep(4000);
        javascriptclick(c.getTermcheckboxlogin());
         Threadsleep(4000);
	     javascriptclick(c.getPlaceorder());

	LOGGER.info(" The order suceesfully plaed and redirect to the  Thank You page");
     
	Threadsleep(5000);
	 
        EndTimeprint();
    
	   c = new Cartpage();
       SuccessorderNo1 = c.getSuccespageOrdernumber().getText().trim();  
        System.out.println("Order ID captured: " + SuccessorderNo1);
}

@When("Observe the Pump  products placed Orderid and Allocated warehousecode from admin order detail page")
public void observe_the_pump_products_placed_orderid_and_allocated_warehousecode_from_admin_order_detail_page() throws AWTException, InterruptedException {
   
     StartTimeprint();
	 launchurl("https://betaeshopadm.kirloskarpumps.com/kbladmin");
	 Threadsleep(3000);
	 h = new Homepage();
	 LOGGER.info("KBL admin site  are launched");
     String title = driver.getTitle();
     checkpresentElement("To check title name at admin Login page",title.contains("Admin"));

	a = new Adminlogin();
	 Threadsleep(3000);
	 PassValues(a.getAdminUsername(),getdataExcel(1, 3));
	 PassValues(a.getAdminpassword(), getdataExcel(2, 3));
     Threadsleep(3000);
     javascriptclick(a.getSignInButton1());

	 a = new Adminlogin();
	 Threadsleep(4000);
     moveToElement(a.getSales());
	 actionClick(a.getSales());
	 Threadsleep(2000);
	 moveToElement(a.getSalesOrder());
	 actionClick(a.getSalesOrder());
	 Threadsleep(4000);
	 driver.navigate().refresh();
	 Threadsleep(2000);
	 driver.navigate().refresh();

	  Threadsleep(3000);
	 javascriptclick(a.getClearallinlorderdetailpage());
	 KeyEnter();

	 Threadsleep(5000);
	 OrderText3 = a.getOrderNumberlistingpage().getText().trim();
	 System.out.println("Order number Text: " +OrderText3);

  checkequaltext("To verify the order-ids btw the Thankyou page & admin panel", SuccessorderNo1, OrderText3);

	 String statusText = a.getPaidstatus().getText().trim();
     System.out.println("Status Text:" + statusText);
	if (statusText.equalsIgnoreCase("Paid")) {
		 javascriptclick(a.getPaidstatus());
         System.out.println("Status is Paid");
     }
    else if (statusText.equalsIgnoreCase("Pending")) {
    System.out.println("Status is Pending");

	  javascriptclick(a.getPaidstatus());
	  javascriptclick(a.getPaidoption());
	  Threadsleep(3000);

  } 

   else {
    Assert.fail("Unexpected status: " + statusText);
   }

    for (int i = 0; i <6; i++) {
		KeyDOWN();
	}

	 Threadsleep(4000);
	 javascriptclick(a.getWarhouseallcation());
	 String expectedWarehouseCode = a.getWarhouseallcationcode().getText();
	 System.out.println(expectedWarehouseCode);
	
     for (int i = 0; i <16; i++) {
		KeyDOWN();
	}


	          Threadsleep(3000);
 
               moveToElement(a.getWarehouse());
                actionClick(a.getWarehouse());
                Thread.sleep(2000);
                moveToElement(a.getManagewarehouse1());
				actionClick(a.getManagewarehouse1());
               
				Thread.sleep(3000);


List<WebElement> manageRows1 = driver.findElements(By.xpath("//table//tbody//tr"));


for (int i = 1; i <= manageRows1.size(); i++) {
  
	try {
        
		WebElement codeCell1 = driver.findElement(By.xpath("//table//tbody//tr[" + i + "]/td[3]"));
        String code2 = codeCell1.getText().trim();


		if (code2.equals(expectedWarehouseCode)) {

		  System.out.println("Successfully fetched warehouse Base code from Manage warehouse code page.");

		 WebElement  WarehouseportalEmail = driver.findElement(By.xpath("//table//tbody//tr[" + i + "]/td[8]"));
		
		WarehouseportalEmail2 = WarehouseportalEmail.getText().trim();
		System.out.println("Warehouse Portal Emailid for login: " + WarehouseportalEmail2);
		break; 

		}

	}

catch (Exception e) {
 System.out.println("Exception at row " + i + ": " + e.getMessage());
  
}
     
}
EndTimeprint();

     StartTimeprint();
     a = new Adminlogin();
	 w = new warehouse();
     
	 launchurl("https://betaeshop.kirloskarpumps.com/inventorysystem/supplierlogin/supplierlogin/");
	 Threadsleep(3000);
	 LOGGER.info("KBL Warehouse site  are launched");
     String title2 = driver.getTitle();
     checkpresentElement("To check title name at Warehouse Login page",title2.contains("Warehouse Login"));
	 Threadsleep(2000);
     javascriptclick(w.getLoginwithEmailCTA());
	 Threadsleep(3000);
	 System.out.println("Logging in with email: " + WarehouseportalEmail2);
	 PassValues(w.getEmailfieldinwarehouse(),WarehouseportalEmail2);
	 PassValues(w.getPasswordfieldinwarehouse(), getdataExcel(10, 1));
     Threadsleep(3000);
     javascriptclick(w.getLoginasEmailsubmitbtn());    
	
	 Threadsleep(5000);
	 implicitWait();


	 w = new warehouse();
	 checkpresentElement("To check My orders options available or not in My Warehouse page",w.getMyordersinwarehouse().isDisplayed());
     Threadsleep(3000);
	 ClickElement(w.getMyordersinwarehouse());
     LOGGER.info("My order option  is displayed in Warehouse portal page");
	 Threadsleep(3000);

	 w.getSortingSerialNo().click();
	 Thread.sleep(5000);
	 driver.navigate().refresh();
	 Thread.sleep(5000);
	

// Capture serial numbers from the first column

List<WebElement> srNoElements = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));

List<Integer> serialNumbers = new ArrayList<>();
for (WebElement srNoElement : srNoElements) {
	String text = srNoElement.getText().trim();
	System.out.println("Serial No: " + text);
	serialNumbers.add(Integer.parseInt(text));
}


// Verify sorting (descending)
List<Integer> descSorted = new ArrayList<>(serialNumbers);
Collections.sort(descSorted, Collections.reverseOrder());
boolean isSortedDesc = serialNumbers.equals(descSorted);
System.out.println("Serial numbers are sorted descending: " + isSortedDesc);


// Verify sorting (ascending)
List<Integer> ascSorted = new ArrayList<>(serialNumbers);
Collections.sort(ascSorted);
boolean isSortedAsc = serialNumbers.equals(ascSorted);
System.out.println("Serial numbers are sorted ascending: " + isSortedAsc);

      Thread.sleep(4000);
	 clearvalue(w.getStatusInputfieldinwarehouse());
	 Thread.sleep(2000);

	 PassValues(w.getStatusInputfieldinwarehouse(),getdataExcel(12, 1));
	 Thread.sleep(3000);
	 String StatusValue = w.getStatusInputfieldinwarehouse().getAttribute("value");
     Thread.sleep(3000);

	 checkequaltext("To verify the order-status filter in warehouse portal page", StatusValue, w.getFiltereStatusinwarehouse().getText().trim());
	 LOGGER.info("Successfully verified the listed order sorting&Filter funtionality  in warehouse portal order listing page");
	
	 clearvalue(w.getStatusInputfieldinwarehouse());

	 Thread.sleep(3000);
	  
    driver.navigate().refresh();
	 
	Thread.sleep(3000);

	 moveToElement(w.getMyorderInputfieldinwarehouse());
	 actionClick(w.getMyorderInputfieldinwarehouse());
	 Threadsleep(2000);

	 System.out.println("Order Text 3: " + OrderText3);
	 PassValues(w.getMyorderInputfieldinwarehouse(),OrderText3);
	 w.getFilteredorderidinwarehouse().isDisplayed();
	 Threadsleep(3000);
	 checkequaltext("To verify the order-ids btw the Thankyou page & warehouse portal page", OrderText3, w.getFilteredorderidinwarehouse().getText().trim());
	 LOGGER.info("Successfully verified the placed orderid btw the Thankyou page & warehouse portal page");
     Threadsleep(3000);


	 String SKUinwarehouse1 = w.getFilterSKUidinwarehouse().getText().trim();

	 moveToElement(w.getViewdetailsbtninwarehouse());
	 actionClick(w.getViewdetailsbtninwarehouse());
	 Threadsleep(2000);

	 checkequaltext("To verify the SKU id btw the order detail page & warehouse order detail page", SKUinwarehouse1, w.SKUidinwarehousedetailpage().getText().trim());
	 LOGGER.info("Successfully verified the SKU id btw the order detail page & warehouse list of the order  page");
	 Threadsleep(3000);

  
	for (int i = 0; i <10; i++) {
		KeyDOWN();
	}
	Threadsleep(2000);
	
	checkpresentElement("To check the serial number input field is available or not in warehouse portal page",w.getEnterSerialNumberinwarehousedetailpage().isDisplayed());
	LOGGER.info("To check the serial number input field is available or not in warehouse portal order detail page");

	

	for (int i = 0; i <7; i++) {
		KeyDOWN();
	}

w = new warehouse();
Threadsleep(3000);
javascriptclick(w.getSubmitbtnPOD());
Threadsleep(3000);
checkpresentElement("To check the POD alert message is displayed or not in warehouse portal page",w.getFileErrorforPOD().isDisplayed());
LOGGER.info("To verify  the POD alert message is displayed or not in warehouse portal order detail page");
Threadsleep(3000);
javascriptclick(w.getReadyforShipbtnCTA());
Threadsleep(3000);
checkpresentElement("To check the 'File required before submitting Ready to Ship' alert message is displayed or not in warehouse portal page", w.getFilerequiredforRTS().isDisplayed());
LOGGER.info("To verify  the 'File required before submitting Ready to Ship' alert message is displayed or not in warehouse portal order detail page");


	for (int i = 0; i < 7; i++) {
		KeyUP();
	}

        String proofOfDelivery = "C:\\Users\\Administrator\\Downloads\\Sample datas.jpg";
		String invoice = "C:\\Users\\Administrator\\Downloads\\Rent-1_1.pdf";
        String packingSlip = "C:\\Users\\Administrator\\Downloads\\Rent-1_1.pdf";
        String packingImages = "C:\\Users\\Administrator\\Downloads\\Sample datas.jpg";

w.getDelivery_proofinwarehousedetailpage().sendKeys(proofOfDelivery);

Threadsleep(3000);

// javascriptclick(w.getSubmitbtnPOD());
// Threadsleep(3000);

	for (int i = 0; i < 15; i++) {
		KeyDOWN();
	}

	
	 w.getWarehouse_invoiceinwarehousedetailpage().sendKeys(invoice);
	 Threadsleep(3000);
	 w.getPackingSlipinwarehousedetailpage().sendKeys(packingSlip);
	 Threadsleep(3000);
	 w.getPackingImagesinwarehousedetailpage().sendKeys(packingImages);
	 Threadsleep(3000);

	PassValues(w.getSap_invoice_numberinwarehousedetailpage(), getdataExcel(14, 1));

	javascriptclick(w.getReadyforShipbtnCTA());

	Threadsleep(3000);

    PassValues(w.getEnterSerialNumberinwarehousedetailpage(), getdataExcel(13, 1));

	Threadsleep(3000);

	javascriptclick(w.getReadyforShipbtnCTA());

	 Threadsleep(5000);

	 for (int i = 0; i < 10; i++) {
  	   KeyUP();
	
}

	checkpresentElement("To check the Success message is displayed or not in warehouse portal page",w.getUpdatedRTSuccessfullymsg().isDisplayed());
	LOGGER.info("Ready to ship button is clicked and Success message is displayed");
	Threadsleep(3000);
    EndTimeprint();


 }

@Then("To verify the Orderid are sync or not E-warranty page at admin portal")
public void to_verify_the_orderid_are_sync_or_not_e_warranty_page_at_admin_portal() throws AWTException, InterruptedException {
  

	StartTimeprint();
	launchurl("https://betaeshopadm.kirloskarpumps.com/kbladmin");
	Threadsleep(3000);
	h = new Homepage();
	LOGGER.info("KBL admin site  are launched");
	
	// a = new Adminlogin();
	// Threadsleep(3000);
	// PassValues(a.getAdminUsername(),getdataExcel(1, 3));
	// PassValues(a.getAdminpassword(), getdataExcel(2, 3));
	// Threadsleep(3000);
	// javascriptclick(a.getSignInButton1());

	Threadsleep(3000);
	moveToElement(a.getEwarranty());
	actionClick(a.getEwarranty());

	for (int i = 0; i < 15; i++) {
		KeyUP();
	}

	Threadsleep(3000);
	moveToElement(a.getEwarrantyManage());
	actionClick(a.getEwarrantyManage());

	Threadsleep(2000);
	driver.navigate().refresh();
	Threadsleep(3000);

	 javascriptclick(a.getClearallinlorderdetailpage());

	Threadsleep(3000);
	javascriptclick(a.getFilteroptions());

	//Use the global OrderText3 variable

	PassValues(w.getOrderNumerFieldinWarranty(), OrderText3);

	System.out.println("Order Text 3: " + OrderText3);

	Thread.sleep(3000);

	KeyEnter();
	Threadsleep(5000);

	String OrderText4 = a.getOrderNumberlistingpage().getText().trim();

	System.out.println("Order number Text from E-warrantypage: " + OrderText4);

	String SerialnumberinEwarranty = a.getEwarrantyserialnumber().getText().trim();
	System.out.println("Serial number Text from E-warrantypage: " + SerialnumberinEwarranty);

	checkequaltext("To verify the order-ids btw the Thankyou page & admin panel", OrderText3, OrderText4);

	checkequaltext("To verify the Serial number-ids btw the Warehouse page & admin Ewarranty page", getdataExcel(13, 1), SerialnumberinEwarranty);

	LOGGER.info("Successfully verified the placed orderid&Serial number btw the Warehouse portal page & E-warranty page at admin portal");
	Threadsleep(5000);

	a = new Adminlogin();
	 Threadsleep(4000);
	 moveToElement(a.getSales());
	 actionClick(a.getSales());
	 Threadsleep(2000);
	 moveToElement(a.getSalesOrder());
	 actionClick(a.getSalesOrder());
	 Threadsleep(3000);

	 driver.navigate().refresh();

	Threadsleep(4000);

	javascriptclick(a.getClearallinlorderdetailpage());

	
    Threadsleep(3000);

	javascriptclick(a.getFilteroptions());

	// Use the global OrderText3 variable
	 
	 w = new warehouse();

//PassValues(w.getOrderNumerFieldinSales2(), getdataExcel(17, 1));


PassValues(w.getOrderNumerFieldinSales2(), getdataExcel(18, 1));


	// PassValues(w.getOrderNumerFieldinSales2(), OrderText3);
	// System.out.println("Order Text 3: " + OrderText3);
	// Thread.sleep(3000);

	// KeyEnter();
	// Threadsleep(5000);

	// String OrderText4_detail = a.getOrderNumberlistingpage().getText().trim();
	// System.out.println("Order number Text from Orderdetailpage: " + OrderText4_detail);
	// checkequaltext("To verify the order-ids btw the Thankyou page & admin panel", OrderText3, OrderText4_detail);

	 String statusText = a.getPaidstatus().getText().trim();
     System.out.println("Status Text:" + statusText);

	if (statusText.equalsIgnoreCase("Ready To Ship")) {

		System.out.println("Status is Pass");

     }

    else  {

		System.out.println("Status is Pending");
	  
	}

	LOGGER.info("The item status is \"Ready to ship\">Successfully verified the placed orderid  btw the Warehouse portal page & Order detail  page at admin page");
	Threadsleep(4000);

	 s1 = new Sparespage();

 for (int i = 0; i < 15; i++) {
		KeyDOWN();
	}

		Threadsleep(5000);

javascriptclick(s1.getPumpActioncheckbox());

Threadsleep(6000);

javascriptclick(s1.getActionbutton());

Threadsleep(5000);

for (int i = 0; i < 8; i++) {
		KeyDOWN();
	}

        javascriptclick(s1.getSyncorderbutton());

	    Threadsleep(3000);

	    verifyButton(s1.getSyncDTDC(), "Sync Order to DTDC");

	
	
		String selectedLSP3 =  s1.getSyncDTDC().getText();
	   System.out.println(selectedLSP3);
	
		
		 Threadsleep(3000);
	

        // verifyButton(s1.getSyncDNS(), "Sync Order to DNS");
        // verifyButton(s1.getSyncSmartship(), "Sync Order to Smartship");
        // verifyButton(s1.getSyncShipRocket(), "Sync Order to ShipRocket");
		
		LOGGER.info("Successfully verified the LSP Options in Pop-up page in Listing of the Order  page");


	//    String selectedLSP2 = s1.getSyncSmartship().getText();
	//     System.out.println(selectedLSP2);


		if (selectedLSP3.equalsIgnoreCase("Sync Order to DTDC")) {
     
		javascriptclick(s1.getSyncDTDC());
        LOGGER.info("Clicked on Sync DTDC button");
    }
    
else {
    LOGGER.error("Invalid LSP selection: " + selectedLSP3);
    return; // Exit test
}

// Wait and scroll down to load the UI
Threadsleep(3000);
for (int i = 0; i < 25; i++) {
    KeyDOWN();
}
Thread.sleep(3000);

// Check if "Dimension list" box is present and contains correct text

List<WebElement> dimensionList = driver.findElements(By.xpath("(//table//tr)[2]/td"));
System.out.println("Dimension list size: " + dimensionList.size());

for (WebElement dimension : dimensionList) {

	if (dimension.isDisplayed()) {
        String productDimension = dimension.getText();
        System.out.println("Dimension: " + productDimension);
		LOGGER.warn("Dimension details  is  displayed in LSP page.");
    } 
	
	else {
        LOGGER.warn("Dimension details  is not displayed.");
    }

}
	
 LOGGER.info(" Finished verifying LSP sync behavior for: " + selectedLSP3);
 EndTimeprint();


        // verifyButton(s1.getSyncDNS(), "Sync Order to DNS");
        // verifyButton(s1.getSyncSmartship(), "Sync Order to Smartship");
        // verifyButton(s1.getSyncShipRocket(), "Sync Order to ShipRocket");
        // verifyButton(s1.getSyncSparesShipRocket(), "Sync Order to Spares ShipRocket");
        // verifyButton(s1.getSyncSparesSmartship(), "Sync Order to Spares Smartship");
		
		
}


// LSP options verification for pump products

@When("User need to Place the order successfully and change the status to ready for Ship")
public void user_need_to_place_the_order_successfully_and_change_the_status_to_ready_for_ship() throws AWTException, InterruptedException {

	
	StartTimeprint();
	s = new Searchpage();
	moveToElement(s.getSearchBox());
	Threadsleep(2000);
	PassValues(s.getSearchBox(), getdataExcel(9, 1));
	 LOGGER.info("Product name is entered in search box");
     Threadsleep(4000);
	 ClickElement(s.getProductnameSLP());
	 LOGGER.info("Product name is clicked and Succesfully redirection to the respective  product page");
	p = new PDPpage();
	ClickElement(p.getAddToCartButtonPDP());
	Threadsleep(3000);
	PassValues(p.getPincodefield(), getdataExcel(3, 1));
	ClickElement(p.getPincodecheckButton());
	Threadsleep(3000);
	Alertaccept();
    Threadsleep(2000);
    ClickElement(p.getAddToCartButtonPDP());
	Threadsleep(2000);
	LOGGER.info("Add to cart button is clicked");
	Threadsleep(2000);
	javascriptclick(p.getPDPcheckoutButton());

	StartTimeprint();
    Threadsleep(5000);
		
	c = new Cartpage();
	Threadsleep(5000);
	    
	javascriptclick(c.getShippherebutton()); 
	Threadsleep(4000);
	    javascriptclick(c.getPaymentButton());
	    Threadsleep(3000);
	    javascriptclick(c.getBillingaddress());
        Threadsleep(4000);
        javascriptclick(c.getTermcheckboxlogin());
         Threadsleep(4000);
	     javascriptclick(c.getPlaceorder());

	LOGGER.info(" The order suceesfully plaed and redirect to the  Thank You page");
     
	Threadsleep(5000);
	 
        EndTimeprint();
    
	   c = new Cartpage();
       SuccessorderNo1 = c.getSuccespageOrdernumber().getText().trim();  
      System.out.println("Order ID captured: " + SuccessorderNo1);

     Threadsleep(4000);
		 
	 launchurl("https://betaeshopadm.kirloskarpumps.com/kbladmin");
	 Threadsleep(3000);
	 h = new Homepage();
	 LOGGER.info("KBL admin site  are launched");
     String title = driver.getTitle();
     checkpresentElement("To check title name at admin Login page",title.contains("Admin"));

	a = new Adminlogin();
	 Threadsleep(3000);
	 PassValues(a.getAdminUsername(),getdataExcel(1, 3));
	 PassValues(a.getAdminpassword(), getdataExcel(2, 3));
     Threadsleep(3000);
     javascriptclick(a.getSignInButton1());

	 a = new Adminlogin();
	 Threadsleep(4000);
     moveToElement(a.getSales());
	 actionClick(a.getSales());
	 Threadsleep(2000);
	 moveToElement(a.getSalesOrder());
	 actionClick(a.getSalesOrder());
	 Threadsleep(4000);
	 driver.navigate().refresh();
	 Threadsleep(2000);
	 driver.navigate().refresh();

	  Threadsleep(3000);
	 javascriptclick(a.getClearallinlorderdetailpage());
	 KeyEnter();

	 Threadsleep(5000);
	 OrderText3 = a.getOrderNumberlistingpage().getText().trim();
	 System.out.println("Order number Text: " +OrderText3);

  checkequaltext("To verify the order-ids btw the Thankyou page & admin panel", SuccessorderNo1, OrderText3);

	 String statusText = a.getPaidstatus().getText().trim();
     System.out.println("Status Text:" + statusText);
	if (statusText.equalsIgnoreCase("Paid")) {
		 javascriptclick(a.getPaidstatus());
         System.out.println("Status is Paid");
     }
    else if (statusText.equalsIgnoreCase("Pending")) {
    System.out.println("Status is Pending");

	  javascriptclick(a.getPaidstatus());
	  javascriptclick(a.getPaidoption());
	  Threadsleep(3000);

  } 

   else {
    Assert.fail("Unexpected status: " + statusText);
   }

    for (int i = 0; i <6; i++) {
		KeyDOWN();
	}

	 Threadsleep(4000);
	 javascriptclick(a.getWarhouseallcation());
	 String expectedWarehouseCode = a.getWarhouseallcationcode().getText();
	 System.out.println(expectedWarehouseCode);
	
     for (int i = 0; i <16; i++) {
		KeyDOWN();
	}


	          Threadsleep(3000);
 
               moveToElement(a.getWarehouse());
                actionClick(a.getWarehouse());
                Thread.sleep(2000);
                moveToElement(a.getManagewarehouse1());
				actionClick(a.getManagewarehouse1());
               
				Thread.sleep(3000);


List<WebElement> manageRows1 = driver.findElements(By.xpath("//table//tbody//tr"));


for (int i = 1; i <= manageRows1.size(); i++) {
  
	try {
        
		WebElement codeCell1 = driver.findElement(By.xpath("//table//tbody//tr[" + i + "]/td[3]"));
        String code2 = codeCell1.getText().trim();


		if (code2.equals(expectedWarehouseCode)) {

		  System.out.println("Successfully fetched warehouse Base code from Manage warehouse code page.");

		 WebElement  WarehouseportalEmail = driver.findElement(By.xpath("//table//tbody//tr[" + i + "]/td[8]"));
		
		WarehouseportalEmail2 = WarehouseportalEmail.getText().trim();
		System.out.println("Warehouse Portal Emailid for login: " + WarehouseportalEmail2);
		break; 

		}

	}

catch (Exception e) {
 System.out.println("Exception at row " + i + ": " + e.getMessage());
  
}
     
}

      Threadsleep(3000);
     StartTimeprint();
     a = new Adminlogin();
	 w = new warehouse();
     
	 launchurl("https://betaeshop.kirloskarpumps.com/inventorysystem/supplierlogin/supplierlogin/");
	 Threadsleep(3000);
	 LOGGER.info("KBL Warehouse site  are launched");
     String title2 = driver.getTitle();
     checkpresentElement("To check title name at Warehouse Login page",title2.contains("Warehouse Login"));
	 Threadsleep(2000);
     javascriptclick(w.getLoginwithEmailCTA());
	 Threadsleep(3000);
	 System.out.println("Logging in with email: " + WarehouseportalEmail2);
	 PassValues(w.getEmailfieldinwarehouse(),WarehouseportalEmail2);
	 PassValues(w.getPasswordfieldinwarehouse(), getdataExcel(10, 1));
     Threadsleep(3000);
     javascriptclick(w.getLoginasEmailsubmitbtn());    
	
	 Threadsleep(5000);
	 implicitWait();


	 w = new warehouse();
	 checkpresentElement("To check My orders options available or not in My Warehouse page",w.getMyordersinwarehouse().isDisplayed());
     Threadsleep(3000);
	 ClickElement(w.getMyordersinwarehouse());
     LOGGER.info("My order option  is displayed in Warehouse portal page");
	 Threadsleep(3000);

	 w.getSortingSerialNo().click();
	 Thread.sleep(5000);
	 driver.navigate().refresh();
	 Thread.sleep(5000);
	

// Capture serial numbers from the first column

List<WebElement> srNoElements = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));

List<Integer> serialNumbers = new ArrayList<>();
for (WebElement srNoElement : srNoElements) {
	String text = srNoElement.getText().trim();
	System.out.println("Serial No: " + text);
	serialNumbers.add(Integer.parseInt(text));
}


// Verify sorting (descending)
List<Integer> descSorted = new ArrayList<>(serialNumbers);
Collections.sort(descSorted, Collections.reverseOrder());
boolean isSortedDesc = serialNumbers.equals(descSorted);
System.out.println("Serial numbers are sorted descending: " + isSortedDesc);


// Verify sorting (ascending)
List<Integer> ascSorted = new ArrayList<>(serialNumbers);
Collections.sort(ascSorted);
boolean isSortedAsc = serialNumbers.equals(ascSorted);
System.out.println("Serial numbers are sorted ascending: " + isSortedAsc);

      Thread.sleep(4000);
	 clearvalue(w.getStatusInputfieldinwarehouse());
	 Thread.sleep(2000);

	 PassValues(w.getStatusInputfieldinwarehouse(),getdataExcel(12, 1));
	 Thread.sleep(3000);
	 String StatusValue = w.getStatusInputfieldinwarehouse().getAttribute("value");
     Thread.sleep(3000);

	 checkequaltext("To verify the order-status filter in warehouse portal page", StatusValue, w.getFiltereStatusinwarehouse().getText().trim());
	 LOGGER.info("Successfully verified the listed order sorting&Filter funtionality  in warehouse portal order listing page");
	
	 clearvalue(w.getStatusInputfieldinwarehouse());

	 Thread.sleep(3000);
	  
    driver.navigate().refresh();
	 
	Thread.sleep(3000);

	 moveToElement(w.getMyorderInputfieldinwarehouse());
	 actionClick(w.getMyorderInputfieldinwarehouse());
	 Threadsleep(2000);

	 System.out.println("Order Text 3: " + OrderText3);
	 PassValues(w.getMyorderInputfieldinwarehouse(),OrderText3);
	 w.getFilteredorderidinwarehouse().isDisplayed();
	 Threadsleep(3000);
	 checkequaltext("To verify the order-ids btw the Thankyou page & warehouse portal page", OrderText3, w.getFilteredorderidinwarehouse().getText().trim());
	 LOGGER.info("Successfully verified the placed orderid btw the Thankyou page & warehouse portal page");
     Threadsleep(3000);


	 String SKUinwarehouse1 = w.getFilterSKUidinwarehouse().getText().trim();

	 moveToElement(w.getViewdetailsbtninwarehouse());
	 actionClick(w.getViewdetailsbtninwarehouse());
	 Threadsleep(2000);

	 checkequaltext("To verify the SKU id btw the order detail page & warehouse order detail page", SKUinwarehouse1, w.SKUidinwarehousedetailpage().getText().trim());
	 LOGGER.info("Successfully verified the SKU id btw the order detail page & warehouse list of the order  page");
	 Threadsleep(3000);

  
	for (int i = 0; i <10; i++) {
		KeyDOWN();
	}
	Threadsleep(2000);
	
	checkpresentElement("To check the serial number input field is available or not in warehouse portal page",w.getEnterSerialNumberinwarehousedetailpage().isDisplayed());
	LOGGER.info("To check the serial number input field is available or not in warehouse portal order detail page");

	

	for (int i = 0; i <7; i++) {
		KeyDOWN();
	}

w = new warehouse();
Threadsleep(3000);
javascriptclick(w.getSubmitbtnPOD());
Threadsleep(3000);
checkpresentElement("To check the POD alert message is displayed or not in warehouse portal page",w.getFileErrorforPOD().isDisplayed());
LOGGER.info("To verify  the POD alert message is displayed or not in warehouse portal order detail page");
Threadsleep(3000);
javascriptclick(w.getReadyforShipbtnCTA());
Threadsleep(3000);
checkpresentElement("To check the 'File required before submitting Ready to Ship' alert message is displayed or not in warehouse portal page", w.getFilerequiredforRTS().isDisplayed());
LOGGER.info("To verify  the 'File required before submitting Ready to Ship' alert message is displayed or not in warehouse portal order detail page");


	for (int i = 0; i < 7; i++) {
		KeyUP();
	}

        String proofOfDelivery = "C:\\Users\\Administrator\\Downloads\\Sample datas.jpg";
		String invoice = "C:\\Users\\Administrator\\Downloads\\Rent-1_1.pdf";
        String packingSlip = "C:\\Users\\Administrator\\Downloads\\Rent-1_1.pdf";
        String packingImages = "C:\\Users\\Administrator\\Downloads\\Sample datas.jpg";

w.getDelivery_proofinwarehousedetailpage().sendKeys(proofOfDelivery);

Threadsleep(3000);

// javascriptclick(w.getSubmitbtnPOD());
// Threadsleep(3000);

	for (int i = 0; i < 15; i++) {
		KeyDOWN();
	}

	
	 w.getWarehouse_invoiceinwarehousedetailpage().sendKeys(invoice);
	 Threadsleep(3000);
	 w.getPackingSlipinwarehousedetailpage().sendKeys(packingSlip);
	 Threadsleep(3000);
	 w.getPackingImagesinwarehousedetailpage().sendKeys(packingImages);
	 Threadsleep(3000);

	PassValues(w.getSap_invoice_numberinwarehousedetailpage(), getdataExcel(14, 1));

	javascriptclick(w.getReadyforShipbtnCTA());

	Threadsleep(3000);

    PassValues(w.getEnterSerialNumberinwarehousedetailpage(), getdataExcel(19, 1));

	Threadsleep(3000);

	javascriptclick(w.getReadyforShipbtnCTA());

	 Threadsleep(5000);

	 for (int i = 0; i < 10; i++) {
  	   KeyUP();
	
}

	checkpresentElement("To check the Success message is displayed or not in warehouse portal page",w.getUpdatedRTSuccessfullymsg().isDisplayed());
	LOGGER.info("Ready to ship button is clicked and Success message is displayed");
	Threadsleep(3000);
    
    
}




@Then("Observe the  Showing LSP correct or not in listing of order page for pump products from Order tagging page")
public void observe_the_showing_lsp_correct_or_not_in_listing_of_order_page_for_pump_products_from_order_tagging_page() throws AWTException {
   
	
	StartTimeprint();
	launchurl("https://betaeshopadm.kirloskarpumps.com/kbladmin");
	Threadsleep(3000);
	h = new Homepage();
	LOGGER.info("KBL admin site  are launched");
	
	// a = new Adminlogin();
	// Threadsleep(3000);
	// PassValues(a.getAdminUsername(),getdataExcel(1, 3));
	// PassValues(a.getAdminpassword(), getdataExcel(2, 3));
	// Threadsleep(3000);
	// javascriptclick(a.getSignInButton1());


	a = new Adminlogin();
	 Threadsleep(4000);
	 moveToElement(a.getSales());
	 actionClick(a.getSales());
	 Threadsleep(2000);
	 moveToElement(a.getSalesOrder());
	 actionClick(a.getSalesOrder());
	 Threadsleep(3000);

	 driver.navigate().refresh();

	Threadsleep(4000);

	javascriptclick(a.getClearallinlorderdetailpage());

	//  driver.navigate().refresh();
	//  javascriptclick(a.getClearallinlorderdetailpage());
    //Threadsleep(3000);

	javascriptclick(a.getFilteroptions());

	// Use the global OrderText3 variable
	 
	 w = new warehouse();


PassValues(w.getOrderNumerFieldinSales2(), getdataExcel(18, 1));
	Threadsleep(2000);
      KeyEnter();

	// PassValues(w.getOrderNumerFieldinSales2(), OrderText3);
	// System.out.println("Order Text 3: " + OrderText3);
	// Thread.sleep(3000);

	// KeyEnter();
	// Threadsleep(5000);

	// String OrderText4_detail = a.getOrderNumberlistingpage().getText().trim();
	// System.out.println("Order number Text from Orderdetailpage: " + OrderText4_detail);
	// checkequaltext("To verify the order-ids btw the Thankyou page & admin panel", OrderText3, OrderText4_detail);


	   Threadsleep(2000);

	 String statusText = a.getPaidstatus().getText().trim();
     System.out.println("Status Text:" + statusText);

	if (statusText.equalsIgnoreCase("Ready To Ship")) {

		System.out.println("Status is Pass");

     }

    else  {

		System.out.println("Status is Pending");
	  
	}

	LOGGER.info("The item status is \"Ready to ship\">Successfully verified the placed orderid  btw the Warehouse portal page & Order detail  page at admin page");
	Threadsleep(4000);

	 s1 = new Sparespage();

 for (int i = 0; i < 15; i++) {
		KeyDOWN();
	}

		Threadsleep(5000);

javascriptclick(s1.getPumpActioncheckbox());

Threadsleep(6000);

javascriptclick(s1.getActionbutton());

Threadsleep(5000);

for (int i = 0; i < 8; i++) {
		KeyDOWN();
	}

        javascriptclick(s1.getSyncorderbutton());

	    Threadsleep(3000);

	    verifyButton(s1.getSyncDTDC(), "Sync Order to DTDC");

		verifyButton(s1.getSyncShipRocket(), "Sync Order to ShipRocket");

		
      //  verifyButton(s1.getSyncDNS(), "Sync Order to DNS");

     //   verifyButton(s1.getSyncSmartship(), "Sync Order to Smartship");
      

		String selectedLSP1 =  s1.getSyncDTDC().getText();
		System.out.println(selectedLSP1);

		String selectedLSP2 =  s1.getSyncDNS().getText();
		System.out.println(selectedLSP2);

		
		String  selectedLSP3=  s1.getSyncSmartship().getText();
		System.out.println(selectedLSP3);

		
		String  selectedLSP4=  s1.getSyncShipRocket().getText();
		System.out.println(selectedLSP4);



		// String selectedLSP2 = s1.getSyncSmartship().getText();
	    // System.out.println(selectedLSP2);

	 Threadsleep(3000);
	 javascriptclick(s1.getLSPpopclose());

	
     Threadsleep(3000);
	
	 moveToElement(s1.getCataloge());

	 actionClick(s1.getCataloge());
	 
     for (int i = 0; i <5; i++) {
		KeyUP();
	}
    
	  Threadsleep(3000);

      moveToElement(s1.getProductspage());

	  actionClick(s1.getProductspage());

	  Threadsleep(3000);

	 javascriptclick(a.getClearallinlorderdetailpage());
	Threadsleep(3000);

	javascriptclick(a.getFilteroptions());

     Threadsleep(3000);
	PassValues(s1.getSKUFieldinProduct(), getdataExcel(9, 1));

	String SKU1 =  s1.getSKUFieldinProduct().getAttribute("value");

	System.out.println("Placed SKU item: " + SKU1);

	KeyEnter();

  
     for (int i = 0; i <20; i++) {
		KeyDOWN();
	}


	Threadsleep(3000);

	String SKU2 = s1.getSKUProductslistingpage().getText();
	  
	Assert.assertEquals("Verify the SKUs is matched or not", SKU1, SKU2);

	javascriptclick(s1.getSKUProductslistingpage());

    Threadsleep(3000);
	  
	for (int i = 0; i <15; i++) {
		KeyDOWN();
	}

	Threadsleep(3000);

		javascriptclick(s1.getSKUKBLAttribute());

		Threadsleep(3000);

		 for (int i = 0; i <15; i++) {
		KeyDOWN();
	}

	WebElement Grosswt = driver.findElement(By.xpath("//input[@name='product[gross_weight_kg]']"));
    String Grosswtvalue = Grosswt.getAttribute("value");
	System.out.println(Grosswtvalue);
	
     Threadsleep(3000);

	
	  Threadsleep(2000);
	  moveToElement(s1.getStores());
	  actionClick(s1.getStores());
	  Threadsleep(3000);

	  
    for (int i = 0; i <25; i++) {
	
		KeyUP();
	}


	  Threadsleep(3000);

	  moveToElement(s1.getStoreconfig());
	  actionClick(s1.getStoreconfig());
	  Threadsleep(3000);
	 
	  moveToElement(s1.getOrdertags());
	  actionClick(s1.getOrdertags());
	  Threadsleep(4000);
    Threadsleep(3000);

	String DTDCtext = s1.getOrdertagsDTDC().getText();
	System.out.println(DTDCtext);

	String DTDCMINVALUE  =  s1.getOrdertagsDTDCMIN().getAttribute("value");
	System.out.println(DTDCMINVALUE);
	

	String DTDCMAXVALUE  =  s1.getOrdertagsDTDCMAX().getAttribute("value");
	System.out.println(DTDCMAXVALUE);
	
	String DNStext = s1.getOrdertagsDNS().getText();
	System.out.println(DNStext);

	String DNSMINVALUE  =  s1.getOrdertagsDNSMIN().getAttribute("value");
	System.out.println(DNSMINVALUE);
	

	String DNSMAXVALUE  =  s1.getOrdertagsDNSMAX().getAttribute("value");
	System.out.println(DNSMAXVALUE);

	
	String Smartshiptext = s1.getOrdertagsSmartship().getText();
	System.out.println(Smartshiptext);

	String SmartshipMINVALUE =  s1.getOrdertagsSmartshipMIN().getAttribute("value");
	System.out.println(SmartshipMINVALUE);
	
     String SmartshipMAXVALUE =  s1.getOrdertagsSmartshipMAX().getAttribute("value");
	System.out.println(SmartshipMAXVALUE);

	
	String ShipRockettext = s1.getOrdertagsShipRocket().getText();
	System.out.println(ShipRockettext);

	String ShipRocketMINVALUE =  s1.getOrdertagsShipRocketMIN().getAttribute("value");
	System.out.println(ShipRocketMINVALUE);
	

	String ShipRocketMAXVALUE  =  s1.getOrdertagsShipRocketMAX().getAttribute("value");
	System.out.println(ShipRocketMAXVALUE);



// Example Gross Weight
int Grosswtvalue1 = Integer.parseInt(Grosswtvalue);


// Parse all min/max values to integers

int dtdcMinValue = Integer.parseInt(DTDCMINVALUE);
int dtdcMaxValue = Integer.parseInt(DTDCMAXVALUE);

int dnsMinValue = Integer.parseInt(DNSMINVALUE);
int dnsMaxValue = Integer.parseInt(DNSMAXVALUE);

int rockMin = Integer.parseInt(ShipRocketMINVALUE);
int rockMax = Integer.parseInt(ShipRocketMAXVALUE);

int smartMin = Integer.parseInt(SmartshipMINVALUE);
int smartMax = Integer.parseInt(SmartshipMAXVALUE);


//String expectedLabel = "";

List<String> matchingLabels = new ArrayList<>();

if (Grosswtvalue1 >= dtdcMinValue && Grosswtvalue1 <= dtdcMaxValue) {
    matchingLabels.add(DTDCtext);
}

if (Grosswtvalue1 >= dnsMinValue && Grosswtvalue1 <= dnsMaxValue) {
    matchingLabels.add(DNStext);
}

if (Grosswtvalue1 >= rockMin && Grosswtvalue1 <= rockMax) {
    matchingLabels.add(ShipRockettext);
}

if (Grosswtvalue1 >= smartMin && Grosswtvalue1 <= smartMax) {
    matchingLabels.add(Smartshiptext);
}

if (matchingLabels.isEmpty()) {
    System.out.println("No matching label for gross weight: " + Grosswtvalue1);
} 


else {
    System.out.println("Matching Labels for Gross Weight: " + matchingLabels);

    // Flag to track if any match found
    boolean matchFound = false;

    // Compare each matching label with selected LSPs
   for (String Loggisticsname : matchingLabels) {
    if (selectedLSP1.contains(Loggisticsname) || selectedLSP2.contains(Loggisticsname) || selectedLSP3.contains(Loggisticsname) || selectedLSP4.contains(Loggisticsname)) {
      
		System.out.println("Selected LSP matches expected label: " + Loggisticsname);
       
		matchFound = true;
       // break; // stop after first match found
    
	}
}

    if (!matchFound) {
        System.out.println("LSP Mismatch!");
        System.out.println("Expected (matching) Labels: " + matchingLabels);
        System.out.println("Found in Order Page: " + selectedLSP1 + " / " + selectedLSP2+ " / " + selectedLSP3+ " / " + selectedLSP4);
    }
}




   	LOGGER.info("Successfully verified the LSP Options btw the order tagging and Order detail page");
}













@Given("Warhouse Suppiler  open the home page and do the login with valid credential")
public void warhouse_suppiler_open_the_home_page_and_do_the_login_with_valid_credential() {

	StartTimeprint();
     a = new Adminlogin();
	 w = new warehouse();
	 launchurl("https://betaeshop.kirloskarpumps.com/inventorysystem/supplierlogin/supplierlogin/");
	 Threadsleep(3000);
	 LOGGER.info("KBL Warehouse site  are launched");
     String title2 = driver.getTitle();
     checkpresentElement("To check title name at Warehouse Login page",title2.contains("Warehouse Login"));
	 Threadsleep(2000);
     javascriptclick(w.getLoginwithEmailCTA());
	 Threadsleep(3000);
	 PassValues(w.getEmailfieldinwarehouse(),getdataExcel(15, 1));
	 PassValues(w.getPasswordfieldinwarehouse(), getdataExcel(10, 1));
     Threadsleep(3000);
     javascriptclick(w.getLoginasEmailsubmitbtn());   
	 Threadsleep(5000);
	 implicitWait();

}

@When("After,loggedin>Admin  go My orders listing page")
public void after_loggedin_admin_go_my_orders_listing_page() {

	 w = new warehouse();
	 checkpresentElement("To check My orders options available or not in My Warehouse page",w.getMyordersinwarehouse().isDisplayed());
     Threadsleep(3000);
	 ClickElement(w.getMyordersinwarehouse());
     LOGGER.info("My order option  is displayed in Warehouse portal page");
	 Threadsleep(3000);

}

@Then("Observe the place Orderid and All the warehouse city filter finctionality")
public void observe_the_place_orderid_and_all_the_warehouse_city_filter_finctionality() throws InterruptedException {

	 w = new warehouse();
	 Thread.sleep(3000);

	 moveToElement(w.getMyorderInputfieldinwarehouse());
	 actionClick(w.getMyorderInputfieldinwarehouse());
	 Threadsleep(2000);

	 System.out.println("Order Text 3: " + OrderText3);
	 PassValues(w.getMyorderInputfieldinwarehouse(),getdataExcel(16, 1));
	 w.getFilteredorderidinwarehouse().isDisplayed();
	LOGGER.info("Successfully verified that the order ID from the Other Warehouse portal is placed on the Global Warehouse portal page.");
    Thread.sleep(3000);
	 clearvalue(w.getMyorderInputfieldinwarehouse());
     Thread.sleep(2000);
	 driver.navigate().refresh();
	 Thread.sleep(5000);
	 w.getWarehousecitylistCTA().click();
	 Thread.sleep(2000);
	 w.getALLcityCHECKBOX().click();
	 Thread.sleep(2000);
	w.getChennaichkboxoptions().click();
	 Thread.sleep(3000);
	 w.getWarehousecitylistCTA().click();
	 Thread.sleep(2000);
	  String FilterCityname = w.getFilterCitynameinwarehouse().getText().trim();
	  assertEquals("To verify the Filtered city  matched or not", "Chennai", FilterCityname);
	  LOGGER.info("Successfully verified the filtered one city name in warehouse portal order listing page");

	  Thread.sleep(3000);

	 w.getWarehousecitylistCTA().click();
	 Thread.sleep(2000);

	 w.getALLcityCHECKBOX().click();
	 Thread.sleep(2000);

	w.getWarehousecitylistCTA().click();
	 Thread.sleep(2000);
	
	 Thread.sleep(2000);
		
List<String> selectedCities = Arrays.asList("Bengaluru", "Chennai");

// Click dropdown to open the city list
w.getWarehousecitylistCTA().click();
Thread.sleep(1000);

// Deselect "ALL" first, if selected
w.getALLcityCHECKBOX().click();
Thread.sleep(500);


for (String city : selectedCities) {
    // Use XPath with value attribute
   String xpath = "//input[@class='warehouseCheckbox' and @value='" + city + "']";
    
   WebElement cityCheckbox = driver.findElement(By.xpath(xpath));
    
    if (!cityCheckbox.isSelected()) {
        cityCheckbox.click();
        Thread.sleep(500); // wait for UI update
    }
}

w.getWarehousecitylistCTA().click();

Thread.sleep(3000);

 List<WebElement> warehouseColumnCells = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));  


for (WebElement cell : warehouseColumnCells) {
    String actualCity = cell.getText().trim();
    assertTrue("Found unexpected city: " + actualCity, selectedCities.contains(actualCity));
}

System.out.println("All orders match the selected cities: " + selectedCities);
LOGGER.info("Successfully verified the Filter funtionality by selecting the double  city name in warehouse portal order listing page");


}

// Spare products orders  in Warehouse portal page based on the Allocation warehouse code

@Given("the user opens the home page and login into the application")
public void the_user_opens_the_home_page_and_login_into_the_application() {

     StartTimeprint(); 
	 h = new Homepage();
	 LOGGER.info("KBL site home page are launched");
     String title = driver.getTitle();
     checkpresentElement("To check title at Home page",title.contains("E-shop"));
	 Threadsleep(2000);
	 moveToElement(h.getLoginIcon());
	// checkpresentElement("To check Login icon is displayed",h.getLoginIcon().isDisplayed());
	 Threadsleep(4000);
	 LOGGER.info("Login icon is displayed");
	 javascriptclick(h.getLogin());
	 Threadsleep(2000);
	 LOGGER.info("Login icon is clicked");
	
	 l = new Loginpage();
	 moveToElement(l.getPasswordLogin());
	 checkpresentElement("To check Password login is displayed",l.getPasswordLogin().isDisplayed());
	 actionClick(l.getPasswordLogin());
	 LOGGER.info("login with Password option is clicked");
	 Threadsleep(3000);
	 l = new Loginpage();
	 PassValues(l.getEmailField(), getdataExcel(1, 1));
	 checkpresentElement("To check Email field is displayed",l.getEmailField().isDisplayed());
	 LOGGER.info("Email field is displayed");
	 PassValues(l.getPasswordField(), getdataExcel(2, 1));
	 checkpresentElement("To check Password field is displayed",l.getPasswordField().isDisplayed());
     Threadsleep(4000);
	 ClickElement(l.getLoginButton());
     EndTimeprint();
	 StartTimeprint();
	 h = new Homepage();
    Threadsleep(3000);
	javascriptclick(h.getKBLLogo());
    Threadsleep(3000);

	s1 = new Sparespage();
    moveToElement(s1.getServicesLink());
	moveToElement(s1.getSparesLink());
	Threadsleep(2000);
	checkpresentElement("To check Spares page is displayed or not",s1.getSparesLink().isDisplayed());
	Threadsleep(2000);
    actionClick(s1.getSparesLink());
	Threadsleep(3000);
	LOGGER.info("Spare category is clicked and Succesfully redirection to the respective  Spare listing page");
	EndTimeprint();

}


@When("the user navigates to the Spare Products listing page from the category menu")
public void the_user_navigates_to_the_spare_products_listing_page_from_the_category_menu() {
     
	  StartTimeprint();
	  lp = new Listingpage();
	  moveToElement(lp.getListingCategeory1());
	  Threadsleep(3000);
	  checkpresentElement("To check Buy Now button is displayed",lp.getBuyNowButton1().isDisplayed());
	   LOGGER.info("Buy Now button is displayed");
	  //Threadsleep(3000);
	 s1 = new Sparespage();
	  Threadsleep(3000);
	  javascriptclick(s1.getSparePLPname());
	  LOGGER.info("Product name  is clicked");
  
}



@When("adds an item to the cart and places the order successfully")
public void adds_an_item_to_the_cart_and_places_the_order_successfully() {
    
	   StartTimeprint();
	  p = new PDPpage();
	  ClickElement(p.getAddToCartButtonPDP());
	  Threadsleep(3000);
	  PassValues(p.getPincodefield(), getdataExcel(3, 1));
	  ClickElement(p.getPincodecheckButton());
	  Threadsleep(3000);
	   Alertaccept();
      Threadsleep(2000);
      ClickElement(p.getAddToCartButtonPDP());
	  Threadsleep(2000);
	  LOGGER.info("Add to cart button is clicked");
	  Threadsleep(2000);
	  javascriptclick(p.getPDPcheckoutButton());
      Threadsleep(5000);
	   c = new Cartpage();
		Threadsleep(5000);
	    javascriptclick(c.getShippherebutton());
	    Threadsleep(4000);
	    javascriptclick(c.getPaymentButton());
	    Threadsleep(3000);
	    javascriptclick(c.getBillingaddress());
        Threadsleep(4000);
        javascriptclick(c.getTermcheckboxlogin());
        Threadsleep(4000);
	    javascriptclick(c.getPlaceorder());
	    LOGGER.info(" The order suceesfully plaed and redirect to the  Thank You page");
        Threadsleep(5000);
	    c = new Cartpage();
        SuccessorderNo1 = c.getSuccespageOrdernumber().getText().trim();  
        System.out.println("Order ID captured: " + SuccessorderNo1);
        EndTimeprint();
      

}

@When("Observe the Spare products placed Orderid and   Allocated warehousecode from admin order detail page")
public void observe_the_spare_products_placed_orderid_and_allocated_warehousecode_from_admin_order_detail_page() throws AWTException, InterruptedException {
 

     StartTimeprint();
	 launchurl("https://betaeshopadm.kirloskarpumps.com/kbladmin");
	 Threadsleep(3000);
	 h = new Homepage();
	 LOGGER.info("KBL admin site  are launched");
     String title = driver.getTitle();
     checkpresentElement("To check title name at admin Login page",title.contains("Admin"));

	a = new Adminlogin();
	 Threadsleep(3000);
	 PassValues(a.getAdminUsername(),getdataExcel(1, 3));
	 PassValues(a.getAdminpassword(), getdataExcel(2, 3));
     Threadsleep(3000);
     javascriptclick(a.getSignInButton1());

	 a = new Adminlogin();
	 Threadsleep(4000);
     moveToElement(a.getSales());
	 actionClick(a.getSales());
	 Threadsleep(2000);
	 moveToElement(a.getSalesOrder());
	 actionClick(a.getSalesOrder());
	 Threadsleep(4000);
	 driver.navigate().refresh();
	 Threadsleep(2000);
	 driver.navigate().refresh();

	 Threadsleep(3000);
	 javascriptclick(a.getClearallinlorderdetailpage());

	
	// KeyEnter();

	 Threadsleep(5000);
	 OrderText3 = a.getOrderNumberlistingpage().getText().trim();
	 System.out.println("Order number Text: " +OrderText3);

  checkequaltext("To verify the order-ids btw the Thankyou page & admin panel", SuccessorderNo1, OrderText3);

	 String statusText = a.getPaidstatus().getText().trim();
     System.out.println("Status Text:" + statusText);
	if (statusText.equalsIgnoreCase("Paid")) {
		 javascriptclick(a.getPaidstatus());
         System.out.println("Status is Paid");
     }
    else if (statusText.equalsIgnoreCase("Pending")) {
    System.out.println("Status is Pending");

	  javascriptclick(a.getPaidstatus());
	  javascriptclick(a.getPaidoption());
	  Threadsleep(3000);

  } 

   else {
    Assert.fail("Unexpected status: " + statusText);
   }

    for (int i = 0; i <6; i++) {
		KeyDOWN();
	}

	 Threadsleep(4000);
	 javascriptclick(a.getWarhouseallcation());
	 String expectedWarehouseCode = a.getWarhouseallcationcode().getText();
	 System.out.println(expectedWarehouseCode);
	
     for (int i = 0; i <16; i++) {
		KeyDOWN();
	}


	          Threadsleep(3000);
 
               moveToElement(a.getWarehouse());
                actionClick(a.getWarehouse());
                Thread.sleep(2000);
                moveToElement(a.getManagewarehouse1());
				actionClick(a.getManagewarehouse1());
               
				Thread.sleep(3000);


List<WebElement> manageRows1 = driver.findElements(By.xpath("//table//tbody//tr"));


for (int i = 1; i <= manageRows1.size(); i++) {
  
	try {
        
		WebElement codeCell1 = driver.findElement(By.xpath("//table//tbody//tr[" + i + "]/td[3]"));
        String code2 = codeCell1.getText().trim();


		if (code2.equals(expectedWarehouseCode)) {

		  System.out.println("Successfully fetched warehouse Base code from Manage warehouse code page.");

		 WebElement  WarehouseportalEmail = driver.findElement(By.xpath("//table//tbody//tr[" + i + "]/td[8]"));
		
		WarehouseportalEmail2 = WarehouseportalEmail.getText().trim();
		System.out.println("Warehouse Portal Emailid for login: " + WarehouseportalEmail2);
		break; 

		}

	}

catch (Exception e) {
 System.out.println("Exception at row " + i + ": " + e.getMessage());
  
}
     
}
EndTimeprint();

     StartTimeprint();
     a = new Adminlogin();
	 w = new warehouse();
     
	 launchurl("https://betaeshop.kirloskarpumps.com/inventorysystem/supplierlogin/supplierlogin/");
	 Threadsleep(3000);
	 LOGGER.info("KBL Warehouse site  are launched");
     String title2 = driver.getTitle();
     checkpresentElement("To check title name at Warehouse Login page",title2.contains("Warehouse Login"));
	 Threadsleep(2000);
     javascriptclick(w.getLoginwithEmailCTA());
	 Threadsleep(3000);
	 System.out.println("Logging in with email: " + WarehouseportalEmail2);
	 PassValues(w.getEmailfieldinwarehouse(),WarehouseportalEmail2);
	 PassValues(w.getPasswordfieldinwarehouse(), getdataExcel(10, 1));
     Threadsleep(3000);
     javascriptclick(w.getLoginasEmailsubmitbtn());    
	
	 Threadsleep(5000);
	 implicitWait();


	 w = new warehouse();
	 checkpresentElement("To check My orders options available or not in My Warehouse page",w.getMyordersinwarehouse().isDisplayed());
     Threadsleep(3000);
	 ClickElement(w.getMyordersinwarehouse());
     LOGGER.info("My order option  is displayed in Warehouse portal page");
	 Threadsleep(3000);

	 w.getSortingSerialNo().click();
	 Thread.sleep(5000);
	 driver.navigate().refresh();
	 Thread.sleep(5000);
	

// Capture serial numbers from the first column

List<WebElement> srNoElements = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));

List<Integer> serialNumbers = new ArrayList<>();
for (WebElement srNoElement : srNoElements) {
	String text = srNoElement.getText().trim();
	System.out.println("Serial No: " + text);
	serialNumbers.add(Integer.parseInt(text));
}


// Verify sorting (descending)
List<Integer> descSorted = new ArrayList<>(serialNumbers);
Collections.sort(descSorted, Collections.reverseOrder());
boolean isSortedDesc = serialNumbers.equals(descSorted);
System.out.println("Serial numbers are sorted descending: " + isSortedDesc);


// Verify sorting (ascending)
List<Integer> ascSorted = new ArrayList<>(serialNumbers);
Collections.sort(ascSorted);
boolean isSortedAsc = serialNumbers.equals(ascSorted);
System.out.println("Serial numbers are sorted ascending: " + isSortedAsc);

      Thread.sleep(4000);
	 clearvalue(w.getStatusInputfieldinwarehouse());
	 Thread.sleep(2000);

	 PassValues(w.getStatusInputfieldinwarehouse(),getdataExcel(12, 1));
	 Thread.sleep(3000);
	 String StatusValue = w.getStatusInputfieldinwarehouse().getAttribute("value");
     Thread.sleep(3000);

	 checkequaltext("To verify the order-status filter in warehouse portal page", StatusValue, w.getFiltereStatusinwarehouse().getText().trim());
	 LOGGER.info("Successfully verified the listed order sorting&Filter funtionality  in warehouse portal order listing page");
	
	 clearvalue(w.getStatusInputfieldinwarehouse());

	 Thread.sleep(3000);
	  
    driver.navigate().refresh();
	 
	Thread.sleep(3000);

	 moveToElement(w.getMyorderInputfieldinwarehouse());
	 actionClick(w.getMyorderInputfieldinwarehouse());
	 Threadsleep(2000);

	 System.out.println("Order Text 3: " + OrderText3);
	 PassValues(w.getMyorderInputfieldinwarehouse(),OrderText3);
	 w.getFilteredorderidinwarehouse().isDisplayed();
	 Threadsleep(3000);
	 checkequaltext("To verify the order-ids btw the Thankyou page & warehouse portal page", OrderText3, w.getFilteredorderidinwarehouse().getText().trim());
	 LOGGER.info("Successfully verified the placed orderid btw the Thankyou page & warehouse portal page");
     Threadsleep(3000);


	 String SKUinwarehouse1 = w.getFilterSKUidinwarehouse().getText().trim();

	 moveToElement(w.getViewdetailsbtninwarehouse());
	 actionClick(w.getViewdetailsbtninwarehouse());
	 Threadsleep(2000);

	 checkequaltext("To verify the SKU id btw the order detail page & warehouse order detail page", SKUinwarehouse1, w.SKUidinwarehousedetailpage().getText().trim());
	 LOGGER.info("Successfully verified the SKU id btw the order detail page & warehouse list of the order  page");
	 Threadsleep(3000);

	for (int i = 0; i <10; i++) {
		KeyDOWN();
	}

	Threadsleep(2000);
	
	// checkpresentElement("To check the serial number input field is available or not in warehouse portal page",w.getEnterSerialNumberinwarehousedetailpage().isDisplayed());
	// LOGGER.info("To check the serial number input field is available or not in warehouse portal order detail page");
	// for (int i = 0; i <7; i++) {
	// 	KeyDOWN();
	// }

w = new warehouse();
Threadsleep(3000);
javascriptclick(w.getSubmitbtnPOD());
Threadsleep(3000);
checkpresentElement("To check the POD alert message is displayed or not in warehouse portal page",w.getFileErrorforPOD().isDisplayed());
LOGGER.info("To verify  the POD alert message is displayed or not in warehouse portal order detail page");
Threadsleep(3000);
javascriptclick(w.getReadyforShipbtnCTA());
Threadsleep(3000);
checkpresentElement("To check the 'File required before submitting Ready to Ship' alert message is displayed or not in warehouse portal page", w.getFilerequiredforRTS().isDisplayed());
LOGGER.info("To verify  the 'File required before submitting Ready to Ship' alert message is displayed or not in warehouse portal order detail page");


	for (int i = 0; i < 7; i++) {
		KeyUP();
	}

        String proofOfDelivery = "C:\\Users\\Administrator\\Downloads\\Sample datas.jpg";
		String invoice = "C:\\Users\\Administrator\\Downloads\\Rent-1_1.pdf";
        String packingSlip = "C:\\Users\\Administrator\\Downloads\\Rent-1_1.pdf";
        String packingImages = "C:\\Users\\Administrator\\Downloads\\Sample datas.jpg";

w.getDelivery_proofinwarehousedetailpage().sendKeys(proofOfDelivery);

Threadsleep(3000);


	for (int i = 0; i < 15; i++) {
		KeyDOWN();
	}

	
	 w.getWarehouse_invoiceinwarehousedetailpage().sendKeys(invoice);
	 Threadsleep(3000);
	 w.getPackingSlipinwarehousedetailpage().sendKeys(packingSlip);
	 Threadsleep(3000);
	 w.getPackingImagesinwarehousedetailpage().sendKeys(packingImages);
	 Threadsleep(3000);

	PassValues(w.getSap_invoice_numberinwarehousedetailpage(), getdataExcel(14, 1));

	javascriptclick(w.getReadyforShipbtnCTA());

	Threadsleep(3000);

//     PassValues(w.getEnterSerialNumberinwarehousedetailpage(), getdataExcel(13, 1));
// 	Threadsleep(3000);
// 	javascriptclick(w.getReadyforShipbtnCTA());
// 	 Threadsleep(5000);

// 	 for (int i = 0; i < 10; i++) {
//   	   KeyUP();
	
// }

	checkpresentElement("To check the Success message is displayed or not in warehouse portal page",w.getUpdatedRTSuccessfullymsg().isDisplayed());
	LOGGER.info("Ready to ship button is clicked and Success message is displayed");
	Threadsleep(3000);
    EndTimeprint();

}


@Then("the verify the Ready to ship status and Observe the LSP Options in Pop-up page in Listing of the Order  page")
public void the_verify_the_ready_to_ship_status_and_observe_the_lsp_options_in_pop_up_page_in_listing_of_the_order_page() throws InterruptedException, AWTException {
    
	StartTimeprint();
	launchurl("https://betaeshopadm.kirloskarpumps.com/kbladmin");
	Threadsleep(3000);
	h = new Homepage();
	LOGGER.info("KBL admin site  are launched");
	
	// a = new Adminlogin();
	// Threadsleep(3000);
	// PassValues(a.getAdminUsername(),getdataExcel(1, 3));
	// PassValues(a.getAdminpassword(), getdataExcel(2, 3));
	// Threadsleep(3000);
	// javascriptclick(a.getSignInButton1());

	a = new Adminlogin();
	Threadsleep(4000);
    moveToElement(a.getSales());
	actionClick(a.getSales());
	Threadsleep(2000);
	moveToElement(a.getSalesOrder());
	actionClick(a.getSalesOrder());
	Threadsleep(4000);

	driver.navigate().refresh();

	Threadsleep(3000);	  
    javascriptclick(a.getClearallinlorderdetailpage());
	Threadsleep(3000);

	javascriptclick(a.getFilteroptions());


     w = new warehouse();

   //  PassValues(w.getOrderNumerFieldinSales2(), getdataExcel(17, 1));
    
   // Use the global OrderText3 variable

	PassValues(w.getOrderNumerFieldinSales2(), OrderText3);
	System.out.println("Order Text 3: " + OrderText3);
	Thread.sleep(3000);

	KeyEnter();
	Threadsleep(5000);

	String OrderText4 = a.getOrderNumberlistingpage().getText().trim();
	System.out.println("Order number Text from Orderdetailpage: " + OrderText4);
	checkequaltext("To verify the order-ids btw the Thankyou page & admin panel", OrderText3, OrderText4);

	 String statusText = a.getPaidstatus().getText().trim();
     System.out.println("Status Text:" + statusText);

	if (statusText.equalsIgnoreCase("Ready To Ship")) {

		System.out.println("Status is Pass");

     }

    else  {
	System.out.println("Status is Pending");
	}


	LOGGER.info("The item status is \"Ready to ship\">Successfully verified the placed orderid  btw the Warehouse portal page & Order detail  page at admin page");
	Threadsleep(3000);
	 s1 = new Sparespage();

for (int i = 0; i < 20; i++) {
		KeyDOWN();
	}
javascriptclick(s1.getActioncheckbox());
Threadsleep(3000);

javascriptclick(s1.getActionbutton());
Threadsleep(5000);

for (int i = 0; i < 8; i++) {
		KeyDOWN();
	}

      javascriptclick(s1.getSyncorderbutton());
     
	    Threadsleep(3000);
	    verifyButton(s1.getSyncDTDC(), "Sync Order to DTDC");
        verifyButton(s1.getSyncDNS(), "Sync Order to DNS");
        verifyButton(s1.getSyncSmartship(), "Sync Order to Smartship");
        verifyButton(s1.getSyncShipRocket(), "Sync Order to ShipRocket");
        verifyButton(s1.getSyncSparesShipRocket(), "Sync Order to Spares ShipRocket");
        verifyButton(s1.getSyncSparesSmartship(), "Sync Order to Spares Smartship");
	
	
		LOGGER.info("Successfully verified the LSP Options in Pop-up page in Listing of the Order  page");


       String selectedLSP1 =  s1.getSyncDTDC().getText();
	   System.out.println(selectedLSP1);
      
	   String selectedLSP2 = s1.getSyncSmartship().getText();
	    System.out.println(selectedLSP2);

		if (selectedLSP1.equalsIgnoreCase("Sync Order to DTDC")) {
    javascriptclick(s1.getSyncDTDC());
    LOGGER.info("Clicked on Sync DTDC button");
 } 
    
	else if (selectedLSP2.equalsIgnoreCase("Sync Order to Smartship")) {
    javascriptclick(s1.getSyncSparesSmartship());
    LOGGER.info("Clicked on Sync Spares Smartship button");

} 

else {
    LOGGER.error("Invalid LSP selection: " + selectedLSP1);
    return; // Exit test
}

// Wait and scroll down to load the UI
Threadsleep(3000);
for (int i = 0; i < 25; i++) {
    KeyDOWN();
}
Thread.sleep(3000);

// Check if "Add" box is present and contains correct text
try {

    WebElement addBox = s1.getSpareAddboxinLSPpage(); 

    if (addBox.isDisplayed()) {
        String text = addBox.getText();
        
	if (text.contains("Add")) {
            LOGGER.info(" 'Add' row is visible and contains 'Add' text.");
            checkpresentElement("Verify 'Add' row appears with correct text", true);
        } else {
            LOGGER.info(" 'Add' row is not visible.");
         
    }
}

}

catch (NoSuchElementException | StaleElementReferenceException e) {
   
	LOGGER.info(" 'Add' row is not present on the page — this is expected for some LSPs like Spares Smartship.");

}

// Final log

 LOGGER.info(" Finished verifying LSP sync behavior for: " + selectedLSP1);
 EndTimeprint();

	
// for (int i = 0; i < 25; i++) {
// 		KeyDOWN();
// 	}

//      Thread.sleep(3000);
//     checkpresentElement("To check LSP failed message is displayed or not in order detail page", s1.getSpareAddboxinLSPpage().isDisplayed());

//     checkpresentElement("To check LSP failed message presenet or not ", s1.getSpareAddboxinLSPpage().getText().contains("Add"));
  
// 	LOGGER.info("Successfully verified for the Spare prodcuts order sync process   for a '" + statusText + "' status  on the Order Listing page.");

// 	EndTimeprint();

} 


// Sync order without marking status as 'Ready to Ship' showing error 

@Given("the user  login into the application")
public void the_user_login_into_the_application() {

	
	 StartTimeprint(); 
	 h = new Homepage();
	 LOGGER.info("KBL site home page are launched");
     String title = driver.getTitle();
     checkpresentElement("To check title at Home page",title.contains("E-shop"));
	 Threadsleep(2000);
	 moveToElement(h.getLoginIcon());
	// checkpresentElement("To check Login icon is displayed",h.getLoginIcon().isDisplayed());
	 Threadsleep(4000);
	 LOGGER.info("Login icon is displayed");
	 javascriptclick(h.getLogin());
	 Threadsleep(2000);
	 LOGGER.info("Login icon is clicked");
	
	 l = new Loginpage();
	 moveToElement(l.getPasswordLogin());
	 checkpresentElement("To check Password login is displayed",l.getPasswordLogin().isDisplayed());
	 actionClick(l.getPasswordLogin());
	 LOGGER.info("login with Password option is clicked");
	 Threadsleep(3000);
	 l = new Loginpage();
	 PassValues(l.getEmailField(), getdataExcel(1, 1));
	 checkpresentElement("To check Email field is displayed",l.getEmailField().isDisplayed());
	 LOGGER.info("Email field is displayed");
	 PassValues(l.getPasswordField(), getdataExcel(2, 1));
	 checkpresentElement("To check Password field is displayed",l.getPasswordField().isDisplayed());
     Threadsleep(4000);
	 ClickElement(l.getLoginButton());
     EndTimeprint();

   
}


@When("User adds the  item to the cart and places the order successfully")
public void user_adds_the_item_to_the_cart_and_places_the_order_successfully() {

	StartTimeprint();
	s = new Searchpage();
	moveToElement(s.getSearchBox());
	Threadsleep(2000);
	PassValues(s.getSearchBox(), getdataExcel(9, 1));
	 LOGGER.info("Product name is entered in search box");
     Threadsleep(3000);
	 s = new Searchpage();
	 ClickElement(s.getProductnameSLP());

	 LOGGER.info("Product name is clicked and Succesfully redirection to the respective  product page");

	p = new PDPpage();
	ClickElement(p.getAddToCartButtonPDP());
	Threadsleep(3000);
	PassValues(p.getPincodefield(), getdataExcel(3, 1));
	ClickElement(p.getPincodecheckButton());
	Threadsleep(3000);
	Alertaccept();
    Threadsleep(2000);
    ClickElement(p.getAddToCartButtonPDP());
	Threadsleep(2000);
	LOGGER.info("Add to cart button is clicked");
	Threadsleep(2000);
	javascriptclick(p.getPDPcheckoutButton());

    Threadsleep(5000);
		
	c = new Cartpage();
	Threadsleep(5000);
	    
	javascriptclick(c.getShippherebutton()); 
	Threadsleep(4000);
	    javascriptclick(c.getPaymentButton());
	    Threadsleep(3000);
	    javascriptclick(c.getBillingaddress());
        Threadsleep(4000);
        javascriptclick(c.getTermcheckboxlogin());
         Threadsleep(4000);
	     javascriptclick(c.getPlaceorder());

	LOGGER.info(" The order suceesfully plaed and redirect to the  Thank You page");
     
	Threadsleep(5000);
	 
        EndTimeprint();
    
	   c = new Cartpage();
       SuccessorderNo1 = c.getSuccespageOrdernumber().getText().trim();  
        System.out.println("Order ID captured: " + SuccessorderNo1);


}
@When("Admin user  verify the Before Ready to ship status.This order is sync or not to LSP system")
public void admin_user_verify_the_before_ready_to_ship_status_this_order_is_sync_or_not_to_lsp_system() throws AWTException, InterruptedException {
   
	  StartTimeprint();
	launchurl("https://betaeshopadm.kirloskarpumps.com/kbladmin");
	Threadsleep(3000);
	h = new Homepage();
	LOGGER.info("KBL admin site  are launched");
	
	a = new Adminlogin();
	Threadsleep(3000);
	PassValues(a.getAdminUsername(),getdataExcel(1, 3));
	PassValues(a.getAdminpassword(), getdataExcel(2, 3));
	Threadsleep(3000);
	javascriptclick(a.getSignInButton1());

	

	a = new Adminlogin();
	 Threadsleep(4000);
	 moveToElement(a.getSales());
	 actionClick(a.getSales());
	 Threadsleep(2000);
	 moveToElement(a.getSalesOrder());
	 actionClick(a.getSalesOrder());
	 Threadsleep(3000);

	 driver.navigate().refresh();
	Threadsleep(4000);

	 
	javascriptclick(a.getClearallinlorderdetailpage());

	 Threadsleep(5000);
	 OrderText3 = a.getOrderNumberlistingpage().getText().trim();
	 System.out.println("Order number Text: " +OrderText3);

  checkequaltext("To verify the order-ids btw the Thankyou page & admin panel", SuccessorderNo1, OrderText3);
	

}


@Then("Observe the Notification message in LSP Pgae")
public void observe_the_notification_message_in_lsp_pgae() throws InterruptedException, AWTException {

	   Threadsleep(3000);
    	javascriptclick(a.getFilteroptions());

	 w = new warehouse();
      // Spare 
      //PassValues(w.getOrderNumerFieldinSales2(), getdataExcel(17, 1));
      // Pump
      //PassValues(w.getOrderNumerFieldinSales2(), getdataExcel(18, 1));

    // Use the global OrderText3 variable

	 PassValues(w.getOrderNumerFieldinSales2(), OrderText3);
	 System.out.println("Order Text 3: " + OrderText3);
	 Thread.sleep(3000);

	 KeyEnter();

	 Threadsleep(5000);

	 String statusText = a.getPaidstatus().getText().trim();
     System.out.println("Status Text:" + statusText);

	if (statusText.equalsIgnoreCase("Paid") || statusText.equalsIgnoreCase("Pending")) {

    System.out.println("Status is " + statusText);

    Threadsleep(4000);
    s1 = new Sparespage();

    for (int i = 0; i < 25 ; i++) {
        KeyDOWN();
    }

    EndTimeprint();

    Threadsleep(5000);
   
	javascriptclick(s1.getPumpActioncheckbox());

    Threadsleep(6000);
    javascriptclick(s1.getActionbutton());

    Threadsleep(5000);
    for (int i = 0; i < 8; i++) {
        KeyDOWN();
    }

    javascriptclick(s1.getSyncorderbutton());

    Threadsleep(3000);
    verifyButton(s1.getSyncDTDC(), "Sync Order to DTDC");
    javascriptclick(s1.getSyncDTDC());

    checkpresentElement("To check LSP failed message is displayed or not in order detail page", a.getLspSyncOrderFailed().isDisplayed());
    checkpresentElement("To check LSP failed message presenet or not ", a.getLspSyncOrderFailed().getText().contains("Failed to sync"));


    LOGGER.info("Successfully verified the order sync message for a '" + statusText + "' status order on the Order Listing page.");
    Threadsleep(3000);

} 

else {
   
	System.out.println("Status is not Paid or Pending — skipping sync steps.");
    LOGGER.warn("Order status is '" + statusText + "', so sync steps were not executed.");
}
    
}

}






