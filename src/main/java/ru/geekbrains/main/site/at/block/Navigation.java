package ru.geekbrains.main.site.at.block;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.ButtonNotFoundException;
import ru.geekbrains.main.site.at.page.HomePage;

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

    //@Step("нажатие кнопки '{name}'")
    public HomePage clickButton(String name) {
        switch (name) {
            case "Курсы": {
                buttonCourses.click();
            }
            case "Вебинары": {
                buttonEvents.click();
                break;
            }
            case "Форум": {
                buttonTopics.click();
                break;
            }
            case "Блог": {
                buttonPosts.click();
                break;
            }
            case "Тесты": {
                buttonTests.click();
                break;
            }
            case "Карьера": {
                buttonCareer.click();
                break;
            }
            default: {
                throw new ButtonNotFoundException("Кнопка не найдена! Нет кнопки с именем: " + name);
            }
        }
        return homePage;
    }
}