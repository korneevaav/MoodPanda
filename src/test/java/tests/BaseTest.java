package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import steps.LoginSteps;

public class BaseTest {
   LoginSteps loginSteps;

    @BeforeMethod
    public void setup() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        Configuration.headless = false;
        Configuration.clickViaJs = true;
        Configuration.startMaximized = true;
        loginSteps = new LoginSteps();
    }
}
