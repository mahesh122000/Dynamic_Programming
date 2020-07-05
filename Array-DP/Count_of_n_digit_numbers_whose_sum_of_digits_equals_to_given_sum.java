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
	         long a[][]=new long[n+1][m+1];
	         a[0][0]=1;
	         for(int i=1;i<=n;i++)
	         {
	             for(int j=1;j<=m;j++)
	             {
	                 for(int k=0;k<=9;k++)
	                 {
	                     if(k==0 && i==1)
	                     {continue;}
	                     if(k<=j)
	                     {
	                         a[i][j]=(a[i][j]+a[i-1][j-k])%1000000007;
	                     }
	                 }
	             }
	         }
	         if(a[n][m]==0)
	         System.out.println("-1");
	         else
	         System.out.println(a[n][m]%1000000007);
	         
	     }
	 }
}