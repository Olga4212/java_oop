package ru.geekbrains.main.site.at.page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizationPage {
    private WebDriver driver;

    @FindBy(css = "#user_email")
    private WebElement loginInput;

    @FindBy(css = "#user_password")
    private WebElement passwordInput;

    @FindBy(css = "[data-testid=\"login-submit\"]")
    private WebElement submitButton;

    public AuthorizationPage(WebDriver driver) {
        this.driver = driver;
        driver.get("https://geekbrains.ru/login");
        PageFactory.initElements(driver, this);
    }

    @Step("Логинимся")
    public HomePage login(String login, String password) {
        this.loginInput.sendKeys(login);
        this.passwordInput.sendKeys(password);
        this.submitButton.click();

        return new HomePage(this.driver);
    }
}
