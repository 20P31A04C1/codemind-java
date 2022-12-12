import java.util.Scanner;
class sample
{
    public static boolean isprime(int n)
    {
        int co=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            co++;
        }
        if(co==0)
        return true;
        else
        return false;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,d1=0,d2=0,i;
        t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n;
            n=sc.nextInt();
             for(i=n;;i--)
             {
                 if(isprime(i))
                 {
                  d1=i;
                  break;
                 }
             }
             for(i=n;;i++)
             {
                 if(isprime(i))
                 {
                   d2=i;
                   break;
                 }
             }
             if((n-d1)<=(d2-n))
               System.out.println(d1);
             else
                System.out.println(d2);
        }
        
        
    }
}