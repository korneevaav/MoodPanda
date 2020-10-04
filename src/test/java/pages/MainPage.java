package pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    private static final String URL = "https://moodpanda.com/";
    private static final String START_BUTTON_TEXT = "Start";

    public MainPage openPage() {
        open(URL);
        return this;
    }

    public LoginPage clickStartButton() {
        $(byText(START_BUTTON_TEXT)).click();
        return new LoginPage();
    }
}
