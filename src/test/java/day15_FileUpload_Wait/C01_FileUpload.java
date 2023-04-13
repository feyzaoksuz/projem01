package day15_FileUpload_Wait;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_FileUpload extends TestBase {
    @Test
    public void fileUpload(){
    /*Bir Web sayfasında upload işlemi yapmamız gerekirse;
    1-Öncelikle upload edeceğimiz webelemnti locate ederiz.
    2-Upload edeceğimiz dosya yolunu bir stringe assign ederiz.
    3-Loacte ettiğimiz webelemente sendkeys methodu ile dosyayolunu aldığımız string değişeni göndeririz.
     */

    //https://the-internet.herokuapp.com/upload adresine gidin

        driver.get("https://the-internet.herokuapp.com/upload");

        //logo.jpeg dosyasını yükleyin(upload)

        WebElement chooseFile=driver.findElement(By.id("file-upload"));
        bekle(3);

             String dosyaYolu ="C:/Users/lenovo/Desktop/logo.jpeg";

             //String dosyaYolu=System.getProperty("user.home")+//Desktop/logo.jpeg";

        // chooseFile.sendKeys(dosyaYolu);//Gönderilecek (upload) dosyanın adresini
        // choosefile butonuna sendKeys() methoduile yazıyoruz.

               bekle(3);

               driver.findElement(By.id("file-submit")).click();

               //“File Uploaded!” textinin görüntülendiğini test edin

        Assert.assertTrue(driver.findElement(By.xpath("//h3")).isDisplayed());


}}












