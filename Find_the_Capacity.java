import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s,t,b,cap,res;
        s=sc.nextInt();
        t=sc.nextInt();
        b=sc.nextInt();
        cap=2*s*t*b*512;
        res=cap/1024;
        System.out.println(res+"KB");
    }
    
}