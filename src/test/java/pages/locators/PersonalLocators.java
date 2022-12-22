package pages.locators;

import org.openqa.selenium.By;

public enum PersonalLocators {
    COMUNIDADES(By.cssSelector("#__next > div.container.space-bottom-3.space-top-2.container > div > div > div > div > div.fade.tab-pane.active.show > form > div.mt-3.row > div.col-12.mt-3.form-group.col > div > div.react-select.css-1akvy1b-container > div > div.css-13tza3w")),
    RELACAO_COMUNIDADE(By.id("communities-0-relation")),
    CAUSAS_SOCIAIS(By.cssSelector("#__next > div.container.space-bottom-3.space-top-2.container > div > div > div > div > div.fade.tab-pane.active.show > form > div.mt-3.row > div.col-12.mt-3.form-group.col-lg-12.col-12 > div > div.css-yk16xz-control > div.css-13tza3w")),
    RACA(By.id("race")),
    GENERO(By.id("gender")),
    ORIENTACAO_SEXUAL(By.id("sexual_orientation")),
    DEFICIENCIA(By.id("disabilities.type")),
    PROXIMO(By.className("btn-primary"));
    private By by;
    PersonalLocators(By by) {
        this.by = by;
    }

    public By getBy() {
        return this.by;
    }
}
