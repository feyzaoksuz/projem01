package day07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C03_BeforeAfter {
    WebDriver driver;
    @Before
    public void setup() {
        driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(15));
    }
     @After
      public void teardown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
        }
        @Test
        public void test01(){
        driver.get("https://techproeducation.com/");
        }
        @Test
        public void test02(){
            driver.get("https://google.com/");
          }
}




