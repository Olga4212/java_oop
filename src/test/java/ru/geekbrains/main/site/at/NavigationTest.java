package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.geekbrains.main.site.at.base.BaseTest;

import java.util.stream.Stream;

public class NavigationTest extends BaseTest {

    static Stream<Arguments> navigationTestParameters() {
        return Stream.of(
                Arguments.of("courses", "Курсы"),
                Arguments.of("events", "Вебинары"),
                Arguments.of("topics", "Форум"),
                Arguments.of("posts", "Блог"),
                Arguments.of("tests", "Тесты"),
                Arguments.of("career", "Карьера")
        );
    }

    @DisplayName("Проверка навигации")
    @ParameterizedTest
    @MethodSource("navigationTestParameters")
    void testNavigation(String path, String title) {
        gotoPage(path);
        checkTitle(title);
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
