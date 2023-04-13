package day14_FakerClass_FileExist;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

public class C01_FileExist {
      /*
    Masaüstünde "logo.jpeg" dosyası oluşturun.
    Bu dosyanın varlığını doğrulayın.
     */

    @Test
    public void fileExistTest() {
        String userDIR = System.getProperty("user.dir");//C:\Users\TechProEd\IdeaProjects\B129SeleniumMavenJunit
        //IDE proje yolunu dinamik olarak verir

        String userHOME = System.getProperty("user.home");//C:/Users/TechProEd(kullanıcı adı)
        //Kullanıcı adı yolunu dinamik olarak verir

        boolean isExist = Files.exists(Paths.get("C:/Users/lenovo/Desktop/JİRA.docx"));
        System.out.println("isExist = " + isExist);
        assertTrue(isExist);

        /*
        Fail ise: Dosya masaüstünde değil, dosya adı yanlış, yada arada onedrive gibi ekstra dosyalar olabilir.
         */

    }
}