package AutomationExerciseTests;

import POM.AutomationExercise.LoginWebsite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends LoginWebsite {


@Test(priority = '1')
    public static void openHomepage() {
        Homepage();
        OpenLoginPage();
        EnterEmail();
        EnterPassword();
        ClickOnLogin();
        getUrl();
        Assert.assertEquals("https://automationexercise.com/",getUrl());

    }
}
