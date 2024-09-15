package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

public class OnBoardingWikiTest extends TestBase {

    @Test
    @Tag("mobile")
    void gettingStartedTest() {
        FirstWikiPage firstWikiPage = new FirstWikiPage();
        SecondWikiPage secondWikiPage = new SecondWikiPage();
        ThirdWikiPage thirdWikiPage = new ThirdWikiPage();
        FourthWikiPage fourthWikiPage = new FourthWikiPage();

        String firstHeader = "The Free Encyclopedia " +
                "…in over 300 languages";
        String secondHeader = "New ways to explore";
        String thirdHeader = "Reading lists with sync";
        String fourthHeader = "Data & Privacy";


        firstWikiPage.checkOfForwardButtonFirstPage()
                .checkHeaderFirstPage(firstHeader)
                .clickOnForwardButtonFirstPage();
        secondWikiPage.checkOfForwardButtonSecondPage()
                .checkHeaderSecondPage(secondHeader)
                .clickOnForwardButtonSecondPage();
        thirdWikiPage.checkOfForwardButtonThirdPage()
                .checkHeaderThirdPage(thirdHeader)
                .clickOnForwardButtonThirdPage();
        fourthWikiPage.checkDoneButtonFourthPage()
                .checkHeaderFourthPage(fourthHeader)
                .clickDoneButtonFourthPage();
    }

}
