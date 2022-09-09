package ru.gb.javalvl3.almazbakiev;

public class ClassWithMethods {

    @BeforeSuite
    public void method0(){
        System.out.println("BeforeSuite");
    }

    @Test(order = 2)
    public static void method1(){
        System.out.println("order = 2");
    }

    @Test()
    protected void method2(){
        System.out.println("order = 1");
    }

    @Test(order = 4)
    protected void method3(){
        System.out.println("order = 4");
    }

    @Test(order = 4)
    public void method4(){
        System.out.println("order = 4");
    }

    @Test(order = 10)
    protected void method5(){
        System.out.println("order = 10");
    }

    @Test(order = 10)
    private void method6(){
        System.out.println("order = 10");
    }

    @Test(order = 8)
    static void method7(){
        System.out.println("order = 8");
    }

    @Test(order = 7)
    private void method8(){
        System.out.println("order = 7");
    }

    @AfterSuite
    void method9(){
        System.out.println("AfterSuite");
    }
}
