package com.mtsbank.desktop.atm24;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static com.mtsbank.elements.SelenideElementsPc.*;

public class CheckWorkTime {
    public void checkWorkTime() {
        assertTrue(atmWith24Hours.size() > 1, "Не найдено ни одного банкомата с пометкой 'круглосуточно'");
        System.out.println("Найдено банкоматов работающих круглосуточно: " + (atmWith24Hours.size() - 2));
    }
}
