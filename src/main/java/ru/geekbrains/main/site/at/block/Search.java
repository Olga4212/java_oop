package ru.geekbrains.main.site.at.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.geekbrains.main.site.at.condition.Conditions;

public class Search {

    private final WebDriverWait wait10second;

    @FindBy(css = "#nav [href='/courses']")
    private WebElement buttonCourses;

    @FindBy(css = "#professions h2")
    private WebElement professions;

    @FindBy(xpath = ".//header/h2[text()='Курсы']")
    private WebElement courses;

    @FindBy(xpath = ".//header/h2[text()='Вебинары']")
    private WebElement events;

    @FindBy(xpath = ".//header/h2[text()='Блоги']")
    private WebElement blogs;

    @FindBy(xpath = ".//header/h2[text()='Форум']")
    private WebElement forum;

    @FindBy(xpath = ".//header/h2[text()='Тесты']")
    private WebElement tests;

    @FindBy(xpath = ".//header/h2[text()='Проекты и компании']")
    private WebElement projectAndCompany;

    @FindBy(css = ".show-search-form .svg-icon.icon-search")
    private WebElement buttonSearch;

    @FindBy(css = ".search-panel__search-field")
    private WebElement inputSearch;

    @FindBy(css = "a[data-tab=\"professions\"] span")
    WebElement professions_count;
    @FindBy(css = "a[data-tab=\"courses\"] span")
    WebElement courses_count;
    @FindBy(css = "a[data-tab=\"webinars\"] span")
    WebElement webinars_count;
    @FindBy(css = "a[data-tab=\"blogs\"] span")
    WebElement blogs_count;
    @FindBy(css = "a[data-tab=\"forums\"] span")
    WebElement forums_count;
    @FindBy(css = "a[data-tab=\"tests\"] span")
    WebElement tests_count;
    @FindBy(css = "a.event__title")
    WebElement first_webinar;
    @FindBy(css = "div.company-items a[href=\"/career/682\"]")
    WebElement geekbrains_company;

    private WebDriver driver;

    public Search(WebDriver driver) {
        this.driver = driver;
        this.wait10second = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public Search find(String text) {
        this.buttonSearch.click();
        this.inputSearch.sendKeys(text);
        return this;
    }

    private void checkText(WebElement element, String text) {
        wait10second.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    public Search checkProfessionsText(String text) {
        checkText(this.professions, text);
        return this;
    }

    public Search checkCoursesText(String text) {
        checkText(this.courses, text);
        return this;
    }

    public Search checkEventsText(String text) {
        checkText(this.events, text);
        return this;
    }

    public Search checkBlogsText(String text) {
        checkText(this.blogs, text);
        return this;
    }

    public Search checkForumText(String text) {
        checkText(this.forum, text);
        return this;
    }

    public Search checkTestsText(String text) {
        checkText(this.tests, text);
        return this;
    }

    public Search checkProjectAndCompanyText(String text) {
        checkText(this.projectAndCompany, text);
        return this;
    }

    public Search checkProfessionsCount(int greaterThan) {
        wait10second.until(Conditions.innerHtmlIsGreater(this.professions_count, greaterThan));
        return this;
    }

    public Search checkCoursesCount(int greaterThan) {
        wait10second.until(Conditions.innerHtmlIsGreater(this.courses_count, greaterThan));
        return this;
    }

    public Search checkWebinarsCount(int greaterThan, int lessThan) {
        wait10second.until(Conditions.innerHtmlIsBeetween(this.webinars_count, greaterThan, lessThan));
        return this;
    }

    public Search checkBlogsCount(int greaterThan) {
        wait10second.until(Conditions.innerHtmlIsGreater(this.blogs_count, greaterThan));
        return this;
    }

    public Search checkForumsCountIsNotEqual(int value) {
        wait10second.until(Conditions.innerHtmlIsNotEquals(this.forums_count, value));
        return this;
    }

    public Search checkTestsCountIsNotEqual(int value) {
        wait10second.until(Conditions.innerHtmlIsNotEquals(this.tests_count, value));
        return this;
    }

    public Search checkFirstWebinarIs(String name) {
        wait10second.until(ExpectedConditions.textToBePresentInElement(this.first_webinar, name));
        return this;
    }

    public Search checkGeekBrainsCompanyExists() {
        wait10second.until(Conditions.exists(this.geekbrains_company));
        return this;
    }
}
