$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("logintest.feature");
formatter.feature({
  "line": 1,
  "name": "Login through specific browser",
  "description": "",
  "id": "login-through-specific-browser",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Open target URL in Firefox",
  "description": "",
  "id": "login-through-specific-browser;open-target-url-in-firefox",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "load proerties file",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "open em url in firefox",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter username and pssword",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "successfully landed in home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.load_proerties_file()"
});
formatter.result({
  "duration": 623544803,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.open_em_url_in_firefox()"
});
formatter.result({
  "duration": 18793516561,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.enter_username_and_pssword()"
});
formatter.result({
  "duration": 436032154,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.click_on_login_button()"
});
formatter.result({
  "duration": 4863661250,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.successfully_landed_in_home_page()"
});
formatter.result({
  "duration": 1886915693,
  "status": "passed"
});
});