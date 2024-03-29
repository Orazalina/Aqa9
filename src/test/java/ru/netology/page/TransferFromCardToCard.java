package ru.netology.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;
import static com.codeborne.selenide.Selenide.*;



public class TransferFromCardToCard {
    private SelenideElement amount = $("[data-test-id=amount] input");
    private SelenideElement from = $("[data-test-id=from] input");
    private SelenideElement transferButton = $("[data-test-id=action-transfer]");
    private SelenideElement to = $("[data-test-id=to] input");

    public void topUp (int randomSum) {
        amount.setValue(String.valueOf(randomSum));
        if (to.getAttribute("value").contains("0001")==true) {
            from.setValue(DataHelper.getSecondCard().getCardNumber());
        } else
            from.setValue(DataHelper.getFirstCard().getCardNumber());
        transferButton.click();

    }

}
