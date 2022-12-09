import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],a,b,i,max=0,n,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]>=a && x[i]<=b)
            {
            c++;
            if(x[i]>max)
            max=x[i];
            }
        }
        if(c==0)
        System.out.print(-1);
        else
        System.out.print(max);
    }
}