import java.util.Scanner;
class First
{

public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
int n,a=0,b=1,c=0;
n=sc.nextInt();
while(c<=n)
{
c=a+b;
a=b;
b=c;
}
if(n-a>b-n)
System.out.println(b);
else if(n-a ==b-n)
System.out.println(a+" "+b);
else
System.out.print(a);
}
}