package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    //public static WebDriver driver;
    String baseurl="https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp(){
        openingBrowser(baseurl);
    }
    @Test
     public void userSholdLoginSuccessfullyWithValidCredentials(){
        //find username field element and pass the value
        WebElement userName= driver.findElement(By.name("txtUsername"));
        userName.sendKeys("Admin");

        // find password field element and send key to field
        WebElement passWord= driver.findElement(By.name("txtPassword"));
        passWord.sendKeys("admin123");
        // click on submit button
        driver.findElement(By.id("btnLogin")).click();
        // Verify the ‘Welcome’ text is display
        String actualtext=driver.findElement(By.id("welcome")).getText();
        //to get the welcome string
        actualtext.substring(0,7);
        String expactedText="Welcome";
        Assert.assertEquals("validation of text",expactedText,actualtext.substring(0,7));

    }
    @After
    public void closing(){
        closingBrowser();
    }
}
