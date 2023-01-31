package POM.AutomationExercise;

import Base.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class AddToCart1 extends Utility {

    public static void AddFirstProduct(){
        JavascriptExecutor jv = (JavascriptExecutor) driver;
        jv.executeScript("window.scrollBy(0,500)", "");
        driver.findElement(By.xpath("//*[@href='/product_details/1']")).click();
        driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
    }

    public static void FirstAddToCart() {
        driver.findElement(By.xpath("//a[@href=\"/products\"]")).click();
    }
}
