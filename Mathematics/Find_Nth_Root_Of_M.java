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
	         double n=s.nextDouble();
	         int m=s.nextInt();
	         double val=1.0/n;
	         double k=Math.pow(m,val);
	         int q=(int)Math.ceil(k);
	         int p=(int)Math.floor(k);
	         if((int)(Math.pow(q,n))==m)
	         System.out.println(q);
	         else if((int)(Math.pow(p,n))==m)
	         System.out.println(p);
	         else
	         System.out.println("-1");
	     }
	 }
}