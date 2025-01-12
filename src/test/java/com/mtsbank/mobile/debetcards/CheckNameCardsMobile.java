package com.mtsbank.mobile.debetcards;

import static com.mtsbank.elements.SelenideElementsMobile.*;

public class CheckNameCardsMobile {
    public void checkNameCards() {
        for (int i = 0; i < debetCardName.size(); i++) {
            String name = debetCardName.get(i).innerText();
            name = name.toLowerCase();
            if (name.contains("дебетовая")) {
                System.out.println("В названии карты есть слово дебетовая:\n" + "<" + name + ">");
                System.out.println();
            } else {
                System.out.println("В названии карты нет слово дебетовая:\n" + "<" + name + ">");
                System.out.println();
            }
        }
    }
}
