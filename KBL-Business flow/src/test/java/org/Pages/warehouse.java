package org.pages;

import org.base.Ultilityclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class warehouse extends Ultilityclass {
	
	public warehouse() {
		PageFactory.initElements(driver, this);
	}


 

 

  @FindBy(xpath=" (//input[@class='admin__control-text'])[12]")
     private WebElement OrderNumerFieldinSales2;

    public WebElement getOrderNumerFieldinSales2() {
        return OrderNumerFieldinSales2;

    }

    

    



    
    @FindBy(xpath="(//input[@class='admin__control-text'])[3]")
     private WebElement OrderNumerFieldinWarranty;

    public WebElement getOrderNumerFieldinWarranty() {
        return OrderNumerFieldinWarranty;
    }

      @FindBy(xpath="//input[@class='loginwithotpbtn mobbtn action primary']")
     private WebElement LoginwithEmailCTA;

    public WebElement getLoginwithEmailCTA() {
       return LoginwithEmailCTA;
   }


   @FindBy(xpath="(//input[@class='input-text'])[2]")
     private WebElement Emailfieldinwarehouse;

   public WebElement getEmailfieldinwarehouse() {
       return Emailfieldinwarehouse;
   }

   @FindBy(xpath="(//input[@class='input-text'])[3]")
     private WebElement passwordfieldinwarehouse;

   public WebElement getPasswordfieldinwarehouse() {
       return passwordfieldinwarehouse;
   }




   @FindBy(xpath="//button[@class='loginwithpasswordbtn action login primary']")
     private WebElement LoginasEmailsubmitbtn;

   public WebElement getLoginasEmailsubmitbtn() {
       return LoginasEmailsubmitbtn;
   }



   @FindBy(xpath="(//div[@id='block-collapsible-nav']//ul//li)[3]")
     private WebElement Myordersinwarehouse;


   public WebElement getMyordersinwarehouse() {
       return Myordersinwarehouse;
   }


    @FindBy(xpath="//input[@placeholder='Status']")
    private WebElement StatusInputfieldinwarehouse;

   public WebElement getStatusInputfieldinwarehouse() {
       return StatusInputfieldinwarehouse;
   }


   @FindBy(xpath="//input[@placeholder='SKU']")
    private WebElement SKUInputfieldinwarehouse;

   public WebElement getSKUInputfieldinwarehouse() {
       return SKUInputfieldinwarehouse;
   }

   @FindBy(xpath="//input[@placeholder='Order Id']")
     private WebElement MyorderInputfieldinwarehouse;

      public WebElement getMyorderInputfieldinwarehouse() {
       return MyorderInputfieldinwarehouse;
     }

     @FindBy(xpath="//input[@placeholder='Sr. No']")
     private WebElement SerialNoInputfieldinwarehouse;
     


   public WebElement getSerialNoInputfieldinwarehouse() {
        return SerialNoInputfieldinwarehouse;
    }


   @FindBy(xpath="//table//tbody//tr/td[2]")
     private WebElement Filteredorderidinwarehouse;



    public WebElement getFilteredorderidinwarehouse() {
       return Filteredorderidinwarehouse;
     }


     @FindBy(xpath="(//td[@class='td_right'])[3]")
     private WebElement SKUidinwarehousedetailpage;

      public WebElement SKUidinwarehousedetailpage() {
        return SKUidinwarehousedetailpage;
      }
    

        @FindBy(xpath="//input[@placeholder='Enter Serial Number *']")
     private WebElement EnterSerialNumberinwarehousedetailpage;

      public WebElement getEnterSerialNumberinwarehousedetailpage() {
        return EnterSerialNumberinwarehousedetailpage;
      }


       @FindBy(xpath="//div[text()='Order is successfully updated.']")
     private WebElement UpdatedRTSsuccessfullymsg;

      public WebElement getUpdatedRTSuccessfullymsg() {
        return UpdatedRTSsuccessfullymsg;
      }

      


     @FindBy(xpath="//table//tbody//tr/td[3]")
     private WebElement FilterSKUidinwarehouse;
    
     public WebElement getFilterSKUidinwarehouse() {
       return FilterSKUidinwarehouse;
     }
     

      @FindBy(xpath="//table//tbody//tr/td[5]")
     private WebElement FilterCitynameinwarehouse;

      public WebElement getFilterCitynameinwarehouse() {
       return FilterCitynameinwarehouse;
     }

     

     @FindBy(xpath="//input[@name='warehouse_invoice']")
     private WebElement Warehouse_invoiceinwarehousedetailpage;

      public WebElement getWarehouse_invoiceinwarehousedetailpage() {
          return Warehouse_invoiceinwarehousedetailpage;
      }

      @FindBy(xpath="//input[@name='warehouse_packingslip']")
      private WebElement PackingSlipinwarehousedetailpage;

      public WebElement getPackingSlipinwarehousedetailpage() {
          return PackingSlipinwarehousedetailpage;
      }



      @FindBy(xpath="//input[@name='warehouse_packingslipimages[]']")
      private WebElement PackingImagesinwarehousedetailpage;

      public WebElement getPackingImagesinwarehousedetailpage() {
          return PackingImagesinwarehousedetailpage;
      }


      @FindBy(xpath="//input[@name='sap_invoice_number']")
      private WebElement sap_invoice_numberinwarehousedetailpage;

      public WebElement getSap_invoice_numberinwarehousedetailpage() {
          return sap_invoice_numberinwarehousedetailpage;
      }

      

     @FindBy(xpath="//input[@name='delivery_proof']")
     private WebElement delivery_proofinwarehousedetailpage;

     public WebElement getDelivery_proofinwarehousedetailpage() {
         return delivery_proofinwarehousedetailpage;
     }

     @FindBy(xpath="(//span[@class='dt-column-title'])[1]")
     private WebElement SortingSerialNo;

     public WebElement getSortingSerialNo() {
         return SortingSerialNo;
     }


     @FindBy(xpath="(//button[@type='submit'])[1]")
     private WebElement SubmitbtnPOD;

     public WebElement getSubmitbtnPOD() {
         return SubmitbtnPOD;
     }

     @FindBy(xpath="//div[@id='file-error']")
     private WebElement FileErrorforPOD;

     public WebElement getFileErrorforPOD() {
         return FileErrorforPOD;
     }


     @FindBy(xpath="//label[@id='warehouse_invoice-error']")
     private WebElement FilerequiredforRTS;

     public WebElement getFilerequiredforRTS() {
         return FilerequiredforRTS;
     }

     @FindBy(xpath="//button[@class='accep_btn']")
     private WebElement ReadyforShipbtnCTA;

     public WebElement getReadyforShipbtnCTA() {
         return ReadyforShipbtnCTA;
     }


    @FindBy(xpath="//table//tbody//tr/td[6]")
     private WebElement FiltereStatusinwarehouse;

   public WebElement getFiltereStatusinwarehouse() {
       return FiltereStatusinwarehouse;
   }

      @FindBy(xpath="//table//tbody//tr/td[7]")
     private WebElement viewdetailsbtninwarehouse;

      public WebElement getViewdetailsbtninwarehouse() {
       return viewdetailsbtninwarehouse;
     }

     @FindBy(xpath="//a[@id='filterWarehouseSection']")
     private WebElement WarehousecitylistCTA;

     public WebElement getSKUidinwarehousedetailpage() {
       return SKUidinwarehousedetailpage;
     }

     public WebElement getUpdatedRTSsuccessfullymsg() {
       return UpdatedRTSsuccessfullymsg;
     }

     public WebElement getWarehousecitylistCTA() {
       return WarehousecitylistCTA;
     }



     
     @FindBy(xpath="//input[@class='filterWarehouseAll']")
     private WebElement ALLcityCHECKBOX;

     public WebElement getALLcityCHECKBOX() {
         return ALLcityCHECKBOX;
     }


     @FindBy(xpath="(//input[@class='warehouseCheckbox'])[3]")
     private WebElement Chennaichkboxoptions;

     public WebElement getChennaichkboxoptions() {
         return Chennaichkboxoptions;
     }




     

     

    

}