import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {


   int random=(int)(Math.random()*10);
        Scanner scn = new Scanner(System.in);
        boolean flag=true;

        while(flag)
        {
            System.out.print("guess the number");
            int num1= scn.nextInt();
            if(num1==random) {
                System.out.println("You win");
                flag = false;
            }
            else
            {

                if(num1<random)
                {
                    System.out.println("try a bigger number");
                }
                else if(num1>random)
                {
                    System.out.println("try a smaller number");
                }
            }
        }



        /*int s=0;
        int i=1;
        while(i<=10)
        {
            s= s+(i++);
        }
        System.out.println(s);
        */



        /*Fibonacci fib =new Fibonacci();
        fib.fibonacci(10); */


        /*Scanner scn = new Scanner(System.in);
        System.out.print("Enter the 1st Number : ");
        int num1= scn.nextInt();
        System.out.print("Enter the 2nd Number : ");
        int num2= scn.nextInt();
        System.out.print("Enter the 3rd Number : ");
        int num3= scn.nextInt();
        System.out.println("The Big Number is : "+ getBigNum(num1,num2,num3));
    }
    public static int getBigNum(int a, int b, int c){
        int lrg = a;
        if (lrg<b)
        {
            lrg= b;
        }
        if(lrg<c) {
            lrg = c;
        }
        return lrg;
    }*/
    }
}