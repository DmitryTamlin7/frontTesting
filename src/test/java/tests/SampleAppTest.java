package tests;


import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.SampleAppPage;

@Epic("UI Automation")
@Feature("Sample App")
public class SampleAppTest extends BaseTest{
    private final SampleAppPage sampleAppPage = new SampleAppPage();

    @Test
    @Story("Успешная Аутентификация")
    @DisplayName("Успешный вход в систему")
    @Description("Проверка любое имя + pwd дает успешный вход в систему")
    void successfulLoginTest() {
        String username = "Lex";
        String password = "pwd";

        sampleAppPage.openPage()
                .enterUsername(username)
                .enterPassword(password)
                .clickLogin()
                .verifyLoginStatus(username);
    }
}
