import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,x[],s=0,c=0;
        float a;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            s=s+x[i];
        }
        a=(s/n);
        for(int i=0;i<n;i++)
        {
            if(x[i]>=a)
            c++;
        }
        System.out.print(c);
    }
    
}