package com.mtsbank.mobile.vacancy;

import static com.codeborne.selenide.Selenide.sleep;
import static com.mtsbank.elements.SelenideElementsMobile.vacancies;

public class CheckVacansiesMobile {
    public void checkVacansies() {
        String test = "инженер тестирования";
        sleep(1000);
        for (var vacancy : vacancies) {
            String vacancyTitle = vacancy.$(".VacanciesResult_vacanciesResult__title__OZvZV").getText().toLowerCase();
            String[] searchKeywords = test.toLowerCase().split("\\s+");

            for (String keyword : searchKeywords) {
                if (!vacancyTitle.contains(keyword)) {
                    System.out.println("В вакансии \"" + vacancyTitle + "\" нет слова: " + keyword);
                }
            }

        }

    }
}
