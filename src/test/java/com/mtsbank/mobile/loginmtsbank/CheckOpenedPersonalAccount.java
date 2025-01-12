package com.mtsbank.mobile.loginmtsbank;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.sleep;

public class CheckOpenedPersonalAccount {
    public void checkOpenedPersonalAccount() {
        sleep(3000);
        String pageText = Selenide.$x("/html/body/h3").innerText();

        // Проверить, есть ли текст "Access Denied"
        if (pageText.contains("Access Denied")) {
            System.out.println("Текст 'Access Denied' найден на странице.");
        } else {
            System.out.println("Текст 'Access Denied' не найден на странице.");
        }


    }
}
