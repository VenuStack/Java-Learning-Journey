import java.util.Scanner;
class LowerOrUpperOrSpecial
{
  public static void main(String args[])
  {
   Scanner sc=new Scnnaer(System.in);
   System.out.println("Enter Character");
   char ch=sc.next().charAt(0);
   if(ch>='a' && ch<='z')
   {
	System.out.println(ch + " is lower case);
	}
   else if(ch>='A' && ch<='Z')
   {
	System.out.println(ch + " is upper case);
}
   else {
       System.out.println(ch + is special symbol);
}
}
}
	