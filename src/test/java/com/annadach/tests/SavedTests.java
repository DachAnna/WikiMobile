package com.annadach.tests;

import com.annadach.pages.SavedPages;
import com.annadach.pages.Tab;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class SavedTests extends TestBase {

    SavedPages savedPage = new SavedPages();
    Tab tab = new Tab();

    @Test
    @AllureId("23392")
    @Feature("Страница Сохраненные")
    @Tags({@Tag("critical"), @Tag("android")})
    @DisplayName("Проверка открытия попапа при добавлении нового списка")
    void savedTest() {

        step("Нажать на таб Сохраненные", () -> {
            tab.openSavedTab();
        });
        step("Открыть меню на странице Сохраненные", () -> {
            savedPage.openSavedMenu();
        });
        step("Нажать на Создать новый список", () -> {
            savedPage.tapOptionCreate();
        });
        step("Убедиться, что открылся попап с тайтлом My reading list", () -> {
            savedPage.checkPopUp();
        });
    }
}
