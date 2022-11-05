import java.util.Scanner;
class sample
{
    public static boolean isprime(int n)
    {
        int i,count=0;
        for(i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            count++;
        }
        if(count==0)
         return true;
        else
         return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c=0,s;
        a=sc.nextInt();
        b=sc.nextInt();
        s=a+b;
        for(int i=s+1;;i++)
        {
            c++;
            if(isprime(i))
            break;
        }
        System.out.println(c);
    }
}