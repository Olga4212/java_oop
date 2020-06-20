package ru.geekbrains.main.site.at.page.content;

import io.qameta.allure.Step;
import org.hamcrest.Matcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.at.BasePage;
import ru.geekbrains.main.site.at.TabNotFoundException;

import static org.hamcrest.MatcherAssert.assertThat;

public class SearchPage extends BasePage {

    @FindBy (css=".search-page-tabs .search-page-tabs__item[data-tab='all']")
    private WebElement tabsAll;

    @FindBy (css=".search-page-tabs .search-page-tabs__item[data-tab='professions']")
    private WebElement tabsProfessions;

    @FindBy (css=".search-page-tabs .search-page-tabs__item[data-tab='courses']")
    private WebElement tabsCourses;

    @FindBy (css=".search-page-tabs .search-page-tabs__item[data-tab='webinars']")
    private WebElement tabsWebinars;

    @FindBy (css=".search-page-tabs .search-page-tabs__item[data-tab='blogs']")
    private WebElement tabsBlogs;

    @FindBy (css=".search-page-tabs .search-page-tabs__item[data-tab='forums']")
    private WebElement tabsForums;

    @FindBy (css=".search-page-tabs .search-page-tabs__item[data-tab='tests']")
    private WebElement tabsTests;

    @FindBy (css=".search-page-tabs .search-page-tabs__item[data-tab='companies']")
    private WebElement tabsCompanies;


    public SearchPage (WebDriver driver){
        super(driver);
    }

    @Step("Проверка что в {tab} контент {matcher}")
    public void checkContent(Tab tab, Matcher<Integer> matcher) {
        WebElement tabWebElement = this.getTab(tab);
        String textElement = tabWebElement.findElement(By.cssSelector("span")).getText();
        assertThat(Integer.valueOf(textElement), matcher);
    }

    public void clickButton(Tab tab) {
        this.getTab(tab).click();
    }

    protected WebElement getTab(Tab tab) {
        switch (tab) {
            case All: {
                return this.tabsAll;
            }
            case Professions: {
                return this.tabsProfessions;
            }
            case Courses: {
                return this.tabsCourses;
            }
            case Webinars: {
                return this.tabsWebinars;
            }
            case Blogs: {
                return this.tabsBlogs;
            }
            case Forums: {
                return this.tabsForums;
            }
            case Tests: {
                return this.tabsTests;
            }
            case Companies: {
                return this.tabsCompanies;
            }
        }
        throw new TabNotFoundException();
    }

    public enum Tab {
        All,
        Professions,
        Courses,
        Webinars,
        Blogs,
        Forums,
        Tests,
        Companies
    }

}
