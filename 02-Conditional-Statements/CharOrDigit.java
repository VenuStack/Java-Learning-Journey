import java.util.Scanner;
class CharOrDigit
{
  public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Eneter Digit Or Char");
	int ch=sc.next().charAt(0);
	if(ch>='0' && ch<='9')
	{

	   System.out.println(ch + "Is a character");
	}	else	
	{
	   System.out.println(ch + "Is a digit");
	}
   }
}