package ru.netology;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement loginField = $("[]");
    private SelenideElement passwordField = $("[]");
    private SelenideElement loginButton = $("[]");

    public VerificationPage validLogin(DataHelper.AuthInfo info) {
       loginField.setValue(info.getLogin());
       passwordField.setValue(info.getPassword());
       loginButton.click();
       return new VerificationPage();
    }
}
