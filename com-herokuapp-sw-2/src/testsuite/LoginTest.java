package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl="http://the-internet.herokuapp.com/login";

    @Before
    public void setUp(){
        openingBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        //find email eleemnt and enter  “tomsmith” username
        WebElement userName= driver.findElement(By.id("username"));
        userName.sendKeys("tomsmith");
        //find password element and Enter “SuperSecretPassword!” password
        WebElement passWord= driver.findElement(By.id("password"));
        passWord.sendKeys("SuperSecretPassword!");
        //click on log in button
        driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
       //Verify the error message “Your username is invalid!”
        //find element for error message
        String actualtext =driver.findElement(By.xpath("//div[@class=\"example\"]/child::h2")).getText();
        String expactedText="Secure Area";
        Assert.assertEquals("verify text",expactedText,actualtext);

    }
    @Test
    public void verifyTheUsernameErrorMessage(){
        //find email eleemnt and  Enter “tomsmith” username
        WebElement userName= driver.findElement(By.id("username"));
        userName.sendKeys("tomsmith1");
        //find password element and Enter “SuperSecretPassword” password
        WebElement passWord= driver.findElement(By.id("password"));
        passWord.sendKeys("SuperSecretPassword!");
        //click on log in button
        driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
        //* Verify the error message “Your password is invalid!”
        //find element for error message
        String actualtext =driver.findElement(By.id("flash")).getText();
        String expactedText="Your username is invalid!";
        Assert.assertEquals("verify text",expactedText,actualtext);


    }

        @Test
    public void verifyThePasswordErrorMessag(){
        //find email eleemnt and  Enter “tomsmith” username
        WebElement userName= driver.findElement(By.id("username"));
        userName.sendKeys("tomsmith");
        //find password element and Enter “SuperSecretPassword” password
        WebElement passWord= driver.findElement(By.id("password"));
        passWord.sendKeys("SuperSecretPassword");
        //click on log in button
        driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
        //* Verify the error message “Your password is invalid!”
        //find element for error message
        String actualtext =driver.findElement(By.id("flash")).getText();
        String expactedText="Your password is invalid!";
        Assert.assertEquals("verify text",expactedText,actualtext);

    }
    @After
    public void tearDown(){
        closingBrowser();
    }


}
