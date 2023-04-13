package day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.junit.Assert.*;

public class C01_Assertion {
    //2)asagıdakı adları kullanarak 3 test metodu olusturun ve gereklı testleri yapın
    //   - title test ==> Sayfa baslıgının "amazon "oldugunu test edin
    // - image test ==> amazon resminin görüntülendiğini (isDisplayed()) test edin
// search Box ın erişilebilir oldugunu test edin (isEnabled)
//WrongTitleTest=> Sayfa baslıgının "amazon olmadıgını dogrulayın.

    //1)https://amazon.com adresine gidin
WebDriver driver;
    @Before
    public void setUp() {


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(15));
        driver.get("https://amazon.com/");
    }

   @After
     public void teardown() throws InterruptedException {
   Thread.sleep(3000);
   driver.close();

   }
    @Test// Title test=> sayfa baslıgı "amazon" kelimesini içerip içermediğini test edin
    public void test01(){
        String actualTitle= driver.getTitle();
        String expectedTitle="Amazon.com";
        boolean iceriyorMu =actualTitle.contains("expectedTitle");
        Assert.assertFalse(iceriyorMu);

    }

    @Test//image Test => Amazon logosunun görüntülendiğini (isDisplayed()) test edin
    public void test02() {
        WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
        assertTrue(logo.isDisplayed());
    }

    @Test//Search Box 'in erisilebilir oldugunu test edin(isEnabled())
    public void test03() {
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        assertTrue(searchBox.isEnabled());
    }

    @Test//wrongTitleTest => Sayfa basliginin “amazon” içermediğini doğrulayın
    public void test04() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "amazon";
        assertFalse(actualTitle.contains(expectedTitle));
    }
}





