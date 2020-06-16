package ru.geekbrains.main.site.at.page.content;

import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.jsoup.Connection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.geekbrains.main.site.at.block.Header;
import ru.geekbrains.main.site.at.block.Navigation;
import ru.geekbrains.main.site.at.block.Search;
import ru.geekbrains.main.site.at.condition.Conditions;

public class HomePage extends BasePage {


//    @FindBy(css = "h2[class=\"gb-header__title\"]")
//    private WebElement textNamePage;

//    @FindBy(xpath = "//div[@data-testid=\"promocode-banner-container\"]//..//button[2]")
//    private WebElement popUpButtonClosed;

//    @FindBy(css = "div button svg[class='svg-icon icon-popup-close-button ']")
//    private WebElement buttonPopUpClosed;
//
//    @FindBy(css = "img.gb-top-menu__user-avatar.user-avatar-image")
//    private WebElement userAvatar;

    private Navigation navigation;
    private Header header;


//    private WebDriver driver;
//
//    private WebDriverWait wait10second;
//    private Search search;



    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
//        this.driver.get("https://geekbrains.ru/career");

        this.navigation = new Navigation(driver, this);
        public Navigation get Navigation(){
            return Navigation;
        }
        public Header get Header()
        this.search = new Search(driver);
        this.wait10second = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }


    @Step ("Проверка, что страница отображается")
    public HomePage checkNamePage(String expectedNamePage) {
        wait10second.until(ExpectedConditions.textToBePresentInElement(textNamePage, expectedNamePage));
        return this;
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public Search getSearch() {
        return search;
    }

    public HomePage closedPopUp() {
        this.buttonPopUpClosed.click();
        return this;
    }

    @Step("Проверка того, что авторизовались")
    public HomePage checkAuthorized() {
        wait10second.until(Conditions.exists(this.userAvatar));
        return this;
    }
}
