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
	         find(c,0,c.length()-1,c.length());
	         System.out.println();
	     }
	 }
	 static void find(String s,int i,int j,int n)
	 {
	     if(i>j)
	     return ;
	     for(int k=0;k<n;k++)
	     {
	         if(k==i||k==j)
	         System.out.print(s.charAt(k));
	         else
	         System.out.print(" ");
	     }
	     find(s,i+1,j-1,n);
	     if(i==j)
	     return ;
	     else if(i<j)
	     {
	         for(int k=0;k<n;k++)
	         {
	         if(k==i||k==j)
	         System.out.print(s.charAt(k));
	         else
	         System.out.print(" ");
	         }
	     }
	 }
}