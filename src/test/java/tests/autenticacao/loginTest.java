package tests.autenticacao;

import static org.junit.Assert.*;
import Helpers.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.concurrent.TimeUnit;



//EXEMPLO DE CLASE DE TESTE.


public class loginTest {
    private WebDriver browser;

    @Before //anotação do jUnit para rodar sempre antes de cada teste
    public void setUp(){
        SetUp setUp = new SetUp();
                browser = setUp.SetUpBrowser();
                browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

   // @Test //anotação para definir que este método é um teste
    public void testLogin(){
        browser.findElement(By.id("btnLogin")).click();
        browser.findElement(By.id("email_login")).sendKeys("folima1@stefanini.com");
        browser.findElement(By.id("password_login")).sendKeys("123456");

        //browser.findElement(By.xpath("//*[@id=\"dialogLogin\"]/div[1]/div[1]/form/button/text()")).click();
        browser.findElement(By.xpath("//*[@ng-click=\"logar()\"]")).click();

        WebElement logado = browser.findElement(By.xpath("//p[@class=\"ng-binding\"]"));
        String textoLogado = logado.getText();


        assertEquals("Stefaninq",textoLogado);
    }

    @Test
    public void testLogin2(){
        browser.findElement(By.id("btnLogin")).click();
        browser.findElement(By.id("email_login")).sendKeys("folima1@stefanini.com");
        browser.findElement(By.id("password_login")).sendKeys("123456");

        //browser.findElement(By.xpath("//*[@id=\"dialogLogin\"]/div[1]/div[1]/form/button/text()")).click();
        browser.findElement(By.xpath("//*[@ng-click=\"logar()\"]")).click();

        WebElement logado = browser.findElement(By.xpath("//p[@class=\"ng-binding\"]"));
        String textoLogado = logado.getText();


        assertEquals("Stefanini",textoLogado);
    }


    @After //anotação do jUnit que irá rodar sempre após um teste
    public void fecharNavegador(){
        browser.quit();
    }
}
