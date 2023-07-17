Feature: As a user i have be able to add product to cart so that i can see product on cart
  @AddProduct
  Scenario: As a user i can add product to cart
    Given user on dashboard for add product to cart
    When user click logout for add product to cart
    And user on login page for add product to cart
    And user click email field for input
    And user input valid email on field email
    And user click password field for input
    And user input valid password on field
    And user click login button for login
    And user can see homepage and list products
    And user click beli on product
    Then Users can see that the product has been added
