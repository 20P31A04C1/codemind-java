import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[],n,i,sum=0;
        double avg=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i=i+1)
        {
             sum=sum+a[i];
        }
        avg=(double)sum/n;
        System.out.format("%.2f",avg);
        
    }
}
