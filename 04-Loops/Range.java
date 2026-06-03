import java.util.Scanner;
class Range12
{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Number");
 int m=sc.nextInt();
 System.out.println("Where you will stop????");
 int n=sc.nextInt();
 System.out.println("The starting is" +  m  + " Ending is " + n + " numbers");
 for(int i=m;i<=n;i++){
 System.out.println(i);
 }
}
}