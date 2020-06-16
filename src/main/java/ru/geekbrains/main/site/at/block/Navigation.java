package ru.geekbrains.main.site.at.block;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.ButtonNotFoundException;
import ru.geekbrains.main.site.at.page.content.HomePage;
@Feature("Навигация")
@Story("Переход на страницу")
@DisplayName("Проверка навигации")

public class Navigation {

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
    private HomePage homePage;

    public Navigation(WebDriver driver, HomePage homePage) {
        this.driver = driver;
        this.homePage = homePage;
        PageFactory.initElements(driver, this);
    }

    @Step("нажатие кнопки '{name}'")
    public HomePage clickButton(ButtonName name) {
        switch (name) {
            case COURSES: {
                buttonCourses.click();
                break;
            }
            case EVENTS: {
                buttonEvents.click();
                break;
            }
            case TOPICS:{
                buttonTopics.click();
                break;
            }

            case POSTS:{
                buttonPosts.click();
                break;
            }

            case TESTS:{
                buttonTests.click();
                break;
            }

            case CAREER:{
                buttonCareer.click();
                break;
            }

        }

        return homePage;
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


