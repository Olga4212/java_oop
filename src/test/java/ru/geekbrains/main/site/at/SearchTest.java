package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.base.BaseTest;

public class SearchTest extends BaseTest {
//    Перейти на сайт https://geekbrains.ru/courses
//    Нажать на кнопку Поиск
//    В поле Поиск ввести текст: java
//    Проверить что отобразились блоки:
//    Профессии
//            Курсы
//    Вебинары
//            Блоги
//    Форум
//            Тесты
//    Проекты и компании

    @Test
    void events() {
        WebElement buttonSearch = driver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]"));
        buttonSearch.click();
        WebElement inputSearch = driver.findElement(By.cssSelector("[class=\"search-panel__search-field\"]"));
        inputSearch.sendKeys("java");


        WebElement professions = driver.findElement(By.cssSelector("[id=\"professions\"] h2"));
        WebElement courses = driver.findElement(By.xpath(".//header/h2[text()='Курсы']"));
        WebElement events = driver.findElement(By.xpath(".//header/h2[text()='Вебинары']"));
        WebElement blogs = driver.findElement(By.xpath(".//header/h2[text()='Блоги']"));
        WebElement forum = driver.findElement(By.xpath(".//header/h2[text()='Форум']"));
        WebElement tests = driver.findElement(By.xpath(".//header/h2[text()='Тесты']"));
        WebElement projectAndCompany = driver.findElement(By.xpath(".//header/h2[text()='Проекты и компании']"));

        wait10second.until(ExpectedConditions.textToBePresentInElement(professions,"Профессии"));
        wait10second.until(ExpectedConditions.textToBePresentInElement(courses,"Курсы"));
        wait10second.until(ExpectedConditions.textToBePresentInElement(events,"Вебинары"));
        wait10second.until(ExpectedConditions.textToBePresentInElement(blogs,"Блоги"));
        wait10second.until(ExpectedConditions.textToBePresentInElement(forum,"Форум"));
        wait10second.until(ExpectedConditions.textToBePresentInElement(tests,"Тесты"));
        wait10second.until(ExpectedConditions.textToBePresentInElement(projectAndCompany,"Проекты и компании"));

        ///

        WebElement professions_count = driver.findElement(By.cssSelector("a[data-tab=\"professions\"] span"));
        wait10second.until(innerHtmlIsGreater(professions_count, 2));
        WebElement courses_count = driver.findElement(By.cssSelector("a[data-tab=\"courses\"] span"));
        wait10second.until(innerHtmlIsGreater(courses_count, 15));
        WebElement webinars_count = driver.findElement(By.cssSelector("a[data-tab=\"webinars\"] span"));
        wait10second.until(innerHtmlIsGreater(webinars_count, 180));
        wait10second.until(innerHtmlIsLess(webinars_count, 300));
        WebElement blogs_count = driver.findElement(By.cssSelector("a[data-tab=\"blogs\"] span"));
        wait10second.until(innerHtmlIsGreater(blogs_count, 300));

        WebElement forums_count = driver.findElement(By.cssSelector("a[data-tab=\"forums\"] span"));
        wait10second.until(innerHtmlIsNotEquals(forums_count, 350));
        WebElement tests_count = driver.findElement(By.cssSelector("a[data-tab=\"tests\"] span"));
        wait10second.until(innerHtmlIsNotEquals(tests_count, 0));

        WebElement first_webinar = driver.findElement(By.cssSelector("a.event__title"));
        wait10second.until(ExpectedConditions.textToBePresentInElement(first_webinar,"Java Junior. Что нужно знать для успешного собеседования?"));

        wait10second.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.company-items a[href=\"/career/682\"]")));


    }

    public static ExpectedCondition<Boolean> innerHtmlIsGreater(final WebElement element, final int value) {
        return new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                try {
                    String elementText = element.getAttribute("innerHTML");
                    return Integer.parseInt(elementText) > value;
                } catch (StaleElementReferenceException var3) {
                    return null;
                }
            }

            public String toString() {
                return String.format("text of element ('%s') is greater than %d", element, value);
            }
        };
    }

    public static ExpectedCondition<Boolean> innerHtmlIsLess(final WebElement element, final int value) {
        return new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                try {
                    String elementText = element.getAttribute("innerHTML");
                    return Integer.parseInt(elementText) < value;
                } catch (StaleElementReferenceException var3) {
                    return null;
                }
            }

            public String toString() {
                return String.format("text of element ('%s') is less than %d", element, value);
            }
        };
    }



    public static ExpectedCondition<Boolean> innerHtmlIsNotEquals(final WebElement element, final int value) {
        return new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                try {
                    String elementText = element.getAttribute("innerHTML");
                    return Integer.parseInt(elementText) != value;
                } catch (StaleElementReferenceException var3) {
                    return null;
                }
            }

            public String toString() {
                return String.format("text of element ('%s') is not equal than %d", element, value);
            }
        };
    }

}
