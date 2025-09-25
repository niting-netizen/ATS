package org.pages;

import org.base.Ultilityclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sparespage extends Ultilityclass {
	

	public Sparespage() {
		PageFactory.initElements(driver, this);
	}


     @FindBy(xpath="//input[@id='ordertagging_dtdc_min']")
     private WebElement OrdertagsDTDCMIN;


     
     @FindBy(xpath="//input[@id='ordertagging_dtdc_max']")
     private WebElement OrdertagsDTDCMAX;
    


     @FindBy(xpath="//input[@id='ordertagging_dns_logistics_min']")
     private WebElement OrdertagsDNSMIN;


      @FindBy(xpath="//input[@id='ordertagging_dns_logistics_max']")
     private WebElement OrdertagsDNSMAX;


     @FindBy(xpath="//input[@id='ordertagging_smartship_min']")
    private WebElement OrdertagsSmartshipMIN;


    @FindBy(xpath="//input[@id='ordertagging_smartship_max']")
    private WebElement OrdertagsSmartshipMAX;



     @FindBy(xpath="//input[@id='ordertagging_shiprocket_min']")
    private WebElement OrdertagsShipRocketMIN;

    @FindBy(xpath="//input[@id='ordertagging_shiprocket_max']")
    private WebElement OrdertagsShipRocketMAX;




     public WebElement getOrdertagsDTDCMIN() {
        return OrdertagsDTDCMIN;
    }


    public WebElement getOrdertagsDTDCMAX() {
        return OrdertagsDTDCMAX;
    }


    public WebElement getOrdertagsDNSMIN() {
        return OrdertagsDNSMIN;
    }


    public WebElement getOrdertagsDNSMAX() {
        return OrdertagsDNSMAX;
    }


    public WebElement getOrdertagsSmartshipMIN() {
        return OrdertagsSmartshipMIN;
    }


    public WebElement getOrdertagsSmartshipMAX() {
        return OrdertagsSmartshipMAX;
    }


    public WebElement getOrdertagsShipRocketMIN() {
        return OrdertagsShipRocketMIN;
    }


    public WebElement getOrdertagsShipRocketMAX() {
        return OrdertagsShipRocketMAX;
    }


     @FindBy(xpath="//a[@id='ordertagging_dtdc-head']")
    private WebElement OrdertagsDTDC;

    @FindBy(xpath="//a[@id='ordertagging_dns_logistics-head']")
    private WebElement OrdertagsDNS;


    @FindBy(xpath="//a[@id='ordertagging_smartship-head']")
    private WebElement OrdertagsSmartship;

     @FindBy(xpath="//a[@id='ordertagging_shiprocket-head']")
    private WebElement OrdertagsShipRocket;




    public WebElement getOrdertagsDTDC() {
        return OrdertagsDTDC;
    }


     public WebElement getOrdertagsDNS() {
         return OrdertagsDNS;
     }


     public WebElement getOrdertagsSmartship() {
         return OrdertagsSmartship;
     }


     public WebElement getOrdertagsShipRocket() {
         return OrdertagsShipRocket;
     }




    @FindBy(xpath="(//a[@class='admin__page-nav-link item-nav'])[4]")
    private WebElement Ordertags;


    public WebElement getOrdertags() {
        return Ordertags;
    }
    
      
    @FindBy(xpath="//li[@data-ui-id='menu-magento-config-system-config']")
    private WebElement Storeconfig;
   
    public WebElement getStoreconfig() {
        return Storeconfig;
    }

    @FindBy(xpath="//li[@data-ui-id='menu-magento-backend-stores']")
    private WebElement Stores;
   
    public WebElement getStores() {
        return Stores;
    }






    @FindBy(xpath="//input[@name='product[gross_weight_kg]']")
    private WebElement SKUGrossweight;
    
    @FindBy(xpath="(//div[@class='fieldset-wrapper-title'])[8]")
     private WebElement SKUKBLAttribute;
    
    public WebElement getSKUKBLAttribute() {
    return SKUKBLAttribute;
}


    public WebElement getSKUGrossweight() {
        return SKUGrossweight;
    }



    @FindBy(xpath="(//div[@class='data-grid-cell-content white-space-preserved'])[2]")
     private WebElement SKUProductslistingpage;
    

    public WebElement getSKUProductslistingpage() {
        return SKUProductslistingpage;
    }




    @FindBy(xpath="(//input[@class='admin__control-text'])[9]")
     private WebElement SKUFieldinProduct;

    public WebElement getSKUFieldinProduct() {
        return SKUFieldinProduct;
    }


    @FindBy(xpath="//li[@data-ui-id='menu-magento-catalog-catalog-products']")
    private WebElement  Productspage;

    public WebElement getProductspage() {
        return Productspage;
    }


    @FindBy(xpath="//li[@id='menu-magento-catalog-catalog']")
    private WebElement  Cataloge;

    public WebElement getCataloge() {
        return Cataloge;
    }





    @FindBy(xpath="(//button[@class='action-close'])[2]")
    private WebElement  LSPpopclose;


public WebElement getLSPpopclose() {
        return LSPpopclose;
    }



@FindBy(xpath="//span[normalize-space()='SERVICES']")
    private WebElement  ServicesLink;

public WebElement getServicesLink() {
    return ServicesLink;

}

@FindBy(xpath="//span[normalize-space()='Spares']")
    private WebElement  SparesLink;

public WebElement getSparesLink() {
    return SparesLink;
}


 @FindBy(xpath="(//a[@class='product-item-link'])[2]")
   private WebElement SparePLPname;

public WebElement getSparePLPname() {
    return SparePLPname;
}


 @FindBy(xpath="//table//tr/td[2]")
   private WebElement LSPQtycount;

   @FindBy(xpath="(//table//tr)[2]")
   private WebElement LSPQtylist;

 public WebElement getLSPQtylist() {
    return LSPQtylist;
}

 public WebElement getLSPQtycount() {
    return LSPQtycount;
}


 @FindBy(xpath="//button[@class='addBoxtoRow']")
   private WebElement SpareAddboxinLSPpage;


 public WebElement getSpareAddboxinLSPpage() {
    return SpareAddboxinLSPpage;
}

 @FindBy(xpath="//label[@class='data-grid-checkbox-cell-inner']")
   private WebElement Actioncheckbox;


   @FindBy(xpath="//label[@class='data-grid-checkbox-cell-inner']")
   private WebElement PumpActioncheckbox;

   

public WebElement getPumpActioncheckbox() {
    return PumpActioncheckbox;
}

public WebElement getActioncheckbox() {
    return Actioncheckbox;


}

 @FindBy(xpath="//div[@class='admin__data-grid-header-row']//button[@title='Select Items']")
   private WebElement Actionbutton;

public WebElement getActionbutton() {
    return Actionbutton;
}

 @FindBy(xpath="//div[@class='admin__data-grid-header-row']//span[@class='action-menu-item'][normalize-space()='Sync order to LSP']")
   private WebElement Syncorderbutton;

public WebElement getSyncorderbutton() {
    return Syncorderbutton;
}

@FindBy(xpath="//button[normalize-space()='Sync Order to DTDC']")
   private WebElement SyncDTDC;

public WebElement getSyncDTDC() {
    return SyncDTDC;
}


@FindBy(xpath="//button[normalize-space()='Sync Order to DNS']")
   private WebElement SyncDNS;

public WebElement getSyncDNS() {
    return SyncDNS;
}

@FindBy(xpath="//button[normalize-space()='Sync Order to Smartship']")
   private WebElement SyncSmartship;

public WebElement getSyncSmartship() {
    return SyncSmartship;
}

@FindBy(xpath="//button[normalize-space()='Sync Order to ShipRocket']")
   private WebElement SyncShipRocket;

public WebElement getSyncShipRocket() {
    return SyncShipRocket;
}
@FindBy(xpath="//button[normalize-space()='Sync Order to Spares ShipRocket']")
   private WebElement SyncSparesShipRocket;

public WebElement getSyncSparesShipRocket() {
    return SyncSparesShipRocket;
}

@FindBy(xpath="//button[normalize-space()='Sync Order to Spares Smartship']")
   private WebElement SyncSparesSmartship;

public WebElement getSyncSparesSmartship() {
    return SyncSparesSmartship;
}

}
