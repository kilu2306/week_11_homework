package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTes extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //find computer element and click on computer
        WebElement computerEelement = driver.findElement(By.linkText("Computers"));
        computerEelement.click();
        // Verify the text ‘Computers
        String actualText = driver.findElement(By.linkText("Computers")).getText();
        String expactedtext = "Computers";
        Assert.assertEquals("verify elemnt text", expactedtext, actualText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //find electronics element and click
        WebElement electronicElement = driver.findElement(By.linkText("Electronics"));
        electronicElement.click();
        String actualText = driver.findElement(By.linkText("Electronics")).getText();
        String expactedTest = "Electronics";
        Assert.assertEquals("verify element text", expactedTest, actualText);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //find appearel element and click
        WebElement apparelElement = driver.findElement(By.linkText("Apparel"));
        apparelElement.click();
        //  Verify the text ‘Apparel’
        String actualText = driver.findElement(By.linkText("Apparel")).getText();
        String expactedTesxt = "Apparel";
        Assert.assertEquals("varify  element text ", expactedTesxt, actualText);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        //find element and click on the ‘Digital downloads’ Tab
        WebElement digitalDownloads= driver.findElement(By.linkText("Digital downloads"));
        digitalDownloads.click();
        // Verify the text ‘Digital downloads’
        String actualText=driver.findElement(By.linkText("Digital downloads")).getText();
        String expactedText="Digital downloads";
        Assert.assertEquals("verify text",expactedText,actualText);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //click on the ‘Books’ Tab
        WebElement books= driver.findElement(By.linkText("Books"));
        books.click();
        // Verify the text ‘Books’
        String actaulText= driver.findElement(By.linkText("Books")).getText();
        String expactedText="Books";
        Assert.assertEquals("verify text",expactedText,actaulText);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        // click on the ‘Jewelry’ Tab
        WebElement jewelry=driver.findElement(By.linkText("Jewelry"));
        jewelry.click();
        // Verify the text ‘Jewelry’
        String actaulText= driver.findElement(By.linkText("Jewelry")).getText();
        String expactedText="Jewelry";
        Assert.assertEquals("verify text",expactedText,actaulText);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        // click on the ‘Gift Cards’ Tab
        WebElement giftCard=driver.findElement(By.linkText("Gift Cards"));
        giftCard.click();
        // Verify the text ‘Gift Cards’
        String actualText= driver.findElement(By.linkText("Gift Cards")).getText();
        String expactedText="Gift Cards";
        Assert.assertEquals("verify text",expactedText,actualText);
    }
    @After
    public void tearDown(){
        closingBrowser();
    }
}





