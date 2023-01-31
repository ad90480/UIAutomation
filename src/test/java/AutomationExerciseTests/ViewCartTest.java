package AutomationExerciseTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static POM.AutomationExercise.OpenViewCart.*;

public class ViewCartTest extends AddSecondProductTest{

    @Test(priority = '5')
    public static void cart() throws InterruptedException {
        OpenCart();
        Checkout();
        Billing();
        waitBrowser(3000);
        Assert.assertEquals("Rs. 900",driver.findElement(By.xpath("//p[@class='cart_total_price' and text()='Rs. 900' ]")).getText());
        closeBrowser();
    }
}
