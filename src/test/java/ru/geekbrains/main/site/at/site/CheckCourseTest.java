package ru.geekbrains.main.site.at.site;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.block.CoursesNavigation;
import ru.geekbrains.main.site.at.block.LeftNavigation;
import ru.geekbrains.main.site.at.page.content.CoursePage;
import ru.geekbrains.main.site.at.page.content.HomePage;
import ru.geekbrains.main.site.at.page.content.SearchPage;
import ru.geekbrains.main.site.at.site.base.BaseTest;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;

@Feature("Тестирование функции поиска")
@DisplayName("Проверка Поиска")
public class CheckCourseTest extends BaseTest {

    @BeforeEach
    void beforeSearchTest() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @DisplayName("Проверка количества контента")
    @Test
    void events() {
        CoursePage coursePage = (CoursePage) new HomePage(driver)
                .getLeftNavigation().clickButton(LeftNavigation.ButtonName.COURSES);

        coursePage
                .closedPopUp()
                .getCoursesNavigation().clickTab(CoursesNavigation.Tab.Courses);
    }
}
