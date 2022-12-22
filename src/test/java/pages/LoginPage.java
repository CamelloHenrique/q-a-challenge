package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.locators.LoginLocators;

public class LoginPage {
    private WebDriver driver;
    private By cadastrese = LoginLocators.CADASTRE_SE.getBy();

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public CadastresePage cadastreSeClick(){
        driver.findElement(cadastrese).click();
        return new CadastresePage(driver);
    }
}
