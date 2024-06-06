$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/91958/eclipse-workspace/NewCucumber/src/test/resources/Facebook/Facebookpro.feature");
formatter.feature({
  "name": "To login facebook application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "to login valid username and valid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To configure the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.to_configure_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch application",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.to_launch_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter valid username on email textbox",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.to_enter_valid_username_on_email_textbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to enter valid password on password textbox",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.to_enter_valid_password_on_password_textbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});