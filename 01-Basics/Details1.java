import java.util.Scanner;
class Details1
{
	public static void main(String [] args)
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter Name..");
	   String name=sc.next();
	   System.out.println("Name :- " + name);
 	   System.out.print("Enter Age..");
	   int age=sc.nextInt();
	   System.out.println("Age :- " + age);
           System.out.print("Enter Gender..");
	   char Gender=sc.next().charAt(0);
	   System.out.println("Gender :- " + Gender);
           System.out.print("Enter Degree..");
	   String D=sc.next();
	   System.out.println("Degree :- " + D);
           System.out.print("Enter Strem..");
	   String Strem=sc.next();
	   System.out.println("Strem :- " + Strem);
	   System.out.print("Enter Year Of Passed Out..");
	   int yop=sc.nextInt();
	   System.out.println("Year Of Passed Out :- " + yop);
	   System.out.print("Enter CGPA..");
	   float cgpa=sc.nextFloat();
	   System.out.println("CGPA :- " + cgpa);
	   System.out.print("Result..");
	   boolean res=sc.nextBoolean();
	   System.out.println("Result :- " + res);
	   System.out.println("Your overall CGPA is Very good");
	}
}
 



