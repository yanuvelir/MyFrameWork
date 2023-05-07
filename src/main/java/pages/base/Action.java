package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.Duration;

import static constants.Constant.TimeoutVariable.EXPLICIT_WAIT;

public class Action {
    protected WebDriver driver;

    public Action(WebDriver driver){
        this.driver = driver;
    }

    public void openPage(String url) {
        driver.get(url);
    }

        public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).
                until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public WebElement findElementByXpath(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        return element;
    }

    public void inputText(WebElement element, String text){
        element.sendKeys(text);
    }

    public void InputTextByXpath(String xpath, String text) {
        WebElement element = findElementByXpath(xpath);
        inputText(element, text);
    }

    public void clickByXpath(String xpath){
        WebElement element = findElementByXpath(xpath);
        element.click();
    }



}
