package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseurl="https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp(){
        openingBrowser(baseurl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){

        //fing element for forgot password link
        WebElement forgetPasswordLink= driver.findElement(By.linkText("Forgot your password?"));
       forgetPasswordLink.click();
        String actualText= driver.findElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]")).getText();
        String expactedTest="Forgot Your Password?";
        Assert.assertEquals("validation for text",expactedTest,actualText);
    }


@After
    public void closing(){
        closingBrowser();
}

}

