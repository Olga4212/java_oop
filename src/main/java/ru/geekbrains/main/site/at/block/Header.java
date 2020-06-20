package ru.geekbrains.main.site.at.block;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.BasePage;
import ru.geekbrains.main.site.at.condition.Conditions;
import ru.geekbrains.main.site.at.page.content.SearchPage;

public class Header extends BasePage {
    @FindBy(css = "h2[class=\"gb-header__title\"]")
    private WebElement textNamePage;

    @FindBy(css = "#top-menu .show-search-form svg")
    private WebElement buttonSearch;

    @FindBy(css = "[class='search-panel__search-field']")
    private WebElement inputSearch;

    @FindBy(css = "img.gb-top-menu__user-avatar.user-avatar-image")
    private WebElement userAvatar;


    public Header(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("Проверка отображения страницы {expectedNamePage}")
    public Header checkNamePage(String expectedNamePage) {
        wait10second.until(ExpectedConditions.textToBePresentInElement(textNamePage, expectedNamePage));
        return this;
    }

    @Step("Поиск по сайту по слову {searchText}")
    public SearchPage searchInSite(String searchText) {
        buttonSearch.click();
        inputSearch.sendKeys(searchText);
        return new SearchPage(driver);
    }

    @Step("Проверка того, что авторизовались")
    public Header checkAuthorized() {
        wait10second.until(Conditions.exists(this.userAvatar));
        return this;
    }
}
