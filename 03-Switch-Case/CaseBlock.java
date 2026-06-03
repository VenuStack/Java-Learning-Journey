import java.util.Scanner;
class CaseBlock
{
   public static void main(String args[])
   {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter Number");
     int n=sc.nextInt();
     switch(n)
     {
	case 1:{System.out.println("Case 1 Block");} break;
	case 2:{System.out.println("Case 2 Block");} break;
	case 3:{System.out.println("Case 3 Block");} break;
	case 4:{System.out.println("Case 4 Block");} break;
        default:{System.out.println("Default Block");} 
     }
  }
}