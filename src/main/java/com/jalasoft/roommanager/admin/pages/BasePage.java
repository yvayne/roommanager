package com.jalasoft.roommanager.admin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.jalasoft.roommanager.admin.browser.DriverManager;

/**
 * Created by Yuri on 4/10/2017.
 */
public abstract class  BasePage {
    protected WebDriver driver;

    protected WebDriverWait wait;

    /**
     * This builds initialize the AbstractBasePage.
     */
    public BasePage() {
        driver = DriverManager.getInstance().getDriver();
        wait = DriverManager.getInstance().getWait();
        PageFactory.initElements(driver, this);
    }
}