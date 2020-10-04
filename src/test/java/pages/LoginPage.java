package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private static final String EMAIL_INPUT = "#ContentPlaceHolderContent_TextBoxEmail";
    private static final String PASSWORD_INPUT = "#ContentPlaceHolderContent_TextBoxPassword";
    private static final String LOGIN_BUTTON = "#ContentPlaceHolderContent_ButtonLogin";

    @Step("Login to Mood Panda with email: '{email}', password: '{password}'")
    public LoginPage setEmailAndPassword(String email, String password) {
        $(EMAIL_INPUT).sendKeys(email);
        $(PASSWORD_INPUT).sendKeys(password);
        return this;
    }

    public FeedPage clickLoginButton() {
        $(LOGIN_BUTTON).click();
        return new FeedPage();
    }
}
