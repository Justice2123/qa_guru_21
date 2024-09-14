package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.WikiPage;

public class OnBoardingWikiTest extends TestBase {

    @Test
    @Tag("mobile")
    void gettingStartedTest() {
        WikiPage wikiPage = new WikiPage();

        String firstHeader = "The Free Encyclopedia " +
                "…in over 300 languages";
        String secondHeader = "New ways to explore";
        String thirdHeader = "Reading lists with sync";
        String fourthHeader = "Data & Privacy";


        wikiPage.checkOfForwardButton()
                .checkHeader(firstHeader)
                .clickOnForwardButton()
                .checkOfForwardButton()
                .checkHeader(secondHeader)
                .clickOnForwardButton()
                .checkOfForwardButton()
                .checkHeader(thirdHeader)
                .clickOnForwardButton()
                .checkDoneButton()
                .checkHeader(fourthHeader)
                .clickDoneButton();
    }

}
