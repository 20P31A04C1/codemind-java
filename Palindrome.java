import java.util.Scanner;
class Palindrome
{
   public static boolean isPalindrome(int n)
   {
         int temp=n,r,sum=0;
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
       int n;
       n=sc.nextInt();
       if(isPalindrome(n))
           System.out.println("True");
       else
           System.out.println("False");
       sc.close();

   }
}
