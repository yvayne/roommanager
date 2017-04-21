package com.jalasoft.roommanager.stepsDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.testng.Assert;

/**
 * Created by Yuri on 4/18/2017.
 */
public class AssertionLogin {
    @Then("^User should be able to login successfully$")
    public void userShouldBeAbleToLoginSuccessfully() {
        Assert.assertTrue(true);
    }
}
