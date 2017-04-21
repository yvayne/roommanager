package com.jalasoft.roommanager.stepsDefinition;

import com.jalasoft.roommanager.admin.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


/**
 * Created by Yuri on 4/18/2017.
 */
public class LoginSteps {
    LoginPage login;
    @Given("^Open Browser and start application$")
    public void openBrowserStartApplication() {
        login = new LoginPage();
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^I enter valid username and valid password$")
    public void iEnterValidUsernameAndValidPassword() {
        login.setUserNameTextField("admin");
        login.setPasswordTextField("Control123");
        login.clickSignButton();
    }

}
