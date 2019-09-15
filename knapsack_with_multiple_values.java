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
	 int w=s.nextInt();
	 int v[]=new int[n];
	 for(int i=0;i<n;i++)
	 v[i]=s.nextInt();
	 int b[]=new int[n];
	 for(int i=0;i<n;i++)
	 b[i]=s.nextInt();
	 int a[]=new int[w+1];
	 for(int i=0;i<=w;i++)
	 a[i]=0;
	 for(int i=0;i<=w;i++)
	 {for(int j=0;j<n;j++)
	 {if(i>=b[j])
	 {a[i]=Math.max(a[i],v[j]+a[i-b[j]]);}}}
	 System.out.println(a[w]);}
	 }
}