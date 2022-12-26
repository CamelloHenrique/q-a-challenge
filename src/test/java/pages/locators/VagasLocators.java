package pages.locators;

import org.openqa.selenium.By;

public class VagasLocators {

    public static By CONTEUDO_DA_BUSCA = By.xpath("//*[@id='content']/div/div/form/div/div/div/input");
    public static By BUSCAR = By.cssSelector("#content > div > div.bg-primary > form > div > div.align-self-lg-end.col-lg-2 > button");
    public static By FRONTEND = By.cssSelector("#content > div > div:nth-child(3) > div:nth-child(1) > a > div.p-3 > div.d-lg-flex.justify-content-between.px-2.row > div.d-flex.align-items-center.pr-0.col-xl-5.col-lg-6 > div.pr-4.mb-3.mr-1.pt-1 > h3");
    public static By FULLSTACK = By.cssSelector("#content > div > div:nth-child(3) > div:nth-child(2) > a > div.p-3 > div.d-lg-flex.justify-content-between.px-2.row > div.d-flex.align-items-center.pr-0.col-xl-5.col-lg-6 > div.pr-4.mb-3.mr-1.pt-1 > h3");
    public static By DEVOPS = By.cssSelector("#content > div > div:nth-child(3) > div:nth-child(3) > a > div.p-3 > div.d-lg-flex.justify-content-between.px-2.row > div.d-flex.align-items-center.pr-0.col-xl-5.col-lg-6 > div.pr-4.mb-3.mr-1.pt-1 > h3");
    public static By COOKIES_OK = By.id("onetrust-accept-btn-handler");
}
