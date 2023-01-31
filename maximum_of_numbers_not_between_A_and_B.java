import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,a,b,c=0,r,x[];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        r=x[0];
        for(int i=0;i<n;i++)
        {
            if(r>x[i])
            r=x[i];
        }
        for(int i=0;i<n;i++)
        {
            if(x[i]<a || x[i]>b)
            {
                c++;
                if(r<x[i])
                r=x[i];
            }
        }
        if(c!=0)
          System.out.println(r);
        else
          System.out.println("-1");
        
    }
}