package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class FormsTest extends BaseTest{

    @Test
    public void studentRegistrationForm(){
        formsPage.oen();

        assertTrue(formsPage.isPageOpen());
        formsPage.create();
        formsPage.clickInput();







    }
}
