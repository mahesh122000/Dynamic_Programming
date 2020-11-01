import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         int n=s.nextInt();
	         if(find(n))
	         System.out.println("Yes");
	         else
	         System.out.println("No");
	     }
	 }
	 static boolean find(int n)
	 {
	     if(n<=3)
	     return false;
	     if(n%2==0)
	     return true;
	     else
	     return prime(n-2);
	 }
	 static boolean prime(int n)
	 {
	     if(n<=1)
	     return false;
	     for(int i=3;i*i<=n;i+=2)
	     {
	         if(n%i==0)
	         return false;
	     }
	     return true;
	 }
}