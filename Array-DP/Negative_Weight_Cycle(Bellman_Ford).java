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
	         int a[][]=new int[m][3];
	         for(int i=0;i<m;i++)
	         {
	             a[i][0]=s.nextInt();
	             a[i][1]=s.nextInt();
	             a[i][2]=s.nextInt();
	         }
	         try
	         {int d[]=new int[n];
	         Arrays.fill(d,Integer.MAX_VALUE);
	         d[0]=0;
	         for(int i=0;i<n;i++)
	         {
	             for(int j=0;j<m;j++)
	             {
	                 int u=a[j][0];
	                 int v=a[j][1];
	                 int w=a[j][2];
	                 if(d[u]!=Integer.MAX_VALUE && d[u]+w<d[v])
	                 {
	                     d[v]=d[u]+w;
	                 }
	             }
	         }
	         boolean flag=false;
	         one:for(int i=0;i<m;i++)
	         {
	             int u=a[i][0];
	             int v=a[i][1];
	             int w=a[i][2];
	             if(d[u]!=Integer.MAX_VALUE && d[u]+w<d[v])
	             {
	                 flag=true;
	                 break one;
	             }
	         }
	         if(flag)
	         System.out.println("1");
	         else
	         System.out.println("0");
	         }
	         catch(Exception e)
	         {
	             System.out.println("0");
	         }
	     }
	 }
}