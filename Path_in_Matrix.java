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
	     int a[][]=new int[n][n];
	     for(int i=0;i<n;i++)
	     {for(int j=0;j<n;j++)
	     a[i][j]=s.nextInt();}
	     int max=0;
	     for(int i=1;i<n;i++)
	     {
	         for(int j=0;j<n;j++)
	         {if(j==0)
	         {a[i][j]=Math.max(a[i-1][j],a[i-1][j+1])+a[i][j];}
	         else if(j==n-1)
	         {a[i][j]=Math.max(a[i-1][j],a[i-1][j-1])+a[i][j];}
	         else
	         {a[i][j]=Math.max(a[i-1][j],Math.max(a[i-1][j-1],a[i-1][j+1]))+a[i][j];}
	         }
	     }
	     for(int i=0;i<n;i++)
	     max=Math.max(max,a[n-1][i]);
	     System.out.println(max);
	 }
	 }
}