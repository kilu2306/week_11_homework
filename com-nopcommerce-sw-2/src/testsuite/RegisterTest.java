package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends BaseTest {
    String baseUrl="https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        //  click on the register link
        WebElement registerLink= driver.findElement(By.linkText("Register"));
        registerLink.click();
        //Verify the text ‘Register
        String actualText=driver.findElement(By.linkText("Register")).getText();
        String expactedText="Register";
        Assert.assertEquals("verify text",expactedText,actualText);
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        //click on the ‘Register’ link
        WebElement registerLink= driver.findElement(By.linkText("Register"));
        registerLink.click();
        //Select gender radio button
        driver.findElement(By.id("gender-female")).click();
        // Enter First name
        driver.findElement(By.id("FirstName")).sendKeys("kinjal");
        // Enter Last name
        driver.findElement(By.id("LastName")).sendKeys("savani");
        //Select Day Month and Year
        //find element
        WebElement day =driver.findElement(By.name("DateOfBirthDay"));
       WebElement month=driver.findElement(By.name("DateOfBirthMonth"));
       WebElement year=driver.findElement(By.name("DateOfBirthYear"));
       //creating select object for day drop doiwn manu
        Select select= new Select(day);
        select.selectByVisibleText("10");
        //selecting from month dropdown menu
        Select select1= new Select(month);
        select1.selectByVisibleText("April");
        //selecting from year drop down menu
        Select select2= new Select(year);
        select2.selectByVisibleText("1988");

        // Enter Email address
        driver.findElement(By.id("Email")).sendKeys("pkinju888@gmail.com");
        //enter password
        driver.findElement(By.id("Password")).sendKeys("123456");
        //confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
        // Click on REGISTER button
        driver.findElement(By.id("register-button")).click();

        //* Verify the text 'Your registration completed

        String actualText =driver.findElement(By.xpath("//div[@class='result']")).getText();
        //as per requirement
        String expactedText="Your registration completed";
        Assert.assertEquals("verify text",expactedText,actualText);

    }
    @After
    public void tearDown(){
//        closingBrowser();
    }
}
