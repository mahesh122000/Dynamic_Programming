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
	         int k=s.nextInt();
	         int a[]=new int[k];
	         int sum=0;
	         a[0]=1;
	         for(int i=0;i<n;i++)
	         {
	             sum+=s.nextInt();
	             a[((sum%k+k)%k)]++;
	         }
	         int ans=0;
	         for(int i=0;i<k;i++)
	         ans+=(a[i]*(a[i]-1))/2;
	         System.out.println(ans);
	     }
	 }
}