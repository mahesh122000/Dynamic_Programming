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
	 for(int i=0;i<n;i++)
	 {b[i]=1;a[i]=s.nextInt();}
	 for(int i=1;i<n;i++)
	 {for(int j=0;j<i;j++)
	 {if(Math.abs(a[i]-a[j])==1 && b[i]<b[j]+1)
	 b[i]=b[j]+1;}}
	 int max=0;
	 for(int i=0;i<n;i++)
	 {if(max<b[i])
	 max=b[i];}
	 System.out.println(max);}
	 }
}