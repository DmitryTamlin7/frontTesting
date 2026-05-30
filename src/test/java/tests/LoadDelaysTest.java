package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.LoadDelaysPage;



@Epic("UI Automation")
@Feature("LoadDelay")
public class LoadDelaysTest extends BaseTest {

    private final LoadDelaysPage loadDelaysPage = new LoadDelaysPage();

    @Test
    @Story("Работа с динамическими элементами")
    @DisplayName("Ожидание появления кнопки после задержки")
    @Description("Selenide корректно ожидает появления элемента который появляется с задержкой")
    void delayedButtonTest() {
        loadDelaysPage.openPage()
                .clickDelayedButton();
    }
}
