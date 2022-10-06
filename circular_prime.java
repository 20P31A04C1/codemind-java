import java.util.*;
class CircularPrime {
   public static boolean isPrime(int n)
	{
	    int i,count=0;
	    for(i=2;i<=(int)Math.sqrt(n);i++)
	     {
	         if(n%i==0)
	         {
	             count++;
	             break;
	         }
	     }
	     if(count==0)
	       return true;
	     else
	       return false;
	}
	static int reverse(int p)
	{
	    int i,sum=0,r;
	    while(p>0)
	    {
	        r=p%10;
	        sum=sum*10+r;
	        p=p/10;
	    }
	    return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int m;
	    m = sc.nextInt();
	    if(!isPrime(m))
	        System.out.println("not prime");
	    else if(isPrime(reverse(m)))
	        System.out.println("circular prime");
	    else
	    System.out.println("prime but not a circular prime");
	}
}