import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[],n,i,sum=0,avg=0,c=0;
         
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
        avg=(int)sum/n;
        for(i=0;i<n;i++)
        {
            if(a[i]==avg)
            c=1;
        }
        if(c==1)
           System.out.println("True");
        else
            System.out.format("False");
    }
}
