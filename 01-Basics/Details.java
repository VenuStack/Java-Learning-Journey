import java.util.Scanner;
class Details
{
	public static void main(String [] args)
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter Name..");
	   String name=sc.next();
 	   System.out.print("Enter Age..");
	   int age=sc.nextInt();
           System.out.print("Enter Gender..");
	   char Gender=sc.next().charAt(0);
           System.out.print("Enter Degree..");
	   String D=sc.next();
           System.out.print("Enter Strem..");
	   String Strem=sc.next();
	   System.out.print("Enter Year Of Passed Out..");
	   int yop=sc.nextInt();
	   System.out.print("Enter CGPA..");
	   float cgpa=sc.nextFloat();
	   System.out.print("Pass Result..");
	   boolean res=sc.nextBoolean();
	   System.out.println("Your overall CGPA is Very good");
	}
}
 



