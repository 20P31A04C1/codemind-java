import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,i,j,a,b;
        t=sc.nextInt();
        for(i=0;i<t;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            int c=0;
            for(j=a;j<=b;j++)
            {
                if(j%10==2||j%10==3||j%10==9)
                c++;
            }
            System.out.println(c);
        }
    }
}