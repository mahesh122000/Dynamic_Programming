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
	 if(m==0|| n==0)
	 {System.out.println("1");}
	 else
	 {int a[][]=new int[n+1][m+1];
	 for(int i=0;i<=n;i++)
	 {a[i][0]=1;}
	 for(int i=0;i<=m;i++)
	 {a[0][i]=1;}
	 a[0][0]=0;
	 for(int i=1;i<=n;i++)
	 {for(int j=1;j<=m;j++)
	 {a[i][j]=a[i-1][j]+a[i][j-1];}}
	 System.out.println(a[n][m]);}}
	 }
}