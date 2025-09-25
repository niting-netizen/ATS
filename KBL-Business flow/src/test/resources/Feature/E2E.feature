@E2E
Feature: To be Verify the E2E Functionality in KBL website

@Case
Scenario: To  Valiadte the Guser user Flow in home page

Given  User open the Home page
When   When user opening the home page > To verify the header section all the  Elements   
And    User verify the home page  sections is displayed or not
And    To verify the Categeory L1 > L2  sub-categeory  navigation page
Then   Observe the  Footer section links redirections  
 

@Case
Scenario: To  Valiadte the Login functionality with password field 

Given User open the Home page
When  Go the login page and select the login with password page
And   Enter the Email and passwors in repective field
Then  Observe the redirection to the my account page


@Case
Scenario: To  Valiadte the My account page options & redirection in dashboard

Given  User open the Home page
When   do  the login  and Observe the my account page options
Then   User click  the My account options in dashbord and Observe the redirection  page 
 

 
@Case
Scenario Outline: To validate the search field functionality 

Given  User go to the Home page 
When   User Enter the product name in search box "<Product Name1>"
And    Observe the Related products suggestion.then,Click on any product name
And    Observe the Seeall navigation  page "<Product Name2>"
And    Observe the navigation  page using Enter button "<Product Name3>"
Then   Verify the Filter options in SLP page


Examples:
          |Product Name1|    |Product Name2|  |Product Name3|  
          |TL16010016A12211| |Surface pump|   |Submersible Pump| 


@Case 
Scenario: To  Valiadte the listing Buy now functionaity for Guest user

Given User open the Home page 
When  User go to the listing page
And   verify the Buy now  CTA functionality
And   verify the Compare now option in listing page
Then  verify the added compare products in comparision page

@Case  
Scenario: To Validate  the PDP page to Cart Page for Guest  user

Given User open the Home page 
And   On click Buy now CTA or any product cards in listing page
And   Verify the  correct delivery message based on TAT functionality
Then  verify the PDP page features and products prices & do the add to cart.

@Case
Scenario: To Validate  the checkout flow  for login  user

Given user opens the Home page and logs in
When  the user navigates to the listing page
And   clicks the "Buy Now" CTA or any product card on the listing page
And   adds the product to the cart and proceeds to the Cart page
And   verifies the Cart page features and Order summary detail.Then,proceeds to the Checkout page
And   enters the shipping and billing details
And   selects a payment option and places the order
Then  after successful payment, the user should see the Thank You page

@Case8
Scenario Outline: To validate warehouse code   allocation functionality at admin page

Given user opens the Home page and do the login with valid credential
When  User Enter the product name in search box "<Product1>" and the user navigates to the PDP  page via search field 
And   Enter the pincode detail and Add to cart.Then,Go to chekout page
And   Select the  the shipping and billing details and Place the order
And   the user opens the admin login page  
And   the user enters valid login credentials and clicks the Sign In button  
Then   After,loggein admin site>To be verify the Warehouse  allocation code btw the order detail page and Warehouse stock listing page

Examples:
          |Product1|    
          |D41XB00502041033| 
   

@Case9
Scenario: To validate pump product  orders detail in Warehouse portal  and  E-warrnaty page based on the Allocation warehouse code 

Given user opens the Home page and do the login with valid credential 
When  After,loggedin>User need to Place the order successfully
And   Observe the Pump  products placed Orderid and Allocated warehousecode from admin order detail page
Then  To verify the Orderid are sync or not E-warranty page at admin portal
  

@Case10

Scenario: To validate pump products  LSP option btw the Order tagging and order detail page

Given user opens the Home page and do the login with valid credential 
When  User need to Place the order successfully and change the status to ready for Ship
Then  Observe the  Showing LSP correct or not in listing of order page for pump products from Order tagging page


@Case11
Scenario:  To Validate  all the  orders showing or not in   Global warhouse portal page

Given  Warhouse Suppiler  open the home page and do the login with valid credential 
When   After,loggedin>Admin  go My orders listing page
Then   Observe the place Orderid and All the warehouse city filter finctionality


@Case12
Scenario: To validate  Spare products orders  in Warehouse portal page based on the Allocation warehouse code
  
Given the user opens the home page and login into the application
When  the user navigates to the Spare Products listing page from the category menu
And   adds an item to the cart and places the order successfully
And    Observe the Spare products placed Orderid and   Allocated warehousecode from admin order detail page
Then  the verify the Ready to ship status and Observe the LSP Options in Pop-up page in Listing of the Order  page

@Case13
Scenario: To validate  Sync order without marking status as 'Ready to Ship' showing error 
  
Given  the user  login into the application
When   User adds the  item to the cart and places the order successfully
And    Admin user  verify the Before Ready to ship status.This order is sync or not to LSP system
Then   Observe the Notification message in LSP Pgae






 






          


 

 
