import java.util.Scanner;
class sample
{
    public static boolean ispalindrome(int n)
    {
    int r,sum=0,temp=n;
    while(n>0)
    {
        r=n%10;
        sum=sum*10+r;
        n=n/10;
    }
    if(temp==sum)
     return true;
    else
     return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i,c=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
         if(ispalindrome(a[i]))
         {
         c++;
         }
        }
        System.out.println(c);
    }
}