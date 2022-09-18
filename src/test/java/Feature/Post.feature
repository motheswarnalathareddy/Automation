Feature: Post feature of Facebook
  This will test the post functionality at the user wall

  Scenario: Post a message on user wall

    Given User should be logged in and should be present on her wall
    When User type the message in the message box
    And User clicks on Post button
    Then Message should get posted