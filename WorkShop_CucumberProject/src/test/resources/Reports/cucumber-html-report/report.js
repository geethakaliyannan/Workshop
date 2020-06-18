$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/TestCases.feature");
formatter.feature({
  "line": 2,
  "name": "OrangeHRM Website",
  "description": "",
  "id": "orangehrm-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@OrangeHRM"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Validate the login Functionality of OrangeHRM Page",
  "description": "",
  "id": "orangehrm-website;validate-the-login-functionality-of-orangehrm-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Open browser and Go to Url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify the title",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the Browser",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "orangehrm-website;validate-the-login-functionality-of-orangehrm-page;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "orangehrm-website;validate-the-login-functionality-of-orangehrm-page;;1"
    },
    {
      "cells": [
        "admin",
        "Admin123"
      ],
      "line": 14,
      "id": "orangehrm-website;validate-the-login-functionality-of-orangehrm-page;;2"
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 15,
      "id": "orangehrm-website;validate-the-login-functionality-of-orangehrm-page;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Validate the login Functionality of OrangeHRM Page",
  "description": "",
  "id": "orangehrm-website;validate-the-login-functionality-of-orangehrm-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@OrangeHRM"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open browser and Go to Url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify the title",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter the \"admin\" and \"Admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHRM_Login_Steps.open_browser_and_Go_to_Url()"
});
formatter.result({
  "duration": 5946065516,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRM_Login_Steps.verify_the_title()"
});
formatter.result({
  "duration": 12786865,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 11
    },
    {
      "val": "Admin123",
      "offset": 23
    }
  ],
  "location": "OrangeHRM_Login_Steps.enter_the_and(String,String)"
});
formatter.result({
  "duration": 470658421,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRM_Login_Steps.click_the_submit_button()"
});
formatter.result({
  "duration": 3824193433,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRM_Login_Steps.close_the_Browser()"
});
formatter.result({
  "duration": 672589537,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Validate the login Functionality of OrangeHRM Page",
  "description": "",
  "id": "orangehrm-website;validate-the-login-functionality-of-orangehrm-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@OrangeHRM"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open browser and Go to Url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify the title",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter the \"Admin\" and \"admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHRM_Login_Steps.open_browser_and_Go_to_Url()"
});
formatter.result({
  "duration": 4502967707,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRM_Login_Steps.verify_the_title()"
});
formatter.result({
  "duration": 8421370,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 11
    },
    {
      "val": "admin123",
      "offset": 23
    }
  ],
  "location": "OrangeHRM_Login_Steps.enter_the_and(String,String)"
});
formatter.result({
  "duration": 364198573,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRM_Login_Steps.click_the_submit_button()"
});
formatter.result({
  "duration": 4549008975,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRM_Login_Steps.close_the_Browser()"
});
formatter.result({
  "duration": 645406115,
  "status": "passed"
});
});