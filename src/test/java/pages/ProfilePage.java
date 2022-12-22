package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.locators.Personal;
import pages.locators.ProfileLocators;

public class ProfilePage {
    private WebDriver driver;
    private By nomeCompleto = ProfileLocators.NOME_COMPLETO.getBy();
    private By backEndDeveloper = ProfileLocators.BACK_END_DEVELOPER.getBy();
    private By mobileDeveloper = ProfileLocators.MOBILE_DEVELOPER.getBy();
    private By qaTestes = ProfileLocators.QA_TESTES.getBy();
    private By suasHabilidades = ProfileLocators.SUAS_HABILIDADES.getBy();
    private By experienciaGeral = ProfileLocators.EXPERIENCIA_GERAL.getBy();
    private By momentoProfissional = ProfileLocators.MOMOENTO_PROFISSIONAL.getBy();
    private By whatsapp = ProfileLocators.WHATSAPP.getBy();
    private By cidade = ProfileLocators.CIDADE.getBy();
    private By remota = ProfileLocators.REMOTA.getBy();
    private By presencial = ProfileLocators.PRESENCIAL.getBy();
    private By hibrida = ProfileLocators.HIBRIDA.getBy();
    private By proximo = ProfileLocators.PROXIMO.getBy();
    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }
    public void insertNomeCompleto(String nomeCompleto){
        driver.findElement(this.nomeCompleto).sendKeys(nomeCompleto);
    }

    public void selectBackEndDeveloper(String backEndDeveloper){
        driver.findElement(this.backEndDeveloper).sendKeys(backEndDeveloper);
    }

    public void selectMobileDeveloper(String mobileDeveloper){
        driver.findElement(this.mobileDeveloper).sendKeys(mobileDeveloper);
    }

    public void selectQaTestes(String qaTestes){
        driver.findElement(this.qaTestes).sendKeys(qaTestes);
    }

    //TODO aceitar uma lista de habilidades
    public void insertSuasHabilidades(String suasHabilidades){
        driver.findElement(this.suasHabilidades).sendKeys(suasHabilidades);
    }

    public void insertExperienciaGeral(String experienciaGeral){
        driver.findElement(this.experienciaGeral).sendKeys(experienciaGeral);
    }

    public void insertMomentoProfissional(String momentoProfissional){
        driver.findElement(this.momentoProfissional).sendKeys(momentoProfissional);
    }

    public void insertWhatsapp(String whatsapp){
        driver.findElement(this.whatsapp).sendKeys(whatsapp);
    }

    public void insertCidade(String cidade){
        driver.findElement(this.cidade).sendKeys(cidade);
    }

    public void selectRemota(String remota){
        driver.findElement(this.remota).sendKeys(remota);
    }

    public void selectPresencial(String presencial){
        driver.findElement(this.presencial).sendKeys(presencial);
    }

    public void selectHibrida(String hibrida){
        driver.findElement(this.hibrida).sendKeys(hibrida);
    }
    //todo classe personanl ainda não foi criado
    public Personal proximoClick(){
        driver.findElement(proximo).click();
        return new Personal();
    }



}
