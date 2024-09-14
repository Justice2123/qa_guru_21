package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class WikiPage {
    SelenideElement forwardButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
            doneButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button")),
            header = $(id("org.wikipedia.alpha:id/primaryTextView"));


    @Step("Проверка видимости кнопки 'Продолжить'")
    public WikiPage checkOfForwardButton() {
        forwardButton.shouldBe(visible);
        return this;
    }

    @Step("Нажатие на кнопку Продолжить на первой странице")
    public WikiPage clickOnForwardButton() {
        forwardButton.click();
        return this;
    }

    @Step("Проверка видимости кнопки 'Начать на четвертой странице'")
    public WikiPage checkDoneButton() {
        doneButton.shouldBe(visible);
        return this;
    }

    @Step("Нажатие на кнопку 'Начать на четвертой странице'")
    public WikiPage clickDoneButton() {
        doneButton.click();
        return this;
    }

    @Step("Проверка правильности заголовка")
    public WikiPage checkHeader(String value) {
        header.shouldHave(text(value));
        return this;
    }


}
