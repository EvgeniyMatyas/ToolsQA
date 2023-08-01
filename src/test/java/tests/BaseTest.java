package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.FormsPage;


import java.util.concurrent.TimeUnit;



public class BaseTest {
    WebDriver driver;
    FormsPage formsPage;





    @Step("Настройка и открытие браузера")
    @BeforeMethod
    public void setUp(ITestContext context){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        context.setAttribute("driver",driver);


        formsPage = new FormsPage(driver);



    }
    @Step("Закрытие браузера")
    @AfterMethod(alwaysRun = true)
    public void tearDown(){

        driver.quit();
    }
}



