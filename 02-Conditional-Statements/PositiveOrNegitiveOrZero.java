import java.util.Scanner;
class PositiveOrNegitiveOrZero
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Eneter A Number");
	int num=sc.nextInt();
	if(num>0)
	{
	  System.out.println(num + "is a positive number");
	}
	else if(num<0)
	{
	  System.out.println(num + "is a negitive number");
	}
	else
	{
	  System.out.println(num + "is a zero");
	}
     }
}