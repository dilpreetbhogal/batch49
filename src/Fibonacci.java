public class Fibonacci {

    public void fibonacci(int n)
    {
        int a=0;
        int b=1;
        System.out.print(a+",");
        System.out.print(b+"," );

        for (int i=3; i<=10;i++)
        {
            int c=a+b;
            System.out.print((a+b)+",");
            a=b;
            b=c;
        }

    }

}
