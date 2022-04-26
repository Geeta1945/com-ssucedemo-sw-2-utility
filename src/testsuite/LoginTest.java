package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitypackage.Utility_Class;

public class LoginTest extends Utility_Class {
    @Before

    public void loadUrl() {

        openBrowser();
    }

    @Test
// finding product-1 once logged in for website
    public void userShouldLoginSuccessfullyWithValid() {
        sendTextToElement(By.id("user-name"), "standard_user");// entering username
        sendTextToElement(By.xpath("//input[@name='password']"), "secret_sauce"); //finding element and enetering password

        clickOnElement(By.xpath("//input[@class='submit-button btn_action']"));
        // first we find webelement with xpath in above line and then we used clicked method
        findAndMatchTitleOfTheProduct(By.linkText("Sauce Labs Backpack"), "Sauce Labs Backpack");

        /*

        String expectedMessage = "Sauce Labs Backpack";
        WebElement product1 = driver.findElement(By.linkText("Sauce Labs Backpack"));
        System.out.println(product1.getText());
        String product1ActualMessage = product1.getText();

        Assert.assertEquals(expectedMessage, product1ActualMessage);
         */


        // finding product-2 once logged in for website

        findAndMatchTitleOfTheProduct(By.linkText("Sauce Labs Bike Light"),"Sauce Labs Bike Light");


        //finding product-3 once logged in for website

        findAndMatchTitleOfTheProduct(By.xpath("//div[normalize-space()='Sauce Labs Bolt T-Shirt']"),"Sauce Labs Bolt T-Shirt");

        //finding product-4 once logged in for website

        findAndMatchTitleOfTheProduct(By.linkText("Sauce Labs Fleece Jacket"),"Sauce Labs Fleece Jacket");


        //finding product-5 once logged in for website

        findAndMatchTitleOfTheProduct(By.xpath("//div[normalize-space()='Sauce Labs Onesie']"),"Sauce Labs Onesie");


        //finding product-6 once logged in for website

        findAndMatchTitleOfTheProduct(By.xpath("//div[normalize-space()='Test.allTheThings() T-Shirt (Red)']"),"Test.allTheThings() T-Shirt (Red)");

    }


    @After

    public void closeSauceDemoUrl() {

        quitAllUrl();


    }


}
