import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i,c=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(i=1;i<n-1;i++)
        {
            if(a[i+1]%2!=0 && a[i-1]%2!=0)
            {
                if(a[i]%2!=0)
                c++;
            }
        }
        System.out.println(c);
    }
}