package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.locators.CadastreseLocators;

public class CadastresePage {
    private WebDriver driver;

    public CadastresePage(WebDriver driver) {
        this.driver = driver;
    }

    public void insertNomeCompleto(String nomeCompleto){
        driver.findElement(CadastreseLocators.NOMEM_COMPLETO).sendKeys(nomeCompleto);
    }

    public void insertEmail(String email){
        driver.findElement(CadastreseLocators.EMAIL).sendKeys(email);
    }

    public void insertSenha(String senha){
        driver.findElement(CadastreseLocators.SENHA).sendKeys(senha);
    }

    public void liEAceitoOk(){
        driver.findElement(CadastreseLocators.LI_E_ACEITO).sendKeys(Keys.SPACE);
    }

    public ProfilePage inscrevaSeClick(){
        driver.findElement(CadastreseLocators.INSCREVA_SE).click();
        return new ProfilePage(driver);
    }
}
