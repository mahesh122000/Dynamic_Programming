import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 String d="GEEKS";
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 String c=s.next();
	 int m=5;
	 int a[][]=new int[n+1][m+1];
	 for(int i=0;i<=m;i++)
	 a[0][i]=0;
	 for(int i=0;i<=n;i++)
	 a[i][0]=1;
	 for(int i=1;i<=n;i++)
	 {for(int j=1;j<=m;j++)
	 {if(c.charAt(i-1)==d.charAt(j-1))
	 a[i][j]=a[i-1][j-1]+a[i-1][j];
	 else
	 a[i][j]=a[i-1][j];}}
	 System.out.println(a[n][m]);}
	 }
}