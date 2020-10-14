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
	         find(c.toCharArray(),0,c.length());
	         System.out.println();
	     }
	 }
	 static void find(char c[],int i,int n)
	 {
	     if(i==n)
	     {
	         System.out.print(new String(c)+" ");
	         return;
	     }
	     if(c[i]=='?')
	     {
	         c[i]='0';
	         find(c,i+1,n);
	         c[i]='1';
	         find(c,i+1,n);
	         c[i]='?';
	     }
	     else
	     {
	         find(c,i+1,n);
	     }
	 }
}