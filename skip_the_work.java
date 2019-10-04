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
	 {int n=s.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++)
	 a[i]=s.nextInt();
	 int inc=a[0];
	 int exc=0;
	 for(int i=1;i<n;i++)
	 {int res=a[i]+Math.min(inc,exc);
	 exc=inc;
	 inc=res;
	 }
	 System.out.println(Math.min(inc,exc));}
}}