package tests.createAccountPageTests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;

public class FillFormTest extends BaseTest {



    @Test
    public void test1() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/sign-up");

        //Waiting when the page is completely loaded
        action.waitElementIsVisible(action.findElementByXpath("//a[@data-test-id='header login']"));

        //Input a text into the selected element
        action.InputTextByXpath("//input[@type='email']", "yanautomte.st.6@gmail.com");

        //Input a text to the next element
        action.InputTextByXpath("//input[@type='password']", "Vinnitsa-2022");

        //Perform a click on the element
        action.clickByXpath("//button[@data-test-id='viewBox']");

        //Run the Pixel perfect test for a selected element
        pixelPerfect.byElement("(//div[@class='auth-container'])[3]",
                "Screenshots/Create_Account_page/EnChrome/Screenshots_test1/real_life_screenshot.png",
                "Screenshots/Create_Account_page/EnChrome/Screenshots_test1/mock_screenshot.png",
                "Screenshots/Create_Account_page/EnChrome/Screenshots_test1/difference.png");
    }

}

//    @Test
//    public void fillTheFormAndPp() {
//        basePage.open("https://dex-trade.com/sign-up");
//
//        createAccountPage.inputEmail("yanautomte.st.6@gmail.com");
//        createAccountPage.inputPassword("Vinnitsa-2022");
//
//    }