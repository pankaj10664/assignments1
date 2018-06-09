import java.util.*;
class palindrome
{  
 public static void main(String args[])
 {  
  int r;
  int sum=0;     
  Scanner obj = new Scanner(System.in);
  System.out.println("Enter a no.=");
  int n= obj.nextInt();  
  int t=n;  
  while(t>0)
  {    
   r=t%10;
   sum=sum*10+r;    
   t=t/10;    
  }
  if(sum==n)
  {
	System.out.println(+n+" is a palindrome number");
  }  
  else
  {
	  System.out.println(+n+" is not a palindrome number");
  }
  }
}  