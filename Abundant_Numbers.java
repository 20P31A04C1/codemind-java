import java.util.Scanner;
class AbundantNumber
{
  public static String isAbundant(int x)
  {
      int sum=1,i;
	  for(i=2;i<=x/2;i++)
	  {
	      if(x%i==0)
		     sum=sum+i;
	  }
	  if(sum>x)
		return "True";
	  else
		return "False";
  }
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  System.out.print(isAbundant(n));
	  sc.close();
  }
}
