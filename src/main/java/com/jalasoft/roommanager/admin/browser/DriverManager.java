package com.jalasoft.roommanager.admin.browser;


import com.utils.ReaderProperty;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

/**
 * Created by Yuri on 4/10/2017.
 */
public class DriverManager {
    private static DriverManager instance;

    private WebDriver driver;

    private WebDriverWait wait;

    private DriverManager() {
        System.setProperty(ReaderProperty.getProperty("chromeBrowser","key"),ReaderProperty.getProperty("chromeBrowser","chromePath"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(new Long(ReaderProperty.getProperty("selenium","implicitWaitTime")), TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, new Long(ReaderProperty.getProperty("selenium","implicitWaitTime")));
    }

    public static DriverManager getInstance() {
        if (instance == null) {
            instance = new DriverManager();
        }
        return instance;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

}
