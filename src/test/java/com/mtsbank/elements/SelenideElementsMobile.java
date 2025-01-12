package com.mtsbank.elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

public class SelenideElementsMobile {
    // Страница кредитных карт
    public static SelenideElement creditCardPage = $x("//*[@id=\"__next\"]/div[1]/div[6]/div/div/a[3]");
    // Список кредитных карт
    public static ElementsCollection nameCreditCards = $$("h4.sc-1ed7672a-8");

    // Страница кредитов
    public static SelenideElement creditPage = $x("//*[@id=\"__next\"]/div[1]/div[6]/div/div/a[2]");
    // Страница кредита на машину
    public static SelenideElement motorCreditPage = $x("//*[@id=\"__next\"]/div[4]/div[2]/div[3]/div/div[1]/div[11]/div[2]/a");
    // Сумма кредита
    public static SelenideElement creditSum = $x("//*[@id=\"loanCalc\"]/div[2]/div/div[1]/div[1]/div[1]/div[2]/input");
    // Время кредита 1 год
    public static SelenideElement creditTime = $x("//*[@id=\"1\"]");
    // Сумма ежемесячного платежа
    public static SelenideElement creditSumMonth = $x("//*[@id=\"loanCalc\"]/div[2]/div/div[2]/div[1]/div[1]/hundefined");
    // Открытие ссылок по мтс банку
    public static SelenideElement mtsBankLinks = $x("//*[@id=\"__next\"]/div[1]/footer/div/div[3]/ul/li[1]/label");
    // Открытие странциы с вакансиями
    public static SelenideElement jobsMts = $x("//*[@id=\"__next\"]/div[1]/footer/div/div[3]/ul/li[1]/ul/li[5]/a");

    public static SelenideElement inputJob = $x("//*[@id=\"mainSearch\"]");

    public static ElementsCollection vacancies = $$(".VacanciesResult_vacanciesResult__item__nzlwN");

    //Элементы КАРТЫ на странице
    public static SelenideElement cardsMobile = $x("//*[@id=\"__next\"]/div[1]/div[6]/div/div/a[1]");

    public static ElementsCollection debetCardName = Selenide.$$x("//h4[@font-weight='bold']");

    public static SelenideElement AppMtsBank = $x("//*[@id=\"__next\"]/div[1]/div[6]/div/div/a[9]");
    public static SelenideElement inMtsBank = $x("//*[@id=\"__next\"]/div[4]/div/div[6]/div[2]/div/div/div[2]/a");
}
