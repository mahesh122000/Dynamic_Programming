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
	         long n=s.nextLong();
	         System.out.println(find(n));
	     }
	 }
	 static String find(long n)
	 {
	     return n==0?"":find((n-1)/26)+(char)((n-1)%26+'A');
	 }
}