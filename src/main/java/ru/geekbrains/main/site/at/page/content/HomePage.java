package ru.geekbrains.main.site.at.page.content;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.main.site.at.BasePage;
import ru.geekbrains.main.site.at.block.Header;
import ru.geekbrains.main.site.at.block.LeftNavigation;

public class HomePage extends BasePage {
    private LeftNavigation leftNavigation;
    private Header header;

    public HomePage(WebDriver driver) {
        super(driver);

        this.leftNavigation = new LeftNavigation(driver);
        this.header = new Header(driver);
    }

    public LeftNavigation getLeftNavigation() {
        return this.leftNavigation;
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