package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Calendar {
    public static final By CALENDAR_LOCATOR = By.id("dateOfBirthInput");
    String monthLocator = "//select[contains(@class, 'month-select')]/option[text() = '%s']";
    String yearLocator = "//select[contains(@class, 'year-select')]/option[text() = '%s']";
    String daylocator = "//div[@class = 'react-datepicker__month']//div[contains(@class, 'react-datepicker__day') and text() = '%s' ]";
    WebDriver driver;

    public Calendar(WebDriver driver) {
        this.driver = driver;
    }

  public void selectDate(String month,String year,String day){
        driver.findElement(CALENDAR_LOCATOR).click();
        driver.findElement(By.xpath(String.format(monthLocator,month))).click();
        driver.findElement(By.xpath(String.format(yearLocator,year))).click();
        driver.findElement(By.xpath(String.format(daylocator,day))).click();
  }

}
