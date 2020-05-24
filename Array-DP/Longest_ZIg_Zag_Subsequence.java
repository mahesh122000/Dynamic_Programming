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
	     int m=s.nextInt();
	     int a[]=new int[m];
	     for(int i=0;i<m;i++)
	     a[i]=s.nextInt();
	     int p=1,n=1;
	     for(int i=1;i<m;i++)
	     {if(a[i-1]<a[i])
	     p=n+1;
	     if(a[i]<a[i-1])
	     n=p+1;
	     }
	     System.out.println(Math.max(p,n));
	 }
	 }
}