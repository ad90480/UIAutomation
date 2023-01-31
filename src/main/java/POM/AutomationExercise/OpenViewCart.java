package POM.AutomationExercise;

import Base.Utility;
import org.openqa.selenium.By;

public class OpenViewCart extends Utility {

    public static void OpenCart(){
        driver.navigate().refresh();
        driver.findElement(By.xpath("//a[@href=\"/view_cart\"]")).click();
    }
    public static void Checkout(){
        driver.findElement(By.xpath("//a[@class=\"btn btn-default check_out\"]")).click();
    }
    public static void Billing(){
        driver.findElement(By.xpath("//textarea[@class=\"form-control\"]")).sendKeys("Hi I have Created this project with the help of Teammates");
    }
}
