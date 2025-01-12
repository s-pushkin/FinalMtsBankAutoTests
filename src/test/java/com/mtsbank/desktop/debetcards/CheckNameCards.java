package com.mtsbank.desktop.debetcards;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;

public class CheckNameCards {
    public void checkNameCards() {
        ElementsCollection CardName = Selenide.$$x("//h4[@font-weight='bold']");
        for (int i = 0; i < CardName.size(); i++) {
            String name = CardName.get(i).innerText();
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
