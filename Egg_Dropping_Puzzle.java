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
	 int f=s.nextInt();
	 long a[][]=new long[n+1][f+1];
	 for(int i=0;i<=f;i++)
	 a[1][i]=i;
	 for(int i=0;i<=n;i++)
	 {a[i][1]=1;
	 a[i][0]=1;}
	 for(int i=2;i<=n;i++)
	 {for(int j=2;j<=f;j++)
	 {a[i][j]=99999;
	 for(int k=1;k<j;k++)
	 {long q=1+Math.max(a[i-1][k-1],a[i][j-k]);
	 if(q<a[i][j])
	 a[i][j]=q;}}}
	 System.out.println(a[n][f]);}
	 }
}