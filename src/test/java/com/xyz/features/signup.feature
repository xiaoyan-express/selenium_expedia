Feature: create free account
  As a new user
  I want register
  So that I can search hotels

  @register
  Scenario Outline: Create a free account
    Given I launch chrome browser
    Then I open "user/createaccount" page
    And I put "<firstname>" and "<lastname>"
    And I put "<username>" and "<password>"
    And I click submit button
    Then I navigate to the "Main" page

    Examples:
     | firstname | lastname | username             | password     |
     | xiaoyan   | zhang    |xyzxiaoyan@gmail.com  | Pa$$w@d      |