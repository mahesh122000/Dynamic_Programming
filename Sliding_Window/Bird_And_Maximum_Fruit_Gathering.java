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
	         long sum=0;
	         long a[]=new long[n];
	         for(int i=0;i<n;i++)
	         a[i]=s.nextLong();
	         long mod=1000000007;
	         long b[]=new long[n];
	         b[n-1]=a[n-1];
	         for(int i=n-2;i>=0;i--)
	         b[i]=b[i+1]+a[i];
	         long max=sum;
	         for(int i=0;i<Math.min(m,n);i++)
	         {
	             sum+=a[i];
	             sum%=mod;
	             if(m<n && i!=m-1)
	             {
	                 max=Math.max(max,sum+b[n+i-m+1]);
	         //System.out.println(n+i-m);
	             }
	         }
	         max=Math.max(max,sum);
	         for(int i=m,j=0;i<n;i++,j++)
	         {
	             sum-=a[j];
	             sum+=a[i];
	             sum%=mod;
	             max=Math.max(max,sum);
	         //System.out.println(sum);
	         }
	         System.out.println(max);
	     }
	 }
}