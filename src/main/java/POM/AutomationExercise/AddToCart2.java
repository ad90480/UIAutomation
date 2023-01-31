package POM.AutomationExercise;

import Base.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class AddToCart2 extends Utility {

    public static void AddSecondProduct(){
        JavascriptExecutor jv = (JavascriptExecutor) driver;
        jv.executeScript("window.scrollBy(0,500)", "");
        driver.findElement(By.xpath("//*[@href='/product_details/2']")).click();
    }

    public static void SecondAddToCart(){
        driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
    }
}

