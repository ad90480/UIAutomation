package POM.AutomationExercise;

import Base.Utility;
import org.openqa.selenium.By;

public class LoginWebsite extends Utility {

    public static void Homepage (){
        openBrowser("https://automationexercise.com/");
    }

    public static void OpenLoginPage(){
        driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
    }

    public static void EnterEmail(){
        driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]")).sendKeys("kad90480@gmail.com");
    }

    public static void EnterPassword(){
        driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]")).sendKeys("aA@9721441512");
    }
    public static void ClickOnLogin(){
        driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]")).click();
    }
}
