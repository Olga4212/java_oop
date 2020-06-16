package ru.geekbrains.main.site.at.block;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.page.content.HomePage;

public class Header {
    @FindBy(css = "h2[class=\"gb-header__title\"]")
    private WebElement textNamePage;
    private WebDriver driver;
    public Header (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @Step ("Проверка отображения страницы {expectedNamePage}")
    public HomePage checkNamePage(String expectedNamePage) {
        wait10second.until(ExpectedConditions.textToBePresentInElement(textNamePage, expectedNamePage));
        return this;
    }

}
