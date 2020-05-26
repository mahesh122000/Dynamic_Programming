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
	 {int k=s.nextInt();
	 int n=s.nextInt();
	 int b[]=new int[n];
	 for(int i=0;i<n;i++)
	 b[i]=s.nextInt();
	 int a[][]=new int[k+1][n];
	 for(int i=1;i<=k;i++)
	 {int maxdif=-b[0];
	 for(int j=1;j<n;j++)
	 {a[i][j]=Math.max(a[i][j-1],maxdif+b[j]);
	 maxdif=Math.max(maxdif,a[i-1][j]-b[j]);}}
	 System.out.println(a[k][n-1]);}
	 }}