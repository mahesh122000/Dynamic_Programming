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
	 int v=s.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++)
	 {a[i]=s.nextInt();}
	 long b[]=new long[v+1];
	 for(int i=1;i<=v;i++)
	 b[i]=999999;
	 b[0]=0;
	 for(int i=0;i<n;i++)
	 {for(int j=a[i];j<=v;j++)
	 {b[j]=Math.min(b[j],b[j-a[i]]+1);}}
	 if(b[v]==999999)
	 System.out.println("-1");
	 else
	 System.out.println(b[v]);}
}}