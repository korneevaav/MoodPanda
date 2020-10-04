package steps;

import static org.testng.Assert.assertEquals;

import io.qameta.allure.Step;
import pages.FeedPage;
import pages.LoginPage;
import pages.MainPage;

public class LoginSteps {
    MainPage mainPage;
    LoginPage loginPage;
    FeedPage feedPage;

    public LoginSteps() {
        mainPage = new MainPage();
        loginPage = new LoginPage();
        feedPage = new FeedPage();
    }

    public LoginSteps openLoginPage() {
        mainPage.openPage().clickStartButton();
        return this;
    }

    @Step("Login to Mood Panda with email: '{email}', password: '{password}'")
    public LoginSteps login(String email, String password) {
        loginPage.setEmailAndPassword(email, password).clickLoginButton();
        return this;
    }

    @Step("Check that result URL is '{url}'")
    public LoginSteps checkFeedPageUrl(String url) {
        assertEquals(feedPage.getUrl(), url, "Неверный URL");
        return this;
    }

}
