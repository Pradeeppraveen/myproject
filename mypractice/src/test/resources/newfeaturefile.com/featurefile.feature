Feature:To validate  login functionality of new application

  @vijay
  Scenario Outline: To validate  login functionality of salesforce
    Given To navigate in to new website
    When User enter the username "<username>" and password "<password>"
    And click the login button
    Then validate whether user navigate into homepage
    Examples:
      | username | password  |
      | pradeep  | vijay@123 |
      | surya    | vijay123  |

