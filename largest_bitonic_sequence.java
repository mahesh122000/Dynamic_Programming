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
	 int b[]=new int[n];
	 int c[]=new int[n];
	 for(int i=0;i<n;i++)
	 {a[i]=s.nextInt();b[i]=c[i]=1;}
	 for(int i=1;i<n;i++)
	 {for(int j=0;j<i;j++)
	 {if(a[i]>a[j] && b[i]<b[j]+1)
	 b[i]=b[j]+1;}}
	 for(int i=n-2;i>=0;i--)
	 {for(int j=n-1;j>i;j--)
	 {if(a[i]>a[j] && c[i]<c[j]+1)
	 c[i]=c[j]+1;}}
	 int max=0;
	 for(int i=0;i<n;i++)
	 {b[i]=b[i]+c[i]-1;
	 if(max<b[i])
	 max=b[i];}
	 System.out.println(max);}
	     
	 }
}