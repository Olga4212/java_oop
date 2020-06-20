package ru.geekbrains.main.site.at;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WebDriver driver;

    @FindBy(css = "div button svg [class = 'svg-icon icon-popup-close-button']")
    private WebElement buttonPopUpClosed;

    protected final WebDriverWait wait10second;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait10second = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public BasePage closedPopUp() {
        this.buttonPopUpClosed.click();
        return this;
    }
}
