import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i,max;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        max=a[0];
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
            max=a[i];
        }
        System.out.println(max);
        
    }
}