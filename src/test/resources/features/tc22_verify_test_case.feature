Feature: Verify Test Case
  Scenario: Test Case 22
    Given user opens the browser
    When user navigates to home page
    Then user scrolls to bottom of page
    Then verify RECOMMENDED ITEMS are visible
    And user clicks on Add To Cart on Recommended product
    And user clicks on View Cart button
    And verify that product is displayed in cart page
    Then user close the browser