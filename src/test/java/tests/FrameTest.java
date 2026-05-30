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
    @Story("Работа с вложенностью")
    @DisplayName("Клик по кнопкам внутри фреймов")
    @Description("Переключение контекста внешних и внутренних и работа с локатором")
    void framesClickTest() {
        framesPage.openPage()
                .switchToOuterFrame()
                .clickEditButtonByDataAttribute()
                .clickSubmitButtonByName()
                .clickSubmitButtonByName()
                .clickClickButtonByText()
                .clickPrimaryByXpath()

                .switchToInnerFrame()
                .clickEditButtonByDataAttribute()
                .clickSubmitButtonByName()
                .clickSubmitButtonByName()
                .clickClickButtonByText()
                .clickPrimaryByXpath()

                .switchToDefaultContent();
    }
}
