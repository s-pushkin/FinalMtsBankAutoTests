package com.mtsbank.desktop.vacancy;

import static com.mtsbank.elements.SelenideElementsPc.*;

public class SearchJobs {
    String nameOfJob = "инженер тестирования";

    public void searchJobs() {
        inputJob.setValue(nameOfJob);
        inputJob.pressEnter();
    }
}
