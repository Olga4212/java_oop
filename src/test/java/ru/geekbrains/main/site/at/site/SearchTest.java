package ru.geekbrains.main.site.at.site;

import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.page.HomePage;
import ru.geekbrains.main.site.at.site.base.BaseTest;

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
        new HomePage(driver)
                .getSearch()
                .find("java")
                .checkProfessionsText("Профессии")
                .checkCoursesText("Курсы")
                .checkEventsText("Вебинары")
                .checkBlogsText("Блоги")
                .checkForumText("Форум")
                .checkTestsText("Тесты")
                .checkProjectAndCompanyText("Проекты и компании")
                .checkProfessionsCount(2)
                .checkCoursesCount(15)
                .checkWebinarsCount(180, 300)
                .checkBlogsCount(300)
                .checkForumsCountIsNotEqual(350)
                .checkTestsCountIsNotEqual(0)
                .checkFirstWebinarIs("Java Junior. Что нужно знать для успешного собеседования?")
                .checkGeekBrainsCompanyExists();

    }


}
