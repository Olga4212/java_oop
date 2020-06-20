package ru.geekbrains.main.site.at.site;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.page.AuthorizationPage;
import ru.geekbrains.main.site.at.site.base.BaseTest;

@Feature("Авторизация")
@Story("Проверка авторизации")
@DisplayName("Проверка авторизации")
public class AuthTest extends BaseTest {

    @DisplayName("Проверка валидной авторизации с корректными данными")
    @Test
    void testAuth() {
        new AuthorizationPage(driver)
                .openUrl()
                .login("quant13+gb_tests@gmail.com", "gb_testsPassword999%%%")
                .getHeader()
                    .checkNamePage("Главная")
                    .checkAuthorized();
    }


}
