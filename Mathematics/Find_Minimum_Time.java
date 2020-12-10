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
	         int a=s.nextInt();
	         int b=s.nextInt();
	         int n=s.nextInt();
	         int c=Math.min(a,b);
	         int d=Math.max(a,b);
	         int k=(d*n)/(c+d);
	         System.out.println(Math.min(Math.max(c*k,d*(n-k)),Math.max(c*(k+1),d*(n-k-1))));
	     }
	 }
}