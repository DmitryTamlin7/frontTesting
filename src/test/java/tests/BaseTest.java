package tests;

import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;


public class BaseTest {

    @BeforeAll
    static void setup(){
        Configuration.baseUrl = "http://uitestingplayground.com";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false)
        );
    }
}
