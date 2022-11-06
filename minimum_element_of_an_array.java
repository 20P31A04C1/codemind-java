import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i,min;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        min=a[0];
        for(i=0;i<n;i++)
        {
            if(a[i]<min)
            min=a[i];
        }
        System.out.println(min);
        
    }
}