package ru.geekbrains.main.site.at.page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.BasePage;
import ru.geekbrains.main.site.at.CanOpenUrl;
import ru.geekbrains.main.site.at.page.content.HomePage;

public class AuthorizationPage extends BasePage implements CanOpenUrl {
    @FindBy(css = "#user_email")
    private WebElement loginInput;

    @FindBy(css = "#user_password")
    private WebElement passwordInput;

    @FindBy(css = "[data-testid='login-submit']")
    private WebElement submitButton;

    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }

    @Step("Логинимся")
    public HomePage login(String login, String password) {
        this.loginInput.sendKeys(login);
        this.passwordInput.sendKeys(password);
        this.submitButton.click();

        return new HomePage(this.driver);
    }

    @Override
    public AuthorizationPage openUrl() {
        driver.get("https://geekbrains.ru/login");
        return this;
    }
}
