package pages.locators;

import org.openqa.selenium.By;

public enum HomeLocators {

    VER_VAGAS(By.cssSelector("#header-nav-bar > ul > li:nth-child(1) > a")),
    PARA_EMPRESAS(By.cssSelector("#header-nav-bar > ul > li.u-header__nav-item.hs-has-sub-menu.dropdown > a")),
    BLOG(By.cssSelector("#header-nav-bar > ul > li:nth-child(3) > a")),
    LOGIN(By.cssSelector("#header-nav-bar > ul > li:nth-child(4) > a")),
    CRIAR_CONTA(By.cssSelector("#header-nav-bar > ul > li.nav-item.u-header__nav-last-item.nav-item > a > button")),
    COOKIES_OK(By.id("onetrust-accept-btn-handler"));

    private By by;
    HomeLocators(By by) {
        this.by = by;
    }

    public By getBy() {
        return this.by;
    }
}
