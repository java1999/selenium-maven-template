package com.lazerycode.selenium.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Query {

    private WebDriver driver;
    private By by;
    public Query(By by, WebDriver driver) {
        this.driver = driver;
        this.by = by;
    }
    public WebElement findWebElement() {
        return driver.findElement(by);
    }

}
