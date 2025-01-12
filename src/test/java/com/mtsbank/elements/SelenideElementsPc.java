package com.mtsbank.elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class SelenideElementsPc {
    //Элементы КАРТЫ на странице
    public static SelenideElement cards = $x("//*[@id=\"__next\"]/div[1]/nav/div[1]/div[1]/div[1]/a[1]");
    //Элемент ДЕБЕТОВЫЕ КАРТЫ на странице

    public static SelenideElement debetCards = $x("//*[@id=\"__next\"]/div[4]/div[4]/div/div[1]/div/a[3]/div");
    // Выбор города
    public static SelenideElement setTown = $x("//*[@id=\"__next\"]/div[1]/div[1]/div/div/button[1]/div");
    // Открытие страницы с банкоматами
    public static SelenideElement clickBancomats = $x("//*[@id=\"top\"]/div[1]/a");
    // Открытие банкоматов списком
    public static SelenideElement setList = $x("//*[@id=\"__next\"]" +
            "/div[4]/div[2]/div/div/div[3]/div[1]/div/button[2]/div");

    //Открытие фильтров банкоматов
    public static SelenideElement openFilters = $x("//*[@id=\"__next\"]/div[4]/div[2]/div/div/div[1]/button/div");
    // Отключение фильтра РАБОТАЕТ СЕЙЧАС
    public static SelenideElement offWorkNow = $x("//*[@id=\"change_region_modal\"]/div/div/div/div[10]/label");
    // Включение фильтра РАБОТАЕТ КРУГЛОСУТОЧНО
    public static SelenideElement onWork24h = $x("//*[@id=\"change_region_modal\"]/div/div/div/div[11]/label");
    // Отключение фильтра ОФИСЫ МТС
    public static SelenideElement offMtsOffice = $x("//*[@id=\"change_region_modal\"]/div/div/div/div[14]/label");
    // Отключение фильтра МАГАЗИНЫ МТС
    public static SelenideElement offMtsMarkets = $x("//*[@id=\"change_region_modal\"]/div/div/div/div[15]/label");
    // Отключение фильтра ТЕРМИНАЛЫ
    public static SelenideElement offTerminals = $x("//*[@id=\"change_region_modal\"]/div/div/div/div[17]/label");
    // Отключение фильтра БАНКОМАТЫ ПАРТНЁРОВ
    public static SelenideElement offPartnerBancomats = $x("//*[@id=\"change_region_modal\"]/div/div/div/div[18]/label");
    // Закрытие фильторов
    public static SelenideElement closeFilters = $x("//*[@id=\"change_region_modal\"]/div/button[2]");
    // Коллекция списка банкоматов
    public static ElementsCollection atmWith24Hours = $$x("//*[contains(text(), 'круглосуточно')]");

    //Открытие страницы с вкладами
    public static SelenideElement contribution = $x("//a[contains(@class, 'LinkWrapper-sc-f1cacf38-0') " +
            "and contains(@href, '/chastnim-licam/vkladi/') and contains(text(), 'Вклады и счета')]");
    // Открытие вклада МТС
    public static SelenideElement mtsContribution = $x("//*[@id=\"__next\"]/div[4]/div[2]/div[3]/div/div[1]/div[2]/div[3]/div[3]/a[1]");
    // Установка значения ДЛЯ ВСЕХ
    public static SelenideElement allUsers = $x("//*[@id=\"depositFormBlockId\"]/div/div/div/form/div[1]/span[1]/div");
    // Выбор валюты депозита в рублях
    public static SelenideElement depositCurrency = $x("//*[@id=\"depositFormBlockId\"]" +
            "/div/div/div/form/div[3]/div[1]/div[1]/div[2]/span[1]/div");
    // Откытие списка периода
    public static SelenideElement periodMenu = $x("//*[@id=\"depositFormBlockId\"]" +
            "/div/div/div/form/div[3]/div[1]/div[2]/div[3]/div/div/div/div[2]/input");
    // Выбор периода 1 год
    public static SelenideElement period = $x("//*[@id=\"depositFormBlockId\"]" +
            "/div/div/div/form/div[3]/div[1]/div[2]/div[3]/div/div[2]/div/div[1]/div[2]/div/div/div/div/div[6]/div");
    // Ввод суммы вклада
    public static SelenideElement inputContributionSum = $x("//*[@id=\"depositFormBlockId\"]" +
            "/div/div/div/form/div[3]/div[1]/div[2]/div[1]/div/div[1]/div[2]/input");
    // Выплачивать проценты ежемесячно
    public static SelenideElement percentTime = $x("//*[@id=\"depositFormBlockId\"]/div/div/div/form/div[3]/div[1]/div[3]/div[2]/span[1]/div");
    // Не оставлять проценты на вкладе
    public static SelenideElement percentOnContribution = $x("//*[@id=\"depositFormBlockId\"]" +
            "/div/div/div/form/div[3]/div[1]/div[4]/div[1]/div/div[1]");
    // Вид вклада без пополнения и снятия
    public static SelenideElement typeOfContribution = $x("//*[@id=\"depositFormBlockId\"]" +
            "/div/div/div/form/div[3]/div[1]/div[4]/div[4]/label");
    // Процент по вкладу
    public static SelenideElement percent = $x("//*[@id=\"depositFormBlockId\"]" +
            "/div/div/div/form/div[3]/div[2]/div/div[1]/div[1]/div[2]/div[2]");
    // Финальная сумма вклада
    public static SelenideElement finalSum = $x("//*[@id=\"depositFormBlockId\"]" +
            "/div/div/div/form/div[3]/div[2]/div/div[1]/div[1]/div[1]/div[2]");

    // Открытие страницы депозитов
    public static SelenideElement depositsPage = $x("//*[@id=\"__next\"]/div[1]/footer/div/div[5]/div/ul/li[6]/a");
    // Сумма депозита
    public static SelenideElement depositeSum = $x("//*[@id=\"__next\"]/div[4]/div[2]/div[3]/div/div[4]/div[2]/form/div[1]/div/div/div[1]/div[2]/input");
    // Количество дней депозита
    public static SelenideElement countDays = $x("//*[@id=\"__next\"]/div[4]/div[2]/div[3]/div/div[4]/div[2]/form/div[2]/div/div/div[1]/div[2]/input");
    // Предложения депозитов
    public static ElementsCollection offers = $$("div.sc-eJMPIT.bAszgH");

    // Открытие страницы вакансий МТС
    public static SelenideElement jobsMts = $x("//*[@id=\"__next\"]/div[1]/footer/div/div[3]/div/ul/li[5]/a");

    // Ввод искомой работы
    public static SelenideElement inputJob = $x("//*[@id=\"mainSearch\"]");
    // Проверка доступных вакансий
    public static ElementsCollection vacancies = $$(".VacanciesResult_vacanciesResult__item__nzlwN");


}
