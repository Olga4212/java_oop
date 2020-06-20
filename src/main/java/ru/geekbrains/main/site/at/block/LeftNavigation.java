package ru.geekbrains.main.site.at.block;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.BasePage;
import ru.geekbrains.main.site.at.ButtonNotFoundException;
import ru.geekbrains.main.site.at.TabNotFoundException;
import ru.geekbrains.main.site.at.page.content.CoursePage;
import ru.geekbrains.main.site.at.page.content.HomePage;
@Feature("Навигация")
@Story("Переход на страницу")
@DisplayName("Проверка навигации")

public class LeftNavigation {

    @FindBy(css = "[id='nav'] [href='/courses']")
    private WebElement buttonCourses;

    @FindBy(css = "[id='nav'] [href='/events']")
    private WebElement buttonEvents;

    @FindBy(css = "[id='nav'] [href='/topics']")
    private WebElement buttonTopics;

    @FindBy(css = "[id='nav'] [href='/posts']")
    private WebElement buttonPosts;

    @FindBy(css = "[id='nav'] [href='/tests']")
    private WebElement buttonTests;

    @FindBy(css = "[id='nav'] [href='/career']")
    private WebElement buttonCareer;

    private WebDriver driver;

    public LeftNavigation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Step("нажатие кнопки '{name}'")
    public BasePage clickButton(ButtonName name) {
        BasePage page = null;

        switch (name) {
            case COURSES: {
                buttonCourses.click();
                return new CoursePage(this.driver);
            }
            case EVENTS: {
                buttonEvents.click();
                // todo необходимо реализовать страницу
                return new HomePage(this.driver);
            }
            case TOPICS:{
                buttonTopics.click();
                // todo необходимо реализовать страницу
                return new HomePage(this.driver);
            }

            case POSTS:{
                buttonPosts.click();
                // todo необходимо реализовать страницу
                return new HomePage(this.driver);
            }

            case TESTS:{
                buttonTests.click();
                // todo необходимо реализовать страницу
                return new HomePage(this.driver);
            }

            case CAREER:{
                buttonCareer.click();
                // todo необходимо реализовать страницу
                return new HomePage(this.driver);
            }

        }
        throw new TabNotFoundException();
    }

    public enum ButtonName {
        COURSES ("Курсы"),
        EVENTS("Вебинары"),
        TOPICS ("Форум"),
        POSTS("Блог"),
        TESTS("Тесты"),
        CAREER("Карьера");

        private String text;
        ButtonName(String text){
            this.text=text;
        }
        public String getText(){
            return text;

        }
    }

}


