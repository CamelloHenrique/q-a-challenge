package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.locators.ProfileLocators;
import utils.SeleniumUtils;

public class ProfilePage {
    private WebDriver driver;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }
    public void insertNomeCompleto(String nomeCompleto){
        driver.findElement(ProfileLocators.NOME_COMPLETO).sendKeys(nomeCompleto);
    }
    public void selectQaTestes(){
        SeleniumUtils.esperarAteCampoVisivel(driver,ProfileLocators.QA_TESTES);
        driver.findElement(ProfileLocators.QA_TESTES).click();
    }

    //TODO aceitar uma lista de habilidades
    public void cucumberClick(){
        SeleniumUtils.esperarAteCampoVisivel(driver,ProfileLocators.CUCUMBER);
        WebElement webElement =driver.findElement(ProfileLocators.CUCUMBER);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
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
    public void selectHibrida(){
        driver.findElement(ProfileLocators.HIBRIDA).click();
    }
    public String getCurrentPageUrl(){
        SeleniumUtils.esperarAteCampoVisivel(driver,ProfileLocators.QA_TESTES);
        return driver.getCurrentUrl();
    }

    public Boolean isNomeCompletoVisible(){
        return driver.findElement(ProfileLocators.NOME_COMPLETO).isDisplayed();
    }
    public Boolean isQaTestesVisible(){
        return driver.findElement(ProfileLocators.QA_TESTES).isDisplayed();
    }

    public Boolean isCucumberVisible(){
        return driver.findElement(ProfileLocators.CUCUMBER).isDisplayed();
    }

    public Boolean isExperienciaGeralVisible(){
        return driver.findElement(ProfileLocators.EXPERIENCIA_GERAL).isDisplayed();
    }
    public Boolean isMomentoProfissionalVisible(){
        return driver.findElement(ProfileLocators.MOMOENTO_PROFISSIONAL).isDisplayed();
    }

    public Boolean isWhatsappVisible(){
        return driver.findElement(ProfileLocators.WHATSAPP).isDisplayed();
    }
    public Boolean isCidadeVisible(){
        return driver.findElement(ProfileLocators.CIDADE).isDisplayed();
    }
    public Boolean isRemotaVisible(){
        return driver.findElement(ProfileLocators.REMOTA).isDisplayed();
    }
    public Boolean isPresencialpVisible(){
        return driver.findElement(ProfileLocators.PRESENCIAL).isDisplayed();
    }
    public Boolean isHibridaVisible(){
        return driver.findElement(ProfileLocators.HIBRIDA).isDisplayed();
    }

    public PersonalPage proximoClick(){
        driver.findElement(ProfileLocators.PROXIMO).click();
        return new PersonalPage(driver);
    }



}
