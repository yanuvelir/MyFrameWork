package pages.create_account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class CreateAccountPage extends BasePage {

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    private final By email = By.id("email");
    private final By password = By.id("password");

    public CreateAccountPage inputEmail(String text) {

        driver.findElement(email).sendKeys(text);

        return this;
    }

    public CreateAccountPage inputPassword(String text) {

        driver.findElement(password).sendKeys(text);

        return this;
    }

//    public CreateAccountPage takeScreenShotAndCompare(){
//        return this;
//    }
}
