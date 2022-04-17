package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl="https://demo.nopcommerce.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void verifyUserShouldNavigateLoginPageSuccessfully() {
        // find log in link element and click on link
        WebElement logIn= driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
        logIn.click();
        //this is from requitement
        String expectedText = "Welcome, Please Sign In!";
        //find the welcome text element and get the taxts
        WebElement actualTextelement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualText =actualTextelement.getText();

        //validate actual and expected text
        Assert.assertEquals("not navigated to log in page",expectedText,actualText);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        WebElement logInLink = driver.findElement(By.linkText("Log in"));
        logInLink.click();
        // find emailfield element
        WebElement email = driver.findElement(By.name("Email"));
        //provide emailaddress to the field
        email.sendKeys("pkinju108@gmail.com");
        //find password field element
        WebElement passWord = driver.findElement(By.id("Password"));
        //provide password to the field
        passWord.sendKeys("123456");
        //find log in element and click on login button
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        //Verify the ‘Log out’ text is display
        //find logout element
        WebElement logOut = driver.findElement(By.linkText("Log out"));
        //get text on logout element
        String actualText=logOut.getText();
        System.out.println(actualText);
        String expactedText= "Log out";
        Assert.assertEquals("verifying logOutTest:",expactedText,actualText);
    }
    @Test
    public void verifyTheErrorMessage(){
        WebElement logInLink = driver.findElement(By.linkText("Log in"));
        logInLink.click();
        //this is from requitement
        driver.findElement(By.name("Email")).sendKeys("kinjal109@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Prime123");
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        //actaultext per requirement
        String actualtext=driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")).getText();
        String expactedTestelemnt = "Login was unsuccessful. Please correct the errors and try again.\n"+"No customer account found";
        Assert.assertEquals("error message not dsiplayed ", expactedTestelemnt, actualtext);
    }
    @After
    public void tearDown() {
//      closingBrowser();
    }

}
