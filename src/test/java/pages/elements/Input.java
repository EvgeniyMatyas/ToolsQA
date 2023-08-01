package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {

    WebDriver driver;
    String id;

    String inputId = "%s";

    public Input(WebDriver driver,String id){
        this.driver=driver;
        this.id=id;

    }
    public void write(String text){
        driver.findElement(By.id(String.format(inputId,this.id))).clear();
        driver.findElement(By.id(String.format(inputId,this.id))).sendKeys(text);

    }

}
