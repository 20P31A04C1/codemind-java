import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[],n,A,B,sum=0;
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
            sum=sum+a[i];
        }
        System.out.println(sum);
        sc.close();
    }
}