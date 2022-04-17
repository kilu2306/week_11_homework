package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginTest extends BaseTest {

    String baseurl="https://www.saucedemo.com/";
    @Before
    public void setUp(){
     openingBrowser(baseurl);
    }
@Test
    public void userSholdLoginSuccessfullyWithValid(){
        //find username element and  Enter “standard_user” username
    WebElement userName= driver.findElement(By.name("user-name"));
    userName.sendKeys("standard_user");
    //find password element and Enter “secret_sauce” password
    WebElement passWord= driver.findElement(By.name("password"));
    passWord.sendKeys("secret_sauce");
    // Click on ‘LOGIN’ button
    driver.findElement(By.name("login-button")).click();
    //verify text "PRODUCTS"
    String actaulText= driver.findElement(By.xpath("//span[@class='title']")).getText();
    String expactedText="PRODUCTS";
    Assert.assertEquals("verify text",expactedText,actaulText);

}
@Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
    //find username element and  Enter “standard_user” username
    WebElement userName= driver.findElement(By.name("user-name"));
    userName.sendKeys("standard_user");
    //find password element and Enter “secret_sauce” password
    WebElement passWord= driver.findElement(By.name("password"));
    passWord.sendKeys("secret_sauce");
    // Click on ‘LOGIN’ button
    driver.findElement(By.name("login-button")).click();
    //Verify that six products are displayed on page

    List<WebElement> listProducts= driver.findElements(By.className("inventory_item_name"));
    listProducts.size();
    System.out.println("number of products are displayed "+listProducts.size());

}
@After
    public void tearDown(){
        closingBrowser();
}
}

