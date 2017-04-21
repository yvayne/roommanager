package com.jalasoft.roommanager.admin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Yuri on 4/10/2017.
 */
public class LoginPage  extends BasePage {
    public static final String URL_ADMIN_PORTAL = "https://localhost:4040/admin/#/login";
    @FindBy(id = "loginUsername")
    private WebElement usernameTextField;

    @FindBy(id = "loginPassword")
    private WebElement passwordTextField;

    @FindBy(css = "button[type='submit']")
    private WebElement signButton;

    /**
     *
     */
    public LoginPage() {
        driver.get(URL_ADMIN_PORTAL);
    }

    /**
     *
     * @param username
     */
    public void setUserNameTextField(final String username){
        usernameTextField.clear();
        usernameTextField.sendKeys(username);
    }

    /**
     *
     * @param password
     */
    public void setPasswordTextField(final String password){
        passwordTextField.clear();
        passwordTextField.sendKeys(password);
    }

    public HomePage clickSignButton(){
        signButton.click();
        return new HomePage();
    }
}
