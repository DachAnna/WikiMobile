package com.annadach.tests;

import com.annadach.pages.SearchPage;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static com.annadach.tests.TestData.successfulValue;
import static com.annadach.tests.TestData.unsuccessfulValue;
import static io.qameta.allure.Allure.step;

public class SearchTests {

    SearchPage searchPage = new SearchPage();
    @Test
    @AllureId("23377")
    @Feature("Поиск")
    @Tags({@Tag("critical"), @Tag("android")})
    @DisplayName("Позитивный поиск")
    void searchWithResultsTest() {

        step("Нажать на поле Поиск и ввести значение", () -> {
            searchPage.openSearchField();
        });
        step(" Ввести значение", () -> {
            searchPage.setValue(successfulValue);
        });
        step("Проверить результаты поиска", () -> {
            searchPage.checkSuccessfulResult();
        });
    }

    @Test
    @AllureId("23378")
    @Feature("Поиск")
    @DisplayName("Негативный поиск")
    void searchWithNoResultsTest() {

        step("Нажать на поле Поиск", () -> {
            searchPage.openSearchField();
        });
        step("Ввести значение", () -> {
            searchPage.setValue(unsuccessfulValue);
        });
        step("Проверить результаты неуспешного поиска", () -> {
            searchPage.checkUnsuccessfulResult();
        });
    }
}
