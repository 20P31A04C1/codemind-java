import java.util.Scanner;
class DisariumDemo
{
   public static boolean isDisarium(int n)
   {
         int d=(int)Math.log10(n)+1;
		 
		 int sum=0,r,temp=n;
		 while(n>0)
		 {
		   r=n%10;
		   sum=sum+(int)Math.pow(r,d);
		   n=n/10;
		   d--;
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
	 
	   if(isDisarium(n))
	       System.out.println("True");
	   else
	       System.out.println("False");
   }

}
