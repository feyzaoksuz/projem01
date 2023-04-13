package day07;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C02_BeforeAfter {


    @Before

    public void setup(){

        System.out.println("Her method öncesi bir kez çalışır");

    }
    @After
    public void teardown(){

    }



    @Test
    public void test01() {
        System.out.println("ilk test ");

    }
        @Test
        public void test02(){
            System.out.println("ikinci test");





        }


    }



