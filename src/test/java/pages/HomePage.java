package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.locators.HomeLocators;

public class HomePage {

    private WebDriver driver;
    private String homeURL = "https://beta.coodesh.com/";


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToHome(){
        driver.get(homeURL);
    }

    public void clickCookiesOk(){
        driver.findElement(HomeLocators.COOKIES_OK).click();
    }

    public Boolean isVerVagasVisible(){
        return driver.findElement(HomeLocators.VER_VAGAS).isDisplayed();
    }

    public Boolean isParaEmpresasVisible(){
        return driver.findElement(HomeLocators.PARA_EMPRESAS).isDisplayed();
    }

    public Boolean isBlogVisible(){
        return driver.findElement(HomeLocators.BLOG).isDisplayed();
    }

    public Boolean isLoginVisible(){
        return driver.findElement(HomeLocators.LOGIN).isDisplayed();
    }

    public Boolean isCriarContaVisible(){
        return driver.findElement(HomeLocators.CRIAR_CONTA).isDisplayed();
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public LoginPage loginClick(){
        driver.findElement(HomeLocators.LOGIN).click();
        return new LoginPage(driver);
    }
}
