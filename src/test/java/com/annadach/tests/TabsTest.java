package com.annadach.tests;

import com.annadach.pages.Tab;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class TabsTest extends TestBase{

    Tab tab = new Tab();
    @Test
    @AllureId("23379")
    @Tags({@Tag("critical"), @Tag("android")})
    @Feature("Табы")
    @DisplayName("Проверка наличия вкладок приложения")
    void checkTabsTest() {
        step("Проверить наличие вкладки Сохраненные", () -> {
            tab.openSavedTab();
            tab.checkSavedTab();
        });
        step("Проверить наличие вкладки Поиск", () -> {
            tab.openSearchTab();
            tab.checkSearchTab();
        });
        step("Проверить наличие вкладки Редактирование", () -> {
            tab.openEditsTab();
            tab.checkEditsTab();
        });
        step("Проверить наличие вкладки Еще", () -> {
            tab.openMoreTab();
            tab.checkMoreTab();
        });
    }
}
