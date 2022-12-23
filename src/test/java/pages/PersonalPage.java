package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.locators.LoginLocators;
import pages.locators.PersonalLocators;

public class PersonalPage {
    private WebDriver driver;

    public PersonalPage(WebDriver driver) {
        this.driver = driver;
    }

    //TODO receber uma lista de comunidades
    public void insertComunidades(String comunidades){
        driver.findElement(PersonalLocators.COMUNIDADES).sendKeys(comunidades);
    }
    public void insertRelacaoComunidade(String relacaoComunidade){
        driver.findElement(PersonalLocators.RELACAO_COMUNIDADE).sendKeys(relacaoComunidade);
    }
    public void insertCausaSociais(String causaSociais){
        driver.findElement(PersonalLocators.CAUSAS_SOCIAIS).sendKeys(causaSociais);
    }
    public void insertRaca(String raca){
        driver.findElement(PersonalLocators.RACA).sendKeys(raca);
    }
    public void insertGenero(String genero){
        driver.findElement(PersonalLocators.GENERO).sendKeys(genero);
    }

    public void insertOrientacaoSexual(String orientacaoSexual){
        driver.findElement(PersonalLocators.ORIENTACAO_SEXUAL).sendKeys(orientacaoSexual);
    }
    public void insertDeficiencia(String deficiencia){
        driver.findElement(PersonalLocators.DEFICIENCIA).sendKeys(deficiencia);
    }
    public ScorecardIntroPage proximoClick(){
        driver.findElement(PersonalLocators.PROXIMO).click();
        return new ScorecardIntroPage(driver);
    }
}
