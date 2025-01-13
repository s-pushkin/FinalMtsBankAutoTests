package com.mtsbank.desktop;

import com.codeborne.selenide.Selenide;
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
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--disable-gpu");
        options.addArguments("--remote-allow-origins=*");

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
        $("body").shouldBe(visible); // Ждем загрузки страницы
        clickDebetCards();
        checkNameCards();
        takeScreenshot();
    }

    @Step("Клик по разделу дебетовых карт")
    private void clickDebetCards() {
        $("селектор_для_кнопки_дебетовых_карт").shouldBe(visible).click();
    }

    @Step("Проверка названий карт")
    private void checkNameCards() {
        $("селектор_для_названия_карты").shouldHave(text("Название карты"));
    }

    @Attachment(type = "image/png", value = "Screenshot")
    public byte[] takeScreenshot() {
        return Selenide.screenshot(OutputType.BYTES);
    }
}
