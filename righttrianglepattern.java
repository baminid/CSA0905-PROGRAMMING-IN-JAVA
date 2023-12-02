import java.util.*;
public class righttrianglePattern   
{   
public static void main(String args[])   
{   
  
int i, j, r; 
Scanner s=new Scanner(System.in);
System.out.println("enter rows");
r=s.nextInt(); 

for(i=0; i<r; i++)   
{   

for(j=0; j<=i; j++)   
{   
  
System.out.print("* ");   
}   

System.out.println();   
}   
}   
}  