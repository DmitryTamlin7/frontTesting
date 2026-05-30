package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.FramesPage;

@Epic("UI Automation")
@Feature("FrameTest")
public class FrameTest extends BaseTest{

    private final FramesPage framesPage = new FramesPage();

    @Test
    @Story("Взаимодействие с вложенными фреймами")
    @DisplayName("Клик по кнопкам внутри фреймов")
    @Description("Переключение контекста во внешний и вложенный фреймы используя локатор")
    void framesClickTest() {
        framesPage.openPage()
                .switchToOuterFrame()
                .clickEditByDataAttribute()
                .clickSubmitByText()
                .clickClickMeByName()
                .clickPrimaryByXpath()

                .switchToInnerFrame()
                .clickEditByDataAttribute()
                .clickSubmitByText()
                .clickClickMeByName()
                .clickPrimaryByXpath()

                .switchToMainPage();
    }
}
