import java.util.Scanner;
class SumNumbers
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
   	System.out.pritnln("Enter start value..");
	int m=sc.nextInt();
	System.out.println("Enter end value...");
	int n=sc.nextInt();
 	sum=0;
	for(int i=m;i<=n;i++)
	{
 	   sum=sum+i;
	 }
	 System.out.println("Sum of the " + m + " and " + n + " is " + sum);