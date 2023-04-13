package day14_FakerClass_FileExist;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C02_Faker{
@Test
        public  void faker(){
    //1.Faker objesi oluştururuz.
    Faker faker=new Faker();
    //ya da Faker.instance( methodu ile de kullanabilirz.

   // Faker.instance(); instance static methoddur.sadece class ismiyle çağırabilirz.
///Firstname yazdıralım
    System.out.println("Fake firstname : "+faker.name().firstName());
    System.out.println(Faker.instance().name().firstName());

    //Lastname yazdıralım
    System.out.println(faker.name().lastName());
    //Kullanıcı adı yazdıralım
    System.out.println(faker.name().username());
    //Meslek ismi yazdıralım
    System.out.println(faker.name().title());
    System.out.println(faker.job().position());
    //Şehir ismi yazdıralım
    System.out.println(faker.address().city());
    //Ulke ismi yazdıralım
    System.out.println(faker.address().country());
    //adress yazdıralım
    System.out.println(faker.address().fullAddress());
    //telefon numarası yazdıralım
    System.out.println(faker.phoneNumber().cellPhone());
    //Rastgele 15 haneli bir numara
    System.out.println(faker.number().digits(15));
    //zipcode numarsı yazdıralım
    System.out.println(Faker.instance().address().countryCode());
    System.out.println(faker.address().zipCode());
    System.out.println(Faker.instance().internet().emailAddress());

}}
