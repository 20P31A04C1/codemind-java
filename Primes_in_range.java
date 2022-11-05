import java.util.Scanner;
class sample
{
    public static boolean isprime(int n)
    {
        int co=0,i;
        for(i=2;i<=(int)Math.sqrt(n);i++)
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
        int i,m,n,count=0;
        m=sc.nextInt();
        n=sc.nextInt();
        if(m==1)
	     m=2;
        for(i=m;i<=n;i++)
        {
            if(isprime(i))
            {
            count++;
            }
        }
        System.out.print(count);
    }
}