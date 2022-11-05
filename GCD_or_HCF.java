import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,gcd,min;
        m=sc.nextInt();
        n=sc.nextInt();
        if(m<n)
        min=m;
        else
        min=n;
        for(i=min;i>0;i--)
        {
            if(m%i==0 && n%i==0)
            break;
        }
        System.out.println(i);
    }
}