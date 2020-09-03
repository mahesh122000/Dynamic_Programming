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
	         int ans=0;
	         while(n>0)
	         {
	             n=n/5;
	             ans+=n;
	         }
	         System.out.println(ans);
	     }
	 }
}