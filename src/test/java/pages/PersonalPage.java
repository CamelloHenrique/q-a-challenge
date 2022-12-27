package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.locators.PersonalLocators;

public class PersonalPage {
    private WebDriver driver;

    public PersonalPage(WebDriver driver) {
        this.driver = driver;
    }

    public void insertComunidades(String comunidades){
        driver.findElement(PersonalLocators.COMUNIDADES).sendKeys(comunidades);
    }
    public void insertRelacaoComunidade(String relacaoComunidade){
        driver.findElement(PersonalLocators.RELACAO_COMUNIDADE).sendKeys(relacaoComunidade);
    }
    //todo selectCausaSocial escolhe uma causa social "aleatóriamente", deveria ser possivel selecionar uma causa social específica
    public void selectCausaSocial(String causaSociais){
        driver.findElement(PersonalLocators.CAUSAS_SOCIAIS).click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.ENTER).perform();
    }
    public void insertRaca(){
        driver.findElement(PersonalLocators.RACA).click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.DOWN,Keys.DOWN,Keys.ENTER)).perform();

    }
    public void insertGenero(){
        driver.findElement(PersonalLocators.GENERO).click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.DOWN,Keys.DOWN,Keys.ENTER)).perform();
    }

    public void insertOrientacaoSexual(){
        driver.findElement(PersonalLocators.ORIENTACAO_SEXUAL).click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.DOWN,Keys.DOWN,Keys.ENTER)).perform();
    }
    public ScorecardIntroPage proximoClick(){
        driver.findElement(PersonalLocators.PROXIMO).click();
        return new ScorecardIntroPage(driver);
    }
}
