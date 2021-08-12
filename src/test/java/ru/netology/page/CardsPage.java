package ru.netology.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import static com.codeborne.selenide.Selenide.$$;

@NoArgsConstructor
@AllArgsConstructor

public class CardsPage {
    private ElementsCollection buttons = $$("[data-test-id=action-deposit] ");
    private SelenideElement buttonPayToFirstCard = buttons.first();
    private SelenideElement buttonPayToSecondCard = buttons.last();

    public void topUpFirstCard() {
        buttonPayToFirstCard.click();
    }

    public void topUpSecondCard() {
        buttonPayToSecondCard.click();
    }
}
