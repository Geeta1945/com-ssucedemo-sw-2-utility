package utilitypackage;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility_Class extends BaseTest {
    public void clickOnElement(By by) {
        // find log in link and click on login link

        driver.findElement(by).click();
    }

    public void findAndMatchTitleOfTheProduct(By by, String message){

        Assert.assertEquals(message,getTextFromElement(by));

        String expectedMessage = "Sauce Labs Backpack";
        WebElement product1 = driver.findElement(By.linkText("Sauce Labs Backpack"));
        System.out.println(product1.getText());
        String product1ActualMessage = product1.getText();

        Assert.assertEquals(expectedMessage, product1ActualMessage);

    }

    public String getTextFromElement(By by){
        return driver.findElement(by).getText();

    }


    public void sendTextToElement(By by,String str)
    {
        driver.findElement(by).sendKeys(str);
    }



}
