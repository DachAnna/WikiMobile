package com.annadach.tests;

import com.annadach.pages.SettingsPage;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static com.annadach.tests.TestData.chosenLanguage;
import static com.annadach.tests.TestData.originalLanguage;
import static io.qameta.allure.Allure.step;

public class SettingsTests extends TestBase{

    @Test
    @AllureId("23380")
    @Tags({@Tag("critical"), @Tag("Mobile-tests")})
    @Feature("Настройки")
    @DisplayName("Добавление языка приложения")
    void changeAppLanguageTest() {

        SettingsPage settingsPage = new SettingsPage();

        step("Перейти в настройки", () -> {
            settingsPage.openMoreTab();
            settingsPage.openSettingTab();
        });
        step("Открыть настройку языка", () -> {
            settingsPage.chooseLanguageSettings();
        });
        step("Нажать на кнопку Добавить язык", () -> {
            settingsPage.addLanguage();
        });
        step("Выбрать язык из списка", () -> {
            settingsPage.chooseLanguage(chosenLanguage);
        });
        step("Убедиться, что язык добавлен в приложение", () -> {
            settingsPage.checkChosenLanguage(originalLanguage, chosenLanguage);
        });
    }
}
