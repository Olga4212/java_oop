package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.geekbrains.main.site.at.base.BaseTest;

public class NavigationTest extends BaseTest {

    @Test
    void courses() {
        gotoPage("courses");
        checkTitle("Курсы");
        checkElements();
    }

    @Test
    void events() {
        gotoPage("events");
        checkTitle("Вебинары");
        checkElements();
    }

    @Test
    void topics() {
        gotoPage("topics");
        checkTitle("Форум");
        checkElements();
    }

    @Test
    void posts() {
        gotoPage("posts");
        checkTitle("Блог");
        checkElements();
    }

    @Test
    void tests() {
        gotoPage("tests");
        checkTitle("Тесты");
        checkElements();
    }

    @Test
    void career() {
        gotoPage("career");
        checkTitle("Карьера");
        checkElements();
    }


    private void gotoPage(String path) {
        WebElement buttonEvents = driver.findElement(By.cssSelector("[id='nav'] [href='/" + path + "']"));
        buttonEvents.click();
    }

    private void checkTitle(String excpectedTitle) {
        WebElement textNamePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals(excpectedTitle, textNamePage.getText());
    }

    private void checkElements() {
        try {
            WebElement header = driver.findElement(By.cssSelector("header[id=\"top-menu\"]"));
        } catch (org.openqa.selenium.NoSuchElementException exception) {
            Assertions.fail("Header not found");
        }
        try {
            WebElement footer = driver.findElement(By.cssSelector("footer[class=\"site-footer\"]"));
        } catch (org.openqa.selenium.NoSuchElementException exception) {
            Assertions.fail("Footer not found");
        }
    }

}
