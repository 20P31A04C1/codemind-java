import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,t;
        t=sc.nextInt();
        while(t>0)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            c=a+b;
            System.out.println(c);
            t--;
        }
    }
}