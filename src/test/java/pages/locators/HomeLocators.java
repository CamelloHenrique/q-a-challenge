package pages.locators;

import org.openqa.selenium.By;

public class HomeLocators {

    public static By VER_VAGAS = By.cssSelector("#header-nav-bar > ul > li:nth-child(1) > a");
    public static By PARA_EMPRESAS = By.cssSelector("#header-nav-bar > ul > li.u-header__nav-item.hs-has-sub-menu.dropdown > a");
    public static By BLOG = By.cssSelector("#header-nav-bar > ul > li:nth-child(3) > a");
    public static By LOGIN = By.cssSelector("#header-nav-bar > ul > li:nth-child(4) > a");
    public static By CRIAR_CONTA = By.cssSelector("#header-nav-bar > ul > li.nav-item.u-header__nav-last-item.nav-item > a > button");
    public static By COOKIES_OK = By.id("onetrust-accept-btn-handler");

}
