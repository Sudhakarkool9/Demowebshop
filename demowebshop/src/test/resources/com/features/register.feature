Feature: Testing new tour application

  Scenario: register new user register
    Given open application and click on register link
    When the user enter the details and click register
    Then the system stores the details and automatically log in page

  Scenario: Login to the application
    Given open application and click on Login link
    When the user enters the valid username and valid password and click submit
    Then the system naviagates to HOME page

  Scenario: add card User navigates to home page
    Given User wants to purchase computers click on the computer link
    When the user wants to select anybook and add to cart
    Then the selected book is added to cart
    
    Scenario:to check shippingproduct.
    Given user click on the shipping product system navigating to checkout
    When user click on the checkout system navigating to Billing address.
    Then after enter billing address system navigating to shiiping method.
    
    
  