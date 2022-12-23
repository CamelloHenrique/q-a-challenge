package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.locators.CurriculumLocators;

public class CurriculumPage {
    private WebDriver driver;

    public CurriculumPage(WebDriver driver) {
        this.driver = driver;
    }
    public DashboardPage concluirClick(){
        driver.findElement(CurriculumLocators.CONCLUIR).click();
        return new DashboardPage(driver);
    }
    //todo falta criar meios para testar os formulários dessa página
}
