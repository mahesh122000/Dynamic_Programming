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
	         int a[]=new int[n];
	         for(int i=0;i<n;i++)
	         a[i]=s.nextInt();
	         int k=s.nextInt();
	         int ans=0;
	         int start=0;
	         int m=0;
	         for(int end=0;end<n;end++)
	         {
	             if(a[end]==1)
	             {}
	             else
	             {
	                 if(m<k)
	                 m++;
	                 else
	                 {
	                     while(m==k)
	                     {
	                         if(a[start]==0)
	                         m--;
	                         start++;
	                     }
	                     m=k;
	                 }
	             }
	             ans=Math.max(ans,end-start+1);
	         }
	         System.out.println(ans);
	     }
	 }
}