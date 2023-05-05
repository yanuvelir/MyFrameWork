package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.Constant.TimeoutVariable.EXPLICIT_WAIT;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void open(String url) {
        driver.get(url);
    }

//    public  void findElementByXpath(String xpath) {
//WebElement element1 = driver.findElement(By.xpath(xpath));
//    }

    public WebElement findElementByXpath(String xpath) {
        WebElement element1 = driver.findElement(By.xpath(xpath));
        return element1;
    }

    public void inputText(WebElement element, String text){
        element.sendKeys(text);
    }


    public void inputTextByXpath(String xpath, String text) {
        WebElement element = findElementByXpath(xpath);
        inputText(element, text);
    }

    public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).
                until(ExpectedConditions.visibilityOf(element));
        return element;
    }


}
