$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("companies.feature");
formatter.feature({
  "line": 1,
  "name": "To test CRM companies feature",
  "description": "",
  "id": "to-test-crm-companies-feature",
  "keyword": "Feature"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on free crm login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Title of the page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters \"meera.anand69@gmail.com\" and \"Dhanush123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User is on home page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_free_crm_login_page()"
});
formatter.result({
  "duration": 8953751767,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_the_page_is_Free_CRM()"
});
formatter.result({
  "duration": 496516329,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "meera.anand69@gmail.com",
      "offset": 13
    },
    {
      "val": "Dhanush123",
      "offset": 43
    }
  ],
  "location": "LoginStepDefinition.user_enters_and(String,String)"
});
formatter.result({
  "duration": 710275845,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 76601415,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 88097,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Navigate to companies  page",
  "description": "",
  "id": "to-test-crm-companies-feature;navigate-to-companies--page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": ": To open companies page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": ": Add new company details",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": ": user click save button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": ": close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "CompaniesStepDefinition.to_open_companies_page()"
});
formatter.result({
  "duration": 1377318420,
  "status": "passed"
});
formatter.match({
  "location": "CompaniesStepDefinition.add_new_company_details()"
});
formatter.result({
  "duration": 2572712756,
  "status": "passed"
});
formatter.match({
  "location": "CompaniesStepDefinition.user_click_save_button()"
});
formatter.result({
  "duration": 2082180591,
  "status": "passed"
});
formatter.match({
  "location": "CompaniesStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 139465723,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on free crm login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Title of the page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters \"meera.anand69@gmail.com\" and \"Dhanush123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User is on home page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_free_crm_login_page()"
});
formatter.result({
  "duration": 5843875008,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_the_page_is_Free_CRM()"
});
formatter.result({
  "duration": 17598397,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "meera.anand69@gmail.com",
      "offset": 13
    },
    {
      "val": "Dhanush123",
      "offset": 43
    }
  ],
  "location": "LoginStepDefinition.user_enters_and(String,String)"
});
formatter.result({
  "duration": 446089487,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 174003501,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 102209,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Back to company  page",
  "description": "",
  "id": "to-test-crm-companies-feature;back-to-company--page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": ": Click Company button",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": ": Click EXPORT button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": ": Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "CompaniesStepDefinition.click_Company_button()"
});
formatter.result({
  "duration": 1171011633,
  "status": "passed"
});
formatter.match({
  "location": "CompaniesStepDefinition.click_EXPORT_button()"
});
formatter.result({
  "duration": 285496365,
  "status": "passed"
});
formatter.match({
  "location": "CompaniesStepDefinition.Close_the_browser()"
});
formatter.result({
  "duration": 86796263,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on free crm login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Title of the page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters \"meera.anand69@gmail.com\" and \"Dhanush123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User is on home page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_free_crm_login_page()"
});
formatter.result({
  "duration": 5491044922,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_the_page_is_Free_CRM()"
});
formatter.result({
  "duration": 20906730,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "meera.anand69@gmail.com",
      "offset": 13
    },
    {
      "val": "Dhanush123",
      "offset": 43
    }
  ],
  "location": "LoginStepDefinition.user_enters_and(String,String)"
});
formatter.result({
  "duration": 673369290,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 125639236,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 81682,
  "status": "passed"
});
});