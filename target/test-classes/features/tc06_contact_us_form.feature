@tc06_contact_us
  Feature: contact_us

    Background: launch the browser
      Given user opens the browser
      When user navigates to home page

      Scenario: user_contacts_us
        Given user verifies that home page is visible successfully
        When user clicks on Contact Us button
        Then user verifies GET IN TOUCH is visible
        And user enters name, email, subject and message
        And user uploads file
        And user clicks submit button
        And user clicks OK button
        And user verifies success message Success! Your details have been submitted successfully. is visible
        And user clicks Home button and verify that landed to home page successfully

