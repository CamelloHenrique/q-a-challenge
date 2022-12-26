package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.locators.CurriculumLocators;
import utils.SeleniumUtils;

import java.util.List;

public class CurriculumPage {
    private WebDriver driver;

    public CurriculumPage(WebDriver driver) {
        this.driver = driver;
    }
    public DashboardPage concluirClick(){
        driver.findElement(CurriculumLocators.CONCLUIR).click();
        return new DashboardPage(driver);
    }

    public void esperarAPaginaCarregar(){
        SeleniumUtils.esperarAteCampoVisivel(driver,CurriculumLocators.HABILIDADES);
    }
    public String getNomeDaPaginaAtual(){
        return driver.getCurrentUrl();
    }

    public String getNomeCompleto(){
        return driver.findElement(CurriculumLocators.NOME_COMPLETO).getText();
    }
    public String getCidade(){
        return driver.findElement(CurriculumLocators.CIDADE).getText();
    }
    public String getCarreiras(){
        return driver.findElement(CurriculumLocators.CARREIRAS).getText();
    }
    public String getEmail(){
        return driver.findElement(CurriculumLocators.EMAIL).getText();
    }

    public String getWhatsapp(){
        return driver.findElement(CurriculumLocators.WHATSAPP).getText();
    }

    public String getCausasSociais(){
        return driver.findElement(CurriculumLocators.CAUSAS_SOCIAIS).getText();
    }

    public List<WebElement> getHabilidades(){
        return driver.findElements(CurriculumLocators.HABILIDADES);
    }

}
