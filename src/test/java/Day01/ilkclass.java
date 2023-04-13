package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ilkclass {


        public static void main(String[] args) {
            // System.setProperty("webdriver.chrome.driver", "C:\\Users\\...\\Documents\\chromedriver.exe");
            ChromeOptions ops = new ChromeOptions();
            ops.addArguments("--remote-allow-origins=*");

            WebDriver driver = new ChromeDriver(ops) ;
            driver.get("https://www.hepsiburada.com/");






//System.setProperty java uygulamalarında sistem özelliklerini ayarlamak için kullanılır
//Bu method ile class'ımıza webdriver'in fiziki yerini belirtiriz
//Key, value olarak önce isim sonra driver'imizin yolunu belirtiriz
        System.out.println(System.getProperty("edgeDriver"));
                //getProperty methodu ile "Key değerini girerek "value"'ya ulaşabilirim
                //Boş bir browser açar
                driver.get("https://techproeducation.com");//get() methodu ile adresini belittiğimiz sayfaya gideriz
                System.out.println("Sayfa Başlığı = "+driver.getTitle()); // içinde bulunduğumuz sayfanın başlığını verir
                System.out.println("Sayfa Url'i = "+driver.getCurrentUrl()); //içinde bulunduğumuz sayfanın url'i verir
                //System.out.println(driver.getPageSource());//içinde bulunduğumuz sayfanın html kodlarını verir
                }}

