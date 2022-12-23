package pages;

import org.openqa.selenium.WebDriver;
import pages.locators.LoginLocators;
import utils.SeleniumUtils;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public CadastresePage cadastreSeClick(){
        SeleniumUtils.esperarAteCampoVisivel(driver,LoginLocators.CADASTRE_SE);
        driver.findElement(LoginLocators.CADASTRE_SE).click();
        return new CadastresePage(driver);
    }
}
