package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.locators.HomeLocators;

public class HomePage {

    private WebDriver driver;
    private String homeURL = "https://beta.coodesh.com/";

    private By verVagas = HomeLocators.VER_VAGAS.getBy();
    private By paraEmpresas = HomeLocators.PARA_EMPRESAS.getBy();
    private By blog = HomeLocators.BLOG.getBy();
    private By login = HomeLocators.LOGIN.getBy();
    private By criarConta = HomeLocators.CRIAR_CONTA.getBy();
    private By cookiesOk = HomeLocators.COOKIES_OK.getBy();

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToHome(){
        driver.get(homeURL);
    }

    public void clickCookiesOk(){
        driver.findElement(cookiesOk).click();
    }

    public Boolean isVerVagasVisible(){
        return driver.findElement(verVagas).isDisplayed();
    }

    public Boolean isParaEmpresasVisible(){
        return driver.findElement(paraEmpresas).isDisplayed();
    }

    public Boolean isBlogVisible(){
        return driver.findElement(blog).isDisplayed();
    }

    public Boolean isLoginVisible(){
        return driver.findElement(login).isDisplayed();
    }

    public Boolean isCriarContaVisible(){
        return driver.findElement(criarConta).isDisplayed();
    }

    public String getTitle(){
        return driver.getTitle();
    }
}
