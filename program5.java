import java.util.*;
class Reverse
 {
 public static void main(String[] args) {

         int reversed = 0;
		 Scanner obj = new Scanner(System.in);
  System.out.println("Enter a no.=");
  int n= obj.nextInt();  
  int t=n;  

        while(n!= 0) {
            int digit = n% 10;
            reversed = reversed * 10 + digit;
            n/= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}