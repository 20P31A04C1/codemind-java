import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,j,k,count=0,flag=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]!=-999)
            {
                count=1;
                for(j=0;j<n;j++)
                {
                    if(x[i]==x[j] && i!=j)
                    {
                        count++;
                        x[j]=-999;
                    }
                }
                if(count==k)
                {
                    System.out.print(x[i]+" ");
                    flag=1;
                }
            }
        }
        if(flag==0)
        System.out.print("-1");
    }
}