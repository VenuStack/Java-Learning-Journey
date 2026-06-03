import java.util.Scanner;
class Reverse
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Number");
   int num=sc.nextInt();
   int i=num;
   while(i>=1)
   {
      System.out.println(i);
      i--;
    }
  }
}
