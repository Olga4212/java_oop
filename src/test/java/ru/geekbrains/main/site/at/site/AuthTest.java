package ru.geekbrains.main.site.at.site;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.page.AuthorizationPage;
import ru.geekbrains.main.site.at.site.base.BaseTest;

@DisplayName("Проверка авторизации")
public class AuthTest extends BaseTest {
    @Test
    void testAuth() {
        new AuthorizationPage(driver)
                .login("quant13+gb_tests@gmail.com", "gb_testsPassword999%%%")
                //.checkAuthorized()
        ;
    }


}
