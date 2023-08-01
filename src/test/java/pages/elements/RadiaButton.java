package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadiaButton {
    WebDriver driver;
    String value;

    String inputRadioButton = "//input[@type = 'radio' and @value = '%s']/..";

    public RadiaButton(WebDriver driver,String radioButton){
        this.driver=driver;
        this.value=radioButton;
}
    public void selectRadioButton(){
        driver.findElement(By.xpath(String.format(inputRadioButton,this.value))).click();

    }}
