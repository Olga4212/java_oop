package ru.geekbrains.main.site.at.site;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.page.content.HomePage;
import ru.geekbrains.main.site.at.page.content.SearchPage;
import ru.geekbrains.main.site.at.site.base.BaseTest;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;

@Feature("Тестирование функции поиска")
@DisplayName("Проверка Поиска")
public class SearchTest extends BaseTest {

    @BeforeEach
    void beforeSearchTest() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @DisplayName("Проверка количества контента")
    @Test
    void events() {
        new HomePage(driver)
                .getHeader().searchInSite("java")
                .checkContent(SearchPage.Tab.Professions, greaterThanOrEqualTo(2));

//
//                .checkProfessionsText("Профессии")
//                .checkCoursesText("Курсы")
//                .checkEventsText("Вебинары")
//                .checkBlogsText("Блоги")
//                .checkForumText("Форум")
//                .checkTestsText("Тесты")
//                .checkProjectAndCompanyText("Проекты и компании")
//                .checkProfessionsCount(2)
//                .checkCoursesCount(15)
//                .checkWebinarsCount(180, 300)
//                .checkBlogsCount(300)
//                .checkForumsCountIsNotEqual(350)
//                .checkTestsCountIsNotEqual(0)
//                .checkFirstWebinarIs("Java Junior. Что нужно знать для успешного собеседования?")
//                .checkGeekBrainsCompanyExists();

    }


}
