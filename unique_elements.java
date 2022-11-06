import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,a[];
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]!=-999)
            {
                for(j=0;j<n;j++)
                {
                    if(a[i]==a[j] && i!=j)
                    {
                        a[j]=-999;
                    }
                }
                System.out.print(a[i]+" ");
            }
        }
           
    }
}
