package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SetUp {
    private WebDriver browser;

    public WebDriver getBrowser(){
        String browserType = System.getProperty("browser");
        // mvn clean test -Dbrowser=chrome -Dwebdriver.chrome.driver=c:\drivers\chromedriver.exe
        if ("ie".equals(browserType)) {
            browser = new ChromeDriver();
        } else{
            System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
            browser = new ChromeDriver();
        }

        browser.get("http://10.161.69.127:8080/sisbadesc2/");
        browser.manage().window().maximize();

        return browser;
    }
}
