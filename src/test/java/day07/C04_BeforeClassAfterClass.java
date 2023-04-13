package day07;

import org.junit.*;

public class C04_BeforeClassAfterClass {
/* BeforeClass ve @AfterClass notasyonları sadece static methodlar ile çalışır.*/
  @BeforeClass
  public static void setup(){
      System.out.println("tüm testlerden önce çalışır");
      System.out.println("============");
  }
   @AfterClass
   public  static void teardown(){
       System.out.println("Tüm testlerden sonra bir kez çalışır");
       System.out.println("====================");
   }
   @Before
   public void setup01(){
       System.out.println("Her testten önce çalışır");

   }
  @After

  public void teardown01(){

      System.out.println("Her testten sonra çalışır");
  }
    @Test
    public void test01(){
        System.out.println("ilk test");
        System.out.println("===========");
    }
    @Test
    public void test02(){
        System.out.println("ikinci test");
        System.out.println("===========");

    }
  @Test
    public void test03(){
      System.out.println("üçüncü test");
      System.out.println("===========");
  }


}

