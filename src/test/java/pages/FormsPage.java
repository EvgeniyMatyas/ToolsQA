package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.elements.Calendar;
import pages.elements.Input;
import pages.elements.RadiaButton;

public class FormsPage extends BasePage{
    public static final By STUDENT_FORM_TITLE = By.xpath("//div[@class='practice-form-wrapper']//h5");
    @Override
    public boolean isPageOpen() {
        return isExist(STUDENT_FORM_TITLE);
    }
    public void oen(){
        driver.get(BASE_URL);
    }

    public FormsPage(WebDriver driver) {
        super(driver);
    }
    public void create(){
        new Input(driver,"firstName").write("Evgeniy");
        new Input(driver,"lastName").write("Matyas");
        new Input(driver,"userEmail").write("Jamezzusz@mail.ru");
        new RadiaButton(driver,"Other").selectRadioButton();
        new Input(driver,"userNumber").write("1111111111");
        new Calendar(driver).selectDate("May","2000","10");


    }
    public void clickInput(){
        driver.findElement(By.id("firstName")).sendKeys("\n");
    }
}
