package tests.base;

import Common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.base.Action;
import pages.pixel_perfect.PixelPerfectExtra;
import pages.pixel_perfect.PixelPerfect;

import static Common.Config.CLEAR_COOKIES_AND_STORAGE;
import static Common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected Action action = new Action(driver);
    protected PixelPerfectExtra pixelPerfectExtra = new PixelPerfectExtra(driver);
    protected PixelPerfect pixelPerfect = new PixelPerfect(driver);


    @AfterTest
    public void clearCookiesAndLocalStorage(){
        if (CLEAR_COOKIES_AND_STORAGE)
        {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            js.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite(alwaysRun = true)
    public void close() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }

}
