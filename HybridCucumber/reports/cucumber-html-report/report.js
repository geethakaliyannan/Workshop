$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FeaturesFile/Login.feature");
formatter.feature({
  "line": 1,
  "name": "To test the OrangHR Application",
  "description": "",
  "id": "to-test-the-oranghr-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "To validate the Login Functionality",
  "description": "",
  "id": "to-test-the-oranghr-application;to-validate-the-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "To open browser and navigate to the OHRM_url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "To get the title of the page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click submit button",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "to-test-the-oranghr-application;to-validate-the-login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "to-test-the-oranghr-application;to-validate-the-login-functionality;;1"
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 11,
      "id": "to-test-the-oranghr-application;to-validate-the-login-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5790741226,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "To validate the Login Functionality",
  "description": "",
  "id": "to-test-the-oranghr-application;to-validate-the-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "To open browser and navigate to the OHRM_url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "To get the title of the page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Enter \"Admin\" and \"admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_step.to_open_browser_and_navigate_to_the_OHRM_url()"
});
formatter.result({
  "duration": 4751965493,
  "status": "passed"
});
formatter.match({
  "location": "Login_step.to_get_the_title_of_the_page()"
});
formatter.result({
  "duration": 10214066,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 7
    },
    {
      "val": "admin123",
      "offset": 19
    }
  ],
  "location": "Login_step.enter_and(String,String)"
});
formatter.result({
  "duration": 333076742,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d83.0.4103.116)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027VAIDEES-PC\u0027, ip: \u0027192.168.1.11\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\vaidees\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:55607}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: dc021c13e01e643671bf1c6f7f1a616d\n*** Element info: {Using\u003did, value\u003dtxtPassword}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.sendKeys(Unknown Source)\r\n\tat com.Pages.OrangeHRM_Pages.Enterpassword(OrangeHRM_Pages.java:34)\r\n\tat com.StepDefinition.Login_step.enter_and(Login_step.java:38)\r\n\tat ✽.Then Enter \"Admin\" and \"admin123\"(src/test/resources/FeaturesFile/Login.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Login_step.click_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 217473990,
  "status": "passed"
});
});