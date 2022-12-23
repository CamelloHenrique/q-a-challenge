package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.locators.LoginLocators;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public CadastresePage cadastreSeClick(){
        driver.findElement(LoginLocators.CADASTRE_SE).click();
        return new CadastresePage(driver);
    }
}
