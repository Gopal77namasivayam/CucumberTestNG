$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/GOPAL NAMASIVAYAM/Desktop/ecli/CucumberWithTestNG/src/main/java/com/qa/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM Login Page",
  "description": "",
  "id": "freecrm-login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "FreeCRM Login Page scenrios",
  "description": "",
  "id": "freecrm-login-page;freecrm-login-page-scenrios",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user validate loginPage title",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "user enter the loginto the application using valid credentils",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "validate home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "validate login user name text",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_open_the_browser()"
});
formatter.result({
  "duration": 22001415202,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_validate_loginPage_title()"
});
formatter.result({
  "duration": 157883836,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enter_the_loginto_the_application_using_valid_credentils()"
});
formatter.result({
  "duration": 7966597276,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.validate_home_page_title()"
});
formatter.result({
  "duration": 27847931,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.validate_login_user_name_text()"
});
formatter.result({
  "duration": 317185341,
  "status": "passed"
});
formatter.after({
  "duration": 701835243,
  "status": "passed"
});
});