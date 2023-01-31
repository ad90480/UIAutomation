package AutomationExerciseTests;

import org.testng.annotations.Test;

import static POM.AutomationExercise.AddToCart1.AddFirstProduct;
import static POM.AutomationExercise.AddToCart1.FirstAddToCart;

public class AddFirstProductTest extends ProductPageTest{
    @Test (priority = '3')
    public static void firstProduct(){
        AddFirstProduct();
        FirstAddToCart();
    }
}
