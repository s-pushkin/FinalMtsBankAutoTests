package com.mtsbank.mobile;

import com.codeborne.selenide.WebDriverRunner;
import com.mtsbank.mobile.credit.*;
import com.mtsbank.mobile.creditcard.*;
import com.mtsbank.mobile.debetcards.*;
import com.mtsbank.mobile.loginmtsbank.*;
import com.mtsbank.mobile.vacancy.*;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Map;

@Execution(ExecutionMode.CONCURRENT)
public class AutoTestsMobile {
    private OpenCreditCardsPage openCreditCardsPage = new OpenCreditCardsPage();
    private CheckCreditCardsName checkCreditCardsName = new CheckCreditCardsName();
    private OpenCreditPage openCreditPage = new OpenCreditPage();
    private SetCreditProperties setCreditProperties = new SetCreditProperties();
    private CheckCreditProperties checkCreditProperties = new CheckCreditProperties();
    private OpenVacansiesPageMobile openVacansiesPageMobile = new OpenVacansiesPageMobile();
    private SearchJobsMobile searchJobsMobile = new SearchJobsMobile();
    private CheckVacansiesMobile checkVacansiesMobile = new CheckVacansiesMobile();
    private ClickDebetCardsMobile clickDebetCards = new ClickDebetCardsMobile();
    private CheckNameCardsMobile checkNameCards = new CheckNameCardsMobile();
    private OpenMtsBankPersonalAccount openMtsBankPersonalAccount = new OpenMtsBankPersonalAccount();
    private CheckOpenedPersonalAccount checkOpenedPersonalAccount = new CheckOpenedPersonalAccount();

    @BeforeEach
public void setUp() {
    ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("mobileEmulation", Map.of("deviceName", "iPhone 12 Pro"));
    options.addArguments("--no-sandbox"); // Обязательно для CI
    options.addArguments("--disable-dev-shm-usage"); // Обязательно для CI
    options.addArguments("--headless"); // Запуск в headless-режиме
    System.out.println("Running mobile test with emulation: iPhone 12 Pro");

    WebDriver driver = new ChromeDriver(options);
    WebDriverRunner.setWebDriver(driver);
    driver.get("https://www.mtsbank.ru/");
}

    @AfterEach
    public void tearDown() {
        WebDriverRunner.closeWebDriver();
    }

    @Test
    @Description("Проверка кредитных карт")
    public void checkCreditCards() {
        openCreditCardsPage.openCreditCardsPage();
        checkCreditCardsName.checkNameCards();
    }

    @Test
    @Description("Проверка кредитов")
    public void checkCredit() {
        openCreditPage.openCreditPage();
        setCreditProperties.setCreditProperties();
        checkCreditProperties.checkCreditProperties();
    }

    @Test
    @Description("Проверка вакансий")
    public void checkMtsJobs() {
        openVacansiesPageMobile.openVacansiesPage();
        searchJobsMobile.searchJobs();
        checkVacansiesMobile.checkVacansies();
    }

    @Test
    @Description("Проверка дебетовых карт")
    public void checkDebetCards() {
        clickDebetCards.clickDebetCards();
        checkNameCards.checkNameCards();
    }

    @Test
    @Description("Проверка личного кабинета")
    public void checkPersonalAccount() {
        WebDriver driver = WebDriverRunner.getWebDriver();
        openMtsBankPersonalAccount.openMtsBankPersonalAccount();
        String secondTab = driver.getWindowHandles().toArray()[1].toString();
        driver.switchTo().window(secondTab);
        checkOpenedPersonalAccount.checkOpenedPersonalAccount();
    }
}
