import java.util.Scanner;
class sam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,a[],c=0,s=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            c++;
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2!=0 && i%2!=0)
            s++;
        }
        if(c==s)
        System.out.println("True");
        else
        System.out.println("False");
    }
}