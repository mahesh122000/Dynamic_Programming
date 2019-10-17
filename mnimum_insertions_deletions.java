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
	         String c=s.next();
	         String d=s.next();
	         int a[][]=new int[n+1][m+1];
	         for(int i=1;i<=n;i++)
	         {for(int j=1;j<=m;j++)
	         {if(c.charAt(i-1)==d.charAt(j-1))
	         a[i][j]=a[i-1][j-1]+1;
	         else
	         a[i][j]=Math.max(a[i-1][j],a[i][j-1]);}}
	         int ans=0;
	         ans=Math.abs(n-m);
	         ans+=(Math.min(m,n)-a[n][m])*2;
	         System.out.println(ans);}
	 }
}