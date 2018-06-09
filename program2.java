import java.util.*;
class Prime
{
	public static void main(String args[])
	{
Scanner obj=new Scanner(System.in);
System.out.println("enter a no."); 
int z=obj.nextInt();  
  int i,m=0,flag=0;       
  m=z/2;      
  if(z==0||z==1)
  {  
   System.out.println("this is not prime number");      
  }
  else
  {  
   for(i=2;i<=m;i++)
   {      
    if(z%i==0){      
     System.out.println("this is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println("this is prime number"); }  
  }
}   
}   
	
