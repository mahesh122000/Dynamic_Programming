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
	         int b[]=new int[n];
	         int c[]=new int[n];
	         int k=s.nextInt();
	         for(int i=0;i<n;i++)
	         {
	             a[i]=s.nextInt();
	             b[i]=a[i];
	             c[i]=1;
	         }
	         for(int i=n-1;i>=0;i--)
	         {
	             int val=Integer.MIN_VALUE;
	             int ind=-1;
	             for(int j=n-1;j>i;j--)
	             {
	                 if(a[j]>a[i])
	                 {
	                     if(c[i]+c[j]<=k && val<=c[j])
	                     {
	                         val=c[j];
	                         ind=j;
	                     }
	                 }
	             }
	             if(ind!=-1)
	             {
	                 b[i]+=b[ind];
	                 c[i]+=c[ind];
	             }
	         }
	         int ans=Integer.MIN_VALUE;
	         for(int i=n-1;i>=0;i--)
	         {
	             if(c[i]==k)
	             ans=Math.max(ans,b[i]);
	         }
	         if(ans<0)
	         System.out.println("-1");
	         else
	         System.out.println(ans);
	     }
	 }
}