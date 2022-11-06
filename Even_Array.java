import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],c=0;
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if((a[i])%2==0)
            c++;
        }
        if(c==n)
        System.out.println("True");
        else 
        System.out.println("False");
    }
}