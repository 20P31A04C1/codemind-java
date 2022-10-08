import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i=0,j=0,k=0,even[],odd[];
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        even=new int[n];
        odd=new int[n];
        for(i=0;i<n;i++)
        {
            if(a[i]%2!=0)
             even[j++]=a[i];
            else
             odd[k++]=a[i];
        }
        for(i=0;i<j;i++)
        {
            System.out.print(even[i]+" ");
        }
         for(i=0;i<k;i++)
        {
            System.out.print(odd[i]+" ");
        }
        sc.close();
    }
}