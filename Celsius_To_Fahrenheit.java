import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c;
        float f;
        c=sc.nextInt();
        f=(float)(9*c)/5+32;
        System.out.format("%.2f",f);
    }
}
