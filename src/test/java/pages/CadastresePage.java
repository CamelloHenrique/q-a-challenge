package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.locators.CadastreseLocators;

public class CadastresePage {
    private WebDriver driver;
    private By nomeCompleto = CadastreseLocators.NOMEM_COMPLETO.getBy();
    private By email = CadastreseLocators.EMAIL.getBy();
    private By senha = CadastreseLocators.SENHA.getBy();
    private By liEAceito = CadastreseLocators.LI_E_ACEITO.getBy();
    private By inscrevaSe = CadastreseLocators.INSCREVA_SE.getBy();

    public CadastresePage(WebDriver driver) {
        this.driver = driver;
    }

    public void insertNomeCompleto(String nomeCompleto){
        driver.findElement(this.nomeCompleto).sendKeys(nomeCompleto);
    }

    public void insertEmail(String email){
        driver.findElement(this.email).sendKeys(email);
    }

    public void insertSenha(String senha){
        driver.findElement(this.senha).sendKeys(senha);
    }

    public void liEAceitoChange(){
        driver.findElement(liEAceito).sendKeys(Keys.SPACE);
    }

    public ProfilePage inscrevaSeClick(){
        driver.findElement(inscrevaSe).click();
        return new ProfilePage(driver);
    }
}
