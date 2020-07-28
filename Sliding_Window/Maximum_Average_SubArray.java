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
	         int k=s.nextInt();
	         int n=s.nextInt();
	         int a[]=new int[n];
	         for(int i=0;i<n;i++)
	         a[i]=s.nextInt();
	         int start=0,end=0;
	         int max=Integer.MIN_VALUE,p=0,q=0;
	         int sum=0;
	         for(int i=0;i<n;i++)
	         {
	             sum+=a[i];
	             if(i-start==k-1)
	             {
	                 if(sum>max)
	                 {
	                     max=sum;
	                     p=start;
	                     q=i;
	                 }
	                 sum-=a[start];
	                 start++;
	             }
	         }
	         for(int i=p;i<=q;i++)
	         System.out.print(a[i]+" ");
	         System.out.println();
	     }
	 }
}