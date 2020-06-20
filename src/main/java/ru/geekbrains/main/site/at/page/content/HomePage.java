package ru.geekbrains.main.site.at.page.content;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.main.site.at.BasePage;
import ru.geekbrains.main.site.at.block.Header;
import ru.geekbrains.main.site.at.block.Navigation;

public class HomePage extends BasePage {
    private Navigation navigation;
    private Header header;

    public HomePage(WebDriver driver) {
        super(driver);

        this.navigation = new Navigation(driver, this);
        this.header = new Header(driver);
    }

    public Navigation getNavigation() {
        return this.navigation;
    }

    public Header getHeader() {
        return header;
    }

    @Override
    public HomePage closedPopUp() {
        super.closedPopUp();
        return this;
    }

}






//        this.search = new Search(driver);
//        this.wait10second = new WebDriverWait(driver, 10);
//        PageFactory.initElements(driver, this);
//    }
//
//
//    @Step ("Проверка, что страница отображается")
//    public HomePage checkNamePage(String expectedNamePage) {
//        wait10second.until(ExpectedConditions.textToBePresentInElement(textNamePage, expectedNamePage));
//        return this;
//    }
//
//    public Navigation getNavigation() {
//        return navigation;
//    }
//
//    public Search getSearch() {
//        return search;
//    }
//
//    public HomePage closedPopUp() {
//        this.buttonPopUpClosed.click();
//        return this;
//    }
//
//    @Step("Проверка того, что авторизовались")
//    public HomePage checkAuthorized() {
//        wait10second.until(Conditions.exists(this.userAvatar));
//        return this;
//    }

