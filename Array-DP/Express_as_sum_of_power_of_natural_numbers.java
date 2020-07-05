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
	         int m=s.nextInt();
	         int k=last(n,m);
	         ans=0;
	         long a[]=new long[n+1];
	         a[0]=1;
	         for(int i=1;i<=k;i++)
	         {
	             for(int j=n;j>=1;j--)
	             {
	                 int v=pow(i,m);
	                 if(j>=v)
	                 {
	                     a[j]+=a[j-v];
	                 }
	             }
	             
	         }
	         System.out.println(a[n]);
	     }
	 }
}