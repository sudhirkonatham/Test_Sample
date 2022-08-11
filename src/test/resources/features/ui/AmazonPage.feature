Feature: Amazon login page

  Scenario: User logins to Amazon account
    Given user clicks amazon sign in logo
    And user enters username
    And user clicks continue button
    And user enters password
    And user clicks sign in button

  Scenario: Selects first product from list
    Given user enters "Apple iPhone 13" test in search textbox
    And user clicks on search button
    And user selects first product from list

  Scenario: Search Apple iPhone 13 mobile on amazon page
    And user enters "Apple iPhone 13" test in search textbox
    And user clicks on search button
    And user verifies list result contains "Apple iPhone 13"
    And user selects first product from list
    When user clicks on add to cart button

  Scenario: User cleans shopping cart
    When click on shopping cart


