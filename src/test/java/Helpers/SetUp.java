package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SetUp {
    private WebDriver browser;

    public WebDriver SetUpBrowser(){
        System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("http://http://10.161.69.127:8080/sisbadesc2");
        browser.manage().window().maximize();
        return browser;
    }

    public WebDriver getBrowser() {
        return browser;
    }

    public void setBrowser(WebDriver browser) {
        this.browser = browser;
    }
}
