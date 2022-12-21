package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
        driver.findElement(cookiesOk).click();
    }

}
