package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.ClickPage;

@Epic("UI Automation")
@Feature("ClickTest")
public class ClickTest extends BaseTest{

    private final ClickPage clickPage = new ClickPage();


    @Test
    @Story("Эмуляция физических действий пользователя")
    @DisplayName("Успешный клик по кнопке без DOM-события")
    @Description("Эмуляция физического клика мышью успешно активирует кнопку и меняет её цвет на зеленый")
    void physicalMouseClickTest(){
        clickPage.openPage()
                .clickBadButton()
                .verifyButtonIsGreen();
    }
}
