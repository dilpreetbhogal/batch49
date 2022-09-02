public class Student {
    String name;
    int roll;

    public static void method1(){
        System.out.println("static method");
        // this is static method we can access without creating object
        //eg Student.method1();
        //static things always stored at class level



    }
    public void method2(){
        System.out.println("Instance method");
        // need instance to call this method

    }
}
