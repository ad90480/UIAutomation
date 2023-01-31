package POM.AutomationExercise;

import Base.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {

    public static void OpenProductPage(){
        driver.findElement(By.xpath("//a[@href=\"/products\"]")).click();
        driver.navigate().refresh();
    }

    public static void RefreshProductPage(){
        driver.findElement(By.xpath("//a[@href=\"/products\"]")).click();

    }
}

