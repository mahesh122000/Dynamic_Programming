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
	 {int n=s.nextInt();
	 int m=s.nextInt();
	 String c1=s.next();
	 String c2=s.next();
	 int a[][]=new int[n+1][m+1];
	 for(int i=0;i<=n;i++)
	 {for(int j=0;j<=m;j++)
	 {if(i==0||j==0)
	 a[i][j]=0;
	 else if(c1.charAt(i-1)==c2.charAt(j-1))
	 a[i][j]=a[i-1][j-1]+1;
	 else
	 a[i][j]=a[i-1][j];}}
	 int max=0;
	 for(int i=0;i<=n;i++)
	 {for(int j=0;j<=m;j++)
	 {if(max<a[i][j])
	 max=a[i][j];}}
	 System.out.println(max);}
	 }