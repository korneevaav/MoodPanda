package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(description = "Login to Mood Panda")
    @Description("Login to Mood Panda and check that we on Feed page")
    public void loginTest() {
        loginSteps
                .openLoginPage()
                .login("anastasia.karneyeva@gmail.com", "MoodPandaKorneeva2020")
                .checkFeedPageUrl("https://moodpanda.com/Feed/");
    }
}
