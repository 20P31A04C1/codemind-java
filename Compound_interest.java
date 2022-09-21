import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p,t,r;
        p=sc.nextDouble();
        t=sc.nextDouble();
        r=sc.nextDouble();
         double i=p*(Math.pow((1+t/100),r));
        System.out.format("%.2f",i);
        
    }
}