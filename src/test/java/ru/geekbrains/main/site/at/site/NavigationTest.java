package ru.geekbrains.main.site.at.site;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.main.site.at.block.Navigation.ButtonName;
import ru.geekbrains.main.site.at.page.content.HomePage;
import ru.geekbrains.main.site.at.site.base.BaseTest;

import java.beans.EventSetDescriptor;
import java.util.stream.Stream;

@Feature("Навигация")
@Story("Переход на страницу")
@DisplayName("Проверка Навигации")
public class NavigationTest extends BaseTest {

    public static Stream<ButtonName> stringProviderNotPopUp() {
        return Stream.of(
                ButtonName.EVENTS,
                ButtonName.TOPICS,
                ButtonName.TESTS,
                ButtonName.CAREER
        );
    }

    public static Stream<ButtonName> stringProviderPopUp() {
        return Stream.of(
                ButtonName.POSTS//,
                //ButtonName.COURSES
        );
    }

    @Description("Тесты которые проверяют функционал без Pop-UP")
    @DisplayName("Нажатие на элемент навигации")
    @ParameterizedTest(name = "{index} => Нажатие на: {0}")
    @MethodSource("stringProviderNotPopUp")
    public void checkNavigationNotPopUp(ButtonName button) {
        new HomePage(driver)
                .getNavigation().clickButton(button)
                //.checkNamePage(button.getText())
        ;
    }

    @Description("Тесты которые проверяют функционал Pop-UP")
    @DisplayName("Нажатие на элемент навигации")
    @ParameterizedTest(name = "{index} => Нажатие на: {0}")
    @MethodSource("stringProviderPopUp")
    public void checkNavigationPopUp(ButtonName button) {
        new HomePage(driver)
                .getNavigation().clickButton(button)
                .closedPopUp()
                //.checkNamePage(button.getText())
        ;
    }
}
