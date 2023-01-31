package AutomationExerciseTests;

import org.testng.annotations.Test;

import static POM.AutomationExercise.ProductPage.OpenProductPage;
import static POM.AutomationExercise.ProductPage.RefreshProductPage;

public class ProductPageTest extends LoginTest {


    @Test(priority = '2')
    public static void product(){
        OpenProductPage();
        RefreshProductPage();

    }
}
