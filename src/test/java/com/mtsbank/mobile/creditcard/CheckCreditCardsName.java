package com.mtsbank.mobile.creditcard;

import static com.mtsbank.elements.SelenideElementsMobile.*;

public class CheckCreditCardsName {
    public void checkNameCards() {
        for (int i = 0; i < nameCreditCards.size(); i++) {
            String name = nameCreditCards.get(i).innerText();
            name = name.toLowerCase();
            if (name.contains("кредитная")) {
                System.out.println("В названии карты есть слово кредитная:\n" + "<" + name + ">");
                System.out.println();
            } else {
                System.out.println("В названии карты нет слово кредитная:\n" + "<" + name + ">");
                System.out.println();
            }
        }
    }
}
