package com.mtsbank.desktop;

import com.codeborne.selenide.WebDriverRunner;
import com.mtsbank.desktop.atm24.*;
import com.mtsbank.desktop.contribution.*;
import com.mtsbank.desktop.debetcards.*;
import com.mtsbank.desktop.deposit.*;
import com.mtsbank.desktop.vacancy.*;

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

@Execution(ExecutionMode.CONCURRENT)
public class AutoTestsPc {
    private ClickDebetCards clickDebetCards = new ClickDebetCards();
    private CheckNameCards checkNameCards = new CheckNameCards();

    private OpenBankomatsPage openBankomatsPage = new OpenBankomatsPage();
    private SetBancomatsProperties setBancomatsProperties = new SetBancomatsProperties();
    private CheckWorkTime checkWorkTime = new CheckWorkTime();

    private OpenContributionPage openContributionPage = new OpenContributionPage();
    private SetContributionProperties setContributionProperties = new SetContributionProperties();
    private CheckContributionCalculations checkContributionCalculations = new CheckContributionCalculations();

    private OpenDepositsPage openDepositsPage = new OpenDepositsPage();
    private SetDepositProperties setDepositProperties = new SetDepositProperties();
    private CheckDepositProperties checkDepositProperties = new CheckDepositProperties();

    private OpenVacansiesPage openVacansiesPage = new OpenVacansiesPage();
    private SearchJobs searchJobs = new SearchJobs();
    private CheckVacansies checkVacansies = new CheckVacansies();

    @BeforeEach
public void setUp() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--no-sandbox"); // Обязательно для CI
    options.addArguments("--disable-dev-shm-usage"); // Обязательно для CI
    options.addArguments("--headless"); // Запуск в headless-режиме
    options.addArguments("--window-size=1000,800");
    System.out.println("Running desktop test with window size: 1000x800");

    WebDriver driver = new ChromeDriver(options);
    WebDriverRunner.setWebDriver(driver);
    driver.get("https://www.mtsbank.ru/");
}

    @AfterEach
    public void tearDown() {
        WebDriverRunner.closeWebDriver();
    }

    @Test
    @Description("Проверка дебетовых карт")
    public void checkDebetCards() {
        clickDebetCards();
        checkNameCards();
    }

    @Step("Клик по разделу дебетовых карт")
    private void clickDebetCards() {
        clickDebetCards.clickDebetCards();
    }

    @Step("Проверка названий карт")
    private void checkNameCards() {
        checkNameCards.checkNameCards();
    }

    @Test
    @Description("Проверка банкоматов")
    public void checkBancomats() {
        openBankomatsPage.openBancomatsPage();
        setBancomatsProperties.setBancomatsProperties();
        checkWorkTime.checkWorkTime();
    }

    @Test
    @Description("Проверка вкладов")
    public void checkContribution() {
        openContributionPage.openContributionPage();
        setContributionProperties.setContributionProperties();
        checkContributionCalculations.checkContributionCalculations();
    }

    @Test
    @Description("Проверка депозитов")
    public void checkDeposits() {
        openDepositsPage.openDepositsPage();
        setDepositProperties.setDepositProperties();
        checkDepositProperties.checkDepositProperties();
    }

    @Test
    @Description("Проверка вакансий")
    public void checkMtsJobs() {
        openVacansiesPage.openVacansiesPage();
        searchJobs.searchJobs();
        checkVacansies.checkVacansies();
    }
}
