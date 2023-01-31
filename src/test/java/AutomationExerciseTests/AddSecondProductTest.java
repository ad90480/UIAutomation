package AutomationExerciseTests;


import org.testng.annotations.Test;

import static POM.AutomationExercise.AddToCart2.AddSecondProduct;
import static POM.AutomationExercise.AddToCart2.SecondAddToCart;

public class AddSecondProductTest extends AddFirstProductTest{

    @Test(priority = '4')
    public static void addProductSecond(){
        AddSecondProduct();
        SecondAddToCart();

    }
}