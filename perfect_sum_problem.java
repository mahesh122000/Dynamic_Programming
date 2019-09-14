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
	 int a[]=new int[n];
	 for(int i=0;i<n;i++)
	 a[i]=s.nextInt();
	 int k=s.nextInt();
	 int b[][]=new int[n+1][k+1];
	 for(int i=0;i<=n;i++)
	 b[i][0]=0;
	 for(int i=1;i<=n;i++)
	 {for(int j=0;j<=k;j++)
	 {b[i][j]=b[i-1][j];
	 if(j>=a[i-1])
	 {b[i][j]+=b[i][j-a[i-1]];}}}
	 System.out.println(b[n][k]);}}}