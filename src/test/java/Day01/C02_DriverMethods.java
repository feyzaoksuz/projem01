package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



    public class C02_DriverMethods {
        public static void main(String[] args) {
            System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));


            //Boş bir browser açar
            driver.get("https://www.google.com");//Gitmek istediğimiz ayfayı belirtiriz
            System.out.println("Sayfa başlığı: " + driver.getTitle());//driver.getTitle() sayfa başlığını getirir
            System.out.println("Sayfa adresi(URL): " + driver.getCurrentUrl());//driver.getCurrentUrl() sayfa adresini getirir
            //System.out.println(driver.getPageSource()); driver.getPageSource() ==> Sayda kaynak kodlarını getirir.
            System.out.println(driver.getWindowHandle());//Sayfanın(Window) hash değerini getirir.
            // Bu hash değerleri ile başka sayfadan bu sayfaya direkt dönebilmeyi sağlar.
            //(Sayfalar arası geçiş)


}}
