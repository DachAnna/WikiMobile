package com.annadach.tests;

import com.annadach.pages.AuthPage;
import com.annadach.pages.Tab;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AuthTests extends TestBase {

    AuthPage authPage = new AuthPage();
    Tab tab = new Tab();

    @Test
    @AllureId("23393")
    @Feature("Страница авторизации")
    @Tags({@Tag("critical"), @Tag("android")})
    @DisplayName("Проверка наличия страницы авторизации")
    void checkAuthPage() {

        step("Нажать на таб Еще", () -> {
            tab.openMoreTab();
        });
        step("Кликнуть на Log in / join Wikipedia", () -> {
            authPage.openAuthPage();
        });
        step("Убедиться, что открылась страница авторизации", () -> {
            authPage.checkAuthPage();
        });
    }
}
