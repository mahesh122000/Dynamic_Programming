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
	         String c=s.next();
	         find(c,"");
	         System.out.println();
	     }
	 }
	 static void find(String c,String s)
	 {
	     if(c.length()==1)
	     {
	         System.out.print("("+s+c+")");
	         return;
	     }
	     find(c.substring(1),s+c.charAt(0)+" ");
	     find(c.substring(1),s+c.charAt(0));
	 }
}

