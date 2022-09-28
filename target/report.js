$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/TvValidation.feature");
formatter.feature({
  "name": "Tv Validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Tv"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "Tv validation scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Tv"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "MobileValidationSteps.user_launches_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User handles login",
  "keyword": "And "
});
formatter.match({
  "location": "MobileValidationSteps.user_handles_login()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[text()\u003d\u0027âœ•\u0027]\"}\n  (Session info: headless chrome\u003d105.0.5195.127)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-F4PMV4Q\u0027, ip: \u0027192.168.1.7\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 105.0.5195.127, chrome: {chromedriverVersion: 105.0.5195.52 (412c95e51883..., userDataDir: C:\\Users\\admin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:64814}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: ba8f40eae29848129e520c285792d373\n*** Element info: {Using\u003dxpath, value\u003d//button[text()\u003d\u0027âœ•\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat com.flipkart.stepdefinition.MobileValidationSteps.user_handles_login(MobileValidationSteps.java:46)\r\n\tat ✽.User handles login(src/test/resources/Features/TvValidation.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User search tv",
  "keyword": "When "
});
formatter.match({
  "location": "TvValidationSteps.user_search_tv()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User select the tv and click add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "TvValidationSteps.user_select_the_tv_and_click_add_to_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User doing the payment",
  "keyword": "And "
});
formatter.match({
  "location": "MobileValidationSteps.user_doing_the_payment()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User receive the confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "MobileValidationSteps.user_receive_the_confirmation_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});