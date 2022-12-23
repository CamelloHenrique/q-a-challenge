package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.locators.ProfileLocators;

public class ProfilePage {
    private WebDriver driver;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }
    public void insertNomeCompleto(String nomeCompleto){
        driver.findElement(ProfileLocators.NOME_COMPLETO).sendKeys(nomeCompleto);
    }

    public void selectQaTestes(String qaTestes){
        driver.findElement(ProfileLocators.QA_TESTES).sendKeys(qaTestes);
    }

    //TODO aceitar uma lista de habilidades
    public void insertSuasHabilidades(String suasHabilidades){
        driver.findElement(ProfileLocators.SUAS_HABILIDADES).sendKeys(suasHabilidades);
    }

    public void insertExperienciaGeral(String experienciaGeral){
        driver.findElement(ProfileLocators.EXPERIENCIA_GERAL).sendKeys(experienciaGeral);
    }

    public void insertMomentoProfissional(String momentoProfissional){
        driver.findElement(ProfileLocators.MOMOENTO_PROFISSIONAL).sendKeys(momentoProfissional);
    }

    public void insertWhatsapp(String whatsapp){
        driver.findElement(ProfileLocators.WHATSAPP).sendKeys(whatsapp);
    }

    public void insertCidade(String cidade){
        driver.findElement(ProfileLocators.CIDADE).sendKeys(cidade);
    }

    public void selectRemota(String remota){
        driver.findElement(ProfileLocators.REMOTA).sendKeys(remota);
    }

    public void selectPresencial(String presencial){
        driver.findElement(ProfileLocators.PRESENCIAL).sendKeys(presencial);
    }

    public void selectHibrida(String hibrida){
        driver.findElement(ProfileLocators.HIBRIDA).sendKeys(hibrida);
    }

    public PersonalPage proximoClick(){
        driver.findElement(ProfileLocators.PROXIMO).click();
        return new PersonalPage(driver);
    }



}
