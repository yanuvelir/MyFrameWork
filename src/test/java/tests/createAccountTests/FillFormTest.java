package tests.createAccountTests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class FillFormTest extends BaseTest {


    @Test
    public void test2() {
        basePage.open("https://dex-trade.com/sign-up");
        basePage.inputTextByXpath("//input[@type='email']", "yanautomte.st.6@gmail.com");
        basePage.inputTextByXpath("//input[@type='password']", "Vinnitsa-2022");
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