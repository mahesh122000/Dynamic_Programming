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
	 int b[]={10,12};
	 int a[]=new int[n+1];
	 for(int i=0;i<=n;i++)
	 a[i]=Integer.MAX_VALUE;
	 a[0]=0;
	 for(int i=0;i<2;i++)
	 {for(int j=b[i];j<=n;j++)
	 {if(a[j-b[i]]!=Integer.MAX_VALUE)
	 a[j]=a[j-b[i]]+1;
	 }}
	 if(a[n]==Integer.MAX_VALUE)
	 System.out.println("-1");
	 else
	 System.out.println(a[n]);}
}}