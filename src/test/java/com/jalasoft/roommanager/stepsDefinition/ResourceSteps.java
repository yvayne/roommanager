package com.jalasoft.roommanager.stepsDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * Created by Yuri on 4/18/2017.
 */
public class ResourceSteps {
    @Given("^I am login on Admin Page$")
    public void openBrowserStartApplication() {

    }

    @When("^I go to resource page$")
    public void iEnterValidUsernameAndValidPassword() {

    }

    @Given("^I create a new resource with the following information$")
    public void iCreateANewResourceWithTheFollowingInformation(List<Map<String, String>> map) throws Throwable {
        System.out.printf("number :");
        // Write code here that turns the phrase above into concrete actions
    }

   /* @When("^I create a new resource with the following information$")
    public void iEnterValidUsernameAndValidPassword(final Map<String, String> newConfigureMap) {

    }*/
}
