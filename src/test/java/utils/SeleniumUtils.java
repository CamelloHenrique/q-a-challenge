package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.locators.VagasLocators;

public class SeleniumUtils {

    public static void limparCampo(WebElement element){
        Integer size = element.getAttribute("value").length();
        for (int i = 0; i<size; i++) {
            element.sendKeys(Keys.BACK_SPACE);
            element.sendKeys(Keys.DELETE);
        }
    }

    public static void esperarAteCampoVisivel(WebDriver driver,By cssSelector) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(cssSelector));

    }

    public static void esperarPorNome(WebDriver driver,By element, String nome) {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(element), nome));

    }

    public static void scrollPage(WebDriver driver,Integer size){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+size+")", "");
    }

    public static void esperarPorTitulo(WebDriver driver,String titulo) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.titleIs(titulo));
    }

    public static void selecionarItemDropDown(WebDriver driver, By by, String value){
        new Select(driver.findElement(by)).selectByValue(value);
    }

    public static WebDriver crearChromeDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
