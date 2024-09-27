Feature: Validate invalid login functionality

    Scenario: verify user cannot login with invalid credentials
      Given user opens the website
      Then verify user is on home page
      When user click on login icon
      Then verify user is on login page
      When user enters the email "userEmail.email"
      And user enters the password "userPassword.password"
      And user click on login button
      Then verify the error message
          |Incorrect email or password.|

      Scenario: verify user can login with valid credential
        Given user opens the website
        Then verify user is on home page
        When user click on login icon
        Then verify user is on login page
        When user enters the email "userEmail.email"
        And user enters the password "userPassword.password"
        And user click on login button
        Then verify user is on home page