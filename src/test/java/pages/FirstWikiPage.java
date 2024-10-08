package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class FirstWikiPage {
    SelenideElement forwardButtonFirstPage = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
            headerFirstPage = $(id("org.wikipedia.alpha:id/primaryTextView"));

    @Step("Проверка видимости кнопки 'Продолжить'")
    public FirstWikiPage checkOfForwardButtonFirstPage() {
        forwardButtonFirstPage.shouldBe(visible);
        return this;
    }

    @Step("Нажатие на кнопку Продолжить на первой странице")
    public FirstWikiPage clickOnForwardButtonFirstPage() {
        forwardButtonFirstPage.click();
        return this;
    }

    @Step("Проверка правильности заголовка")
    public FirstWikiPage checkHeaderFirstPage(String value) {
        headerFirstPage.shouldHave(text(value));
        return this;
    }

}
