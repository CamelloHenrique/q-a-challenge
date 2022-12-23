package pages.locators;

import org.openqa.selenium.By;

public class PersonalLocators {
    public static By COMUNIDADES = By.cssSelector("#__next > div.container.space-bottom-3.space-top-2.container > div > div > div > div > div.fade.tab-pane.active.show > form > div.mt-3.row > div.col-12.mt-3.form-group.col > div > div.react-select.css-1akvy1b-container > div > div.css-13tza3w");
    public static By RELACAO_COMUNIDADE = By.id("communities-0-relation");
    public static By CAUSAS_SOCIAIS = By.cssSelector("#__next > div.container.space-bottom-3.space-top-2.container > div > div > div > div > div.fade.tab-pane.active.show > form > div.mt-3.row > div.col-12.mt-3.form-group.col-lg-12.col-12 > div > div.css-yk16xz-control > div.css-13tza3w");
    public static By RACA = By.id("race");
    public static By GENERO = By.id("gender");
    public static By ORIENTACAO_SEXUAL = By.id("sexual_orientation");
    public static By DEFICIENCIA = By.id("disabilities.type");
    public static By PROXIMO = By.className("btn-primary");
}
