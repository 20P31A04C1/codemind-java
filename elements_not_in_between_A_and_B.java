import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],A,B,count=0;
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        A=sc.nextInt();
        B=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]<A || a[i]>B)
            {
             System.out.print(a[i]+" ");
             count++;
            }
        }
        if(count==0)
        {
            System.out.print("-1");
            sc.close();
        }
        
    }
}