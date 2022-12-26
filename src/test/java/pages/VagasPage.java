package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.locators.HomeLocators;
import pages.locators.VagasLocators;
import utils.SeleniumUtils;

public class VagasPage {
    private WebDriver driver;
    public VagasPage(WebDriver driver) {
        this.driver = driver;
    }
    public void navigateToVagas(){
        driver.get("https://beta.coodesh.com/vagas");
    }
    public void setConteudoDaBusca(String conteudoDaBusca){
        driver.findElement(VagasLocators.CONTEUDO_DA_BUSCA).sendKeys(conteudoDaBusca);
    }
    public void buscarClick(){
        driver.findElement(VagasLocators.BUSCAR).click();
        SeleniumUtils.esperarPorTitulo(driver,"Vagas locais e remotas de Big Bang Theory | Coodesh");
        driver.navigate().refresh();
//        SeleniumUtils.esperarPorNome(driver,VagasLocators.FRONTEND,"Frontend Vue.js Sr");
//        SeleniumUtils.esperarPorNome(driver,VagasLocators.FULLSTACK,"Fullstack Developer");
//        SeleniumUtils.esperarPorNome(driver,VagasLocators.DEVOPS,"DevOps");
    }
    public void clickCookiesOk(){
        driver.findElement(VagasLocators.COOKIES_OK).click();
    }

    public String getFrontend(){
        return driver.findElement(VagasLocators.FRONTEND).getText();
    }

    public String getFullstack(){
        return driver.findElement(VagasLocators.FULLSTACK).getText();
    }

    public String getDevops(){
        return driver.findElement(VagasLocators.DEVOPS).getText();
    }

    public WebElement getDevopsElement(){
        return driver.findElement(VagasLocators.DEVOPS);
    }

    public WebElement getFullstackElement(){
        return driver.findElement(VagasLocators.FULLSTACK);
    }

    public WebElement getFrontendElement(){
        return driver.findElement(VagasLocators.FRONTEND);
    }
}
