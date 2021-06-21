Feature: expedia test
  As a new user
  I want register
  So that I can search hotels

  @login
  Scenario Outline: Login the expedia page
    Given I launch chrome browser
    Then I open "user/signin" page
    And I put "<username>" and "<password>"
    And I click sign-In button
    Then I navigate to the "Main" page

    Examples:
      | username | password |
      | xyzxiaoyan@gmail.com |   value  |