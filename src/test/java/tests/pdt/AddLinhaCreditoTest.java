package tests.pdt;

import Helpers.BaseComLogin;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class AddLinhaCreditoTest extends BaseComLogin {

    @Test
    public void addLinhaCredito() throws InterruptedException {
        browser.findElement(By.xpath("//Select[@ng-model=\"vm.model\"]")).click();




       // Select combo = new Select(browser.findElement(By.xpath("//Select[@ng-model=\"vm.model\"]")));
        //Thread.sleep(1000*4);
        //combo.selectByIndex(2);
        //combo.selectByValue("PDT - Produtos da Instituição");
        //combo.selectByVisibleText("PDT - Produtos da Instituição");


        /*WebElement comboProduto = browser.findElement(By.xpath("//div[@ng-if=\"vm.menuItens\"]"));
        Select combobox = new Select(comboProduto);
        combobox.selectByValue("PDT - PRODUTOS DA INSTITUIÇÃO");*/
        //Valida se está no meu correto
        assertEquals("Linhas de Crédito",browser.findElement(By.id("menuItem1")).getText());
    }

    @Test
    public void addLinhaCredito2(){
        WebElement comboProduto = browser.findElement(By.xpath("//div[@ng-if=\"vm.menuItens\"]"));
        Select combobox = new Select(comboProduto);
        combobox.selectByValue("PDT - PRODUTOS DA INSTITUIÇÃO");
        //Valida se está no meu correto
        assertEquals("Linhas de Crédito",browser.findElement(By.id("menuItem1")).getText());
    }
}