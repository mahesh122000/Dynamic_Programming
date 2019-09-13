import java.util.*;
import java.math.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {String c=s.next();
	 int n=c.length();
	 int a[][]=new int[n][n];
	 for(int i=0;i<n;i++)
	 a[i][i]=1;
	 for(int d=2;d<=n;d++)
	 {for(int i=0;i<n-d+1;i++)
	 {int j=i+d-1;
	 if(c.charAt(i)==c.charAt(j) && d==2)
	 a[i][j]=2;
	 else if(c.charAt(i)==c.charAt(j))
	 a[i][j]=a[i+1][j-1]+2;
	 else
	 a[i][j]=Math.max(a[i][j-1],a[i+1][j]);}}
	 System.out.println(a[0][n-1]);
	 }
}}