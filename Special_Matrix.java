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
	  int k=s.nextInt();
	  long a[][]=new long[n][m];
	  for(int i=0;i<k;i++)
	  {int p=s.nextInt();
	  int q=s.nextInt();
	  a[p-1][q-1]=-1;
	  }
	  if(a[0][0]!=-1)
	  a[0][0]=1;
	  for(int i=1;i<n;i++)
	  {if(a[i][0]!=-1)
	  a[i][0]=a[i-1][0];}
	  for(int i=1;i<m;i++)
	  {if(a[0][i]!=-1)
	  a[0][i]=a[0][i-1];}
	  for(int i=1;i<n;i++)
	  {for(int j=1;j<m;j++)
	  {long p=a[i][j-1];
	  long q=a[i-1][j];
	  if(p<=0)
	  p=0;
	  if(q<=0)
	  q=0;
	  a[i][j]=(a[i][j]==-1)?-1:(p+q)%1000000007;
	  }}
	  
	  System.out.println((a[n-1][m-1]==-1)?0:a[n-1][m-1]%1000000007);
	 }
	 }
}