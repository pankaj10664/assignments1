import java.util.*;
class Biggest
 {
	public static void main(String args[])
	{
Scanner obj=new Scanner(System.in);
System.out.println("enter three no");
int a=obj.nextInt();
int b=obj.nextInt();
int c= obj.nextInt();
if ( a>b&& a>c )
         System.out.println("First number is largest.");
      else if ( b>a&& b>c )
         System.out.println("Second number is largest.");
      else if ( c> a && c > a )
         System.out.println("Third number is largest.");
      else   
         System.out.println("Entered numbers are not distinct.");
   }
}