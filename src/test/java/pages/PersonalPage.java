package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.locators.LoginLocators;
import pages.locators.PersonalLocators;

public class PersonalPage {
    private WebDriver driver;
    private By comunidades = PersonalLocators.COMUNIDADES.getBy();
    private By relacaoComunidade = PersonalLocators.RELACAO_COMUNIDADE.getBy();
    private By causaSociais = PersonalLocators.CAUSAS_SOCIAIS.getBy();
    private By raca = PersonalLocators.RACA.getBy();
    private By genero = PersonalLocators.GENERO.getBy();
    private By orientacaoSexual = PersonalLocators.ORIENTACAO_SEXUAL.getBy();
    private By deficiencia = PersonalLocators.DEFICIENCIA.getBy();
    private By proximo = PersonalLocators.PROXIMO.getBy();

    public PersonalPage(WebDriver driver) {
        this.driver = driver;
    }

    //TODO receber uma lista de comunidades
    public void insertComunidades(String comunidades){
        driver.findElement(this.comunidades).sendKeys(comunidades);
    }
    public void insertRelacaoComunidade(String relacaoComunidade){
        driver.findElement(this.relacaoComunidade).sendKeys(relacaoComunidade);
    }
    public void insertCausaSociais(String causaSociais){
        driver.findElement(this.causaSociais).sendKeys(causaSociais);
    }
    public void insertRaca(String raca){
        driver.findElement(this.raca).sendKeys(raca);
    }
    public void insertGenero(String genero){
        driver.findElement(this.genero).sendKeys(genero);
    }

    public void insertOrientacaoSexual(String orientacaoSexual){
        driver.findElement(this.orientacaoSexual).sendKeys(orientacaoSexual);
    }
    public void insertDeficiencia(String deficiencia){
        driver.findElement(this.deficiencia).sendKeys(deficiencia);
    }
    public ScorecardIntroPage proximoClick(){
        driver.findElement(proximo).click();
        return new ScorecardIntroPage(driver);
    }
}
