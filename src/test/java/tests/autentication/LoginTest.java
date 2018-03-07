package tests.autentication;

import static org.junit.Assert.*;

import Helpers.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.concurrent.TimeUnit;

public class LoginTest {
    private WebDriver browser;

    @Before
    public void setUp() {
        SetUp setUp = new SetUp();
        browser = setUp.getBrowser();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testLogin() {
        executaLogin(browser);
    }

    public void executaLogin(WebDriver browser) {
        assertEquals("SISBADESC 2", browser.getTitle());

        browser.findElement(By.id("username")).sendKeys("camilav");
        browser.findElement(By.id("password")).sendKeys("123");
        browser.findElement(By.xpath("//button")).click();

        WebElement logado = browser.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div[3]/div/div[2]/div[1]/bsc-breadcrumbs-component/ui-breadcrumbs/ol/li/span"));
        String textoLogado = logado.getText();
        assertEquals("Home", textoLogado);
    }

    @After //anotação do jUnit que irá rodar sempre após um teste
    public void fecharNavegador() {
        browser.quit();
    }
}
