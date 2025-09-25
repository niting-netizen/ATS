package org.pages;


import org.base.Ultilityclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Ultilityclass {
	

	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	


@FindBys({
	@FindBy(xpath = "//header//div//ul[@class='groupmenu']//a")
})


private java.util.List<WebElement> groupMenuLinks1;

public java.util.List<WebElement> getGroupMenuLinks1() {
	return groupMenuLinks1;
}

	@FindBys({
		@FindBy(xpath ="//header//div//ul[@class='groupmenu']//a")
	})

	private java.util.List<WebElement> groupMenuLinks;

	public java.util.List<WebElement> getGroupMenuLinks() {
		return groupMenuLinks;
	}



	@FindBy(xpath = "//a[text()='Privacy Policy for Platform']")
    private WebElement Footerink1;


	public WebElement getFooterink1() {
		return Footerink1;
	}

	

	@FindBy(xpath="(//a[@class='menu-link'])[1]")
    private WebElement Categeory1; 

	@FindBy(xpath="(//a[@class='menu-link'])[12]")
   	private WebElement Categeory2;
		
	
    @FindBy(xpath="(//a[@class='menu-link'])[13]")
	private WebElement Categeory3;


	@FindBy(xpath="(//a[@class='menu-link'])[14]")
   	private WebElement Categeory4;

	@FindBy(xpath="(//a[@class='menu-link'])[15]")
   	private WebElement Categeory5;
		
		
	public WebElement getCategeory4() {
		return Categeory4;
	}

	public WebElement getCategeory5() {
		return Categeory5;
	}

	public WebElement getCategeory2() {
		return Categeory2;
	}

	public WebElement getCategeory3() {
		return Categeory3;
	}

	public WebElement getCategeory1() {
		return Categeory1;
	}

	@FindBy(xpath="(//a[@class='menu-link'])[58]")
	private WebElement Categeory58;

    @FindBy(xpath="(//a[@class='menu-link'])[54]")
	private WebElement Categeory54;


	 @FindBy(xpath="(//a[@class='menu-link'])[55]")
	private WebElement Categeory55;

	@FindBy(xpath="(//a[@class='menu-link'])[53]")
	private WebElement Categeory53;


	public WebElement getCategeory58() {
		return Categeory58;
	}

	public WebElement getCategeory54() {
		return Categeory54;
	}

	public WebElement getCategeory55() {
		return Categeory55;
	}

	public WebElement getCategeory53() {
		return Categeory53;
	}

	@FindBy(xpath="(//i[@class='menu-icon img-icon'])[1]")
    private WebElement Trackinglink; 


	public WebElement getTrackinglink() {
		return Trackinglink;
	}



	@FindBy(xpath="//a[@class='header-user']")
    private WebElement LoginImageIcon; 
	
	public WebElement getLoginImageIcon() {
		return LoginImageIcon;
	}

	@FindBy(xpath="//img[@class='main-logo']")
    private WebElement KBLLogo;

	public WebElement getKBLLogo() {
		return KBLLogo;
	} 

	@FindBy(xpath="//div[@class='action toggle switcher-trigger']")
    private WebElement LoginIcon;

     @FindBy(xpath="(//span[text()='My Cart'])[1]")
    private WebElement CartIcon;

	public WebElement getCartIcon() {
		return CartIcon;
	}

	@FindBy(xpath="(//p[@class='b-title h2'])[1]")
    private WebElement Residentialsection;

	public WebElement getResidentialsection() {
		return Residentialsection;
	}

	@FindBy(xpath="(//p[@class='b-title h2'])[2]")
    private WebElement Commercialsection;

	public WebElement getCommercialsection() {
		return Commercialsection;
	}

	@FindBy(xpath="(//p[@class='b-title h2'])[3]")
    private WebElement Industrialsection;

	public WebElement getIndustrialsection() {
		return Industrialsection;
	}

    @FindBy(xpath="//div[@class='testimonial-content container']")
    private WebElement Testimonialsection;

	public WebElement getTestimonialsection() {
		return Testimonialsection;
	}

	@FindBy(xpath="(//p[@class='b-title h2'])[4]")
    private WebElement Agriculturesection;

	public WebElement getAgriculturesection() {
		return Agriculturesection;
	}

	@FindBy(xpath="//input[@name='q']")
    private WebElement SearchBox;

	public WebElement getSearchBox() {
		return SearchBox;
	}

	@FindBy(xpath="//div[@class='link wishlist']")
    private WebElement WishlistLink;

	public WebElement getWishlistLink() {
		return WishlistLink;
	}

	
	@FindBy(xpath="(//a[@class='action create primary'])[1]")
    private WebElement Login;
	
	public WebElement getLogin() {
		return Login;
	}

	public WebElement getLoginIcon() {
		return LoginIcon;
	}
	@FindBy(xpath="//span[normalize-space()='Request for Quote']")
    private WebElement  RequestQuote;

	public WebElement getRequestQuote() {
		return RequestQuote;
	}

	@FindBy(xpath="(//div[@class='owl-next'])[1]")
    private WebElement  HomepageSliderNext;

	public WebElement getHomepageSliderNext() {
		return HomepageSliderNext;
	}

	
	

	
}
