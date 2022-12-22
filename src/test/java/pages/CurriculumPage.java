package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.locators.CurriculumLocators;

public class CurriculumPage {
    private WebDriver driver;
    private By email = CurriculumLocators.EMAIL.getBy();
    private By nomeCompleto = CurriculumLocators.NOME_COMPLETO.getBy();
    private By carreiras = CurriculumLocators.CARREIRAS.getBy();
    private By informacoesDeContato = CurriculumLocators.INFORMACOES_DE_CONTATO.getBy();
    private By causasSociais = CurriculumLocators.CAUSAS_SOCIAIS.getBy();
    private By comunidades = CurriculumLocators.COMUNIDADES.getBy();
    private By habilidades = CurriculumLocators.HABILIDADES.getBy();
    private By concluir = CurriculumLocators.CONCLUIR.getBy();

    public CurriculumPage(WebDriver driver) {
        this.driver = driver;
    }
    public DashboardPage concluirClick(){
        driver.findElement(concluir).click();
        return new DashboardPage(driver);
    }
    //todo falta criar meios para testar os formulários dessa página
}
