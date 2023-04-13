package day06;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C01_MavenIlkTest {


    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //https://www.amazon.com/sayfasına gidelim.
        driver.get("https://www.amazon.com/");

        //Arama kutusunu locate edelim.
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'] "));

        //"Samsung headphones" ile arama yapalım
        aramaKutusu.sendKeys("Samsung headphones" + Keys.ENTER);


        //Bulunan sonuç sayısını yazdıralım.

        WebElement aramaSonucu = driver.findElement(By.xpath(("//div[@class='sg-col-inner']")));
        System.out.println("aramaSonucu=" + aramaSonucu.getText());

        //İlk ürünü tıklayalım.
        List<WebElement> urunlistesi=driver.findElements(By.xpath("(//img[@class='s-image'])[1]"));

        urunlistesi.get(0).click();


        // Sayfadaki tüm başlıkları yazdıralım
 List<WebElement>basliklar =driver.findElements(By.xpath("//h1"));

       for(WebElement w:basliklar) {
           System.out.println(w.getText());
       }


        System.out.println(basliklar.get(0).getText());
        System.out.println(basliklar.get(1).getText());
        System.out.println(basliklar.get(2).getText());
        System.out.println(basliklar.get(3).getText());

   //Sayfayı kapatın
        driver.close();




}}
