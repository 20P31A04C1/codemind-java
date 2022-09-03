import java.util.Scanner;
class sample
{
   
 public static boolean ispalindrome(int n )
    {
        
     int  temp=n;
     int r,sum=0;
     while(n>0)
     {
     r=n%10;
     sum=sum*10+r;
     n=n/10;
     }
    if(sum==temp)
    return true;
    else
    return false;
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int m,n,i ;
    n=sc.nextInt();
    m=sc.nextInt();
    for(i=n;i<=m;i++)
    {
    
    if(ispalindrome(i))
     
    {
     System.out.print(i+" ");
    
    }
    }
    
    }
}