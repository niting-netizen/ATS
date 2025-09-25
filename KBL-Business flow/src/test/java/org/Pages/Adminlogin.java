package org.pages;

import org.base.Ultilityclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adminlogin extends Ultilityclass {
	
	public Adminlogin() {
		PageFactory.initElements(driver, this);
	}

   

      @FindBy(xpath="//div[@data-ui-id='messages-message-error']")
      private WebElement lspSyncOrderFailed;

      public WebElement getLspSyncOrderFailed() {
          return lspSyncOrderFailed;
      }


        @FindBy(xpath="(//button[@class='action-tertiary action-clear'])[1]")
     private WebElement Clearallinlorderdetailpage;
     
       @FindBy(xpath="(//button[@class='action-default'])[1]")
     private WebElement Filteroptions;

      @FindBy(xpath="(//input[@class='admin__control-text'])[2]")
      private WebElement Pincodefield;


      @FindBy(xpath="//table//tr/td[2]")
      private WebElement codesinWarhousepage;


      @FindBy(xpath="//table//tr/td[6]")
      private WebElement SKUqtysinWarhousepage;

      @FindBy(xpath="//table//tr/td[6]")
      private WebElement   listedcodesqty;


     public WebElement getCodesinWarhousepage() {
          return codesinWarhousepage;
     }

      public WebElement getSKUqtysinWarhousepage() {
           return SKUqtysinWarhousepage;
      }

      public WebElement getListedcodesqty() {
           return listedcodesqty;
      }

      public WebElement getSKUfield() {
           return SKUfield;
      }

     @FindBy(xpath="(//input[@class='admin__control-text'])[6]")
     private WebElement SKUfield;

     
     public WebElement getPincodefield() {
          return Pincodefield;
     }

     public WebElement getFilteroptions() {
          return Filteroptions;
     }

     public WebElement getClearallinlorderdetailpage() {
          return Clearallinlorderdetailpage;
     }

      @FindBy(xpath="//button[@class='action-default scalable paid']")
      private WebElement Paidoption;

     public WebElement getPaidoption() {
          return Paidoption;
     }


     @FindBy(xpath="(//table[@class='admin__table-secondary']//tr//td)[3]")
     private WebElement Warhouseallcationcode;


      @FindBy(xpath=" //a[@title='Allocated Warehouse Info']")
      private WebElement Warhouseallcation;

      @FindBy(xpath="(//input[@class='admin__control-text data-grid-search-control'])[1]")
     private WebElement Adminsearch;


      @FindBy(xpath="(//div[@class='data-grid-cell-content'])[2]")
     private WebElement Orderidinadmin;


      public WebElement getOrderidinadmin() {
          return Orderidinadmin;
     }

      @FindBy(xpath="(//div[@class='data-grid-cell-content'])[9]")
     private WebElement Paidstatus;


      @FindBy(xpath="//button[@class='action-secondary']")
     private WebElement Applyfilter;

      public WebElement getApplyfilter() {
          return Applyfilter;
     }

      public WebElement getManagewarehouseplistwise() {
           return Managewarehouseplistwise;
      }

      @FindBy(xpath="(//div[@class='data-grid-cell-content'])[2]")
     private WebElement OrderNumberlistingpage;
  
     public WebElement getOrderNumberlistingpage() {
          return OrderNumberlistingpage;
     }

       @FindBy(xpath="(//div[@class='data-grid-cell-content'])[4]")
     private WebElement Ewarrantyserialnumber;

     public WebElement getEwarrantyserialnumber() {
          return Ewarrantyserialnumber;
     }

     public WebElement getWarhouseallcation() {
          return Warhouseallcation;
     }

      public WebElement getAdminsearch() {
           return Adminsearch;
      }


      public WebElement getPaidstatus() {
           return Paidstatus;
      }


     @FindBy(xpath="//li[@Class='item-sales-order    level-2']")
     private WebElement SalesOrder;
  
     public WebElement getSalesOrder() {
          return SalesOrder;
     }

      @FindBy(xpath="//li[@class='item-sales  parent  level-0']")
     private WebElement Sales;

      @FindBy(xpath="//li[@id='menu-ambab-core-menu']")
      private WebElement AMbab;


     @FindBy(xpath="//li[@Class='item-iksula-saleswarranty    level-1']")
     private WebElement EwarrantyManage;


     public WebElement getEwarrantyManage() {
               return EwarrantyManage;
     }


     @FindBy(xpath="//li[@id='menu-iksula-sales-warranty']")
     private WebElement Ewarranty;

     public WebElement getEwarranty() {
          return Ewarranty;
      }

      @FindBy(xpath="//li[@id='menu-biztech-inventorysystem-base']")
      private WebElement Warehouse;

      public WebElement getWarehouse() {
          return Warehouse;
     }

      @FindBy(xpath="//li[@Class='item-add-row    level-2']")
      private WebElement AMbabManagepincode;

      @FindBy(xpath="(//table//tbody//tr/td)[15]")
      private WebElement Ambabpdppincode;

        


      
     @FindBy(xpath="//li[@Class='item-iksula-stocklisting-stocklisting    level-1']")
     private WebElement Warehousestocklisting;

      @FindBy(xpath="//li[@Class='item-inventorysystem    level-1']")
     private WebElement Managewarehouse1;

      @FindBy(xpath="//table//tbody//tr")
     private WebElement Managewarehouseplistwise;



     public WebElement getManagewarehouse1() {
          return Managewarehouse1;
     }

     public WebElement getWarehousestocklisting() {
          return Warehousestocklisting;
     }
    

     @FindBy(xpath="(//table//tbody//tr/td)[19]")
     private WebElement Ambaballocationcode;

     public WebElement getAmbabpdppincode() {
          return Ambabpdppincode;
     }

     public WebElement getAmbaballocationcode() {
          return Ambaballocationcode;
     }

     public WebElement getAMbabManagepincode() {
          return AMbabManagepincode;
     }

     public WebElement getAMbab() {
          return AMbab;
     }

     public WebElement getSales() {
          return Sales;
     }


     @FindBy(xpath="(//input[@class='admin__control-text'])[1]")
     private WebElement adminUsername;

    
     @FindBy(xpath="(//input[@class='admin__control-text'])[2]")
     private WebElement Adminpassword;


      @FindBy (xpath="//span[normalize-space()='Sign in']")
     private WebElement SignInButton1;

      public WebElement getSignInButton1() {
          return SignInButton1;
     }

      @FindBy(xpath="//span[normalize-space()='Confirm']")
     private WebElement ConfirmButton1;


     public WebElement getWarhouseallcationcode() {
          return Warhouseallcationcode;
     }


      public WebElement getConfirmButton1() {
           return ConfirmButton1;
      }



     @FindBy(xpath="//button[@class='action-login action-primary']")
     private WebElement ConfirmButton;

     public WebElement getConfirmButton() {
          return ConfirmButton;
     }


     public WebElement getAdminUsername() {
          return adminUsername;
     }


     public WebElement getAdminpassword() {
          return Adminpassword;
     }


     
     

}
