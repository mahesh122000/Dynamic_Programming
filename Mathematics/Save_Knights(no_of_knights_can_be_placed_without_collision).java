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
	         int k=(n*n)/2;
	         if(k*2!=n*n)
	         k++;
	         if(n==2)
	         k=4;
	         System.out.println(k);
	     }
	 }
}