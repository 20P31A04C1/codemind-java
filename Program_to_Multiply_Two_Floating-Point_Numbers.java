import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,pro;
        a=sc.nextFloat();
        b=sc.nextFloat();
        pro=(float)(a*b);
        System.out.format("%.2f",pro);
        sc.close();
    }
}