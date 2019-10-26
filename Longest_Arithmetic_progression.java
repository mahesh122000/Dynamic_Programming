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
	 int max=1,count=0;
	 for(int i=0;i<n-1;i++)
	 {for(int j=i+1;j<n;j++)
	 {int m=a[j]-a[i];
	 count=2;
	 int tt=a[j];
	 for(int k=j+1;k<n;k++)
	 {if(a[k]-tt==m)
	 {count++;tt=a[k];}}
	 if(max<count)
	 max=count;}}
	 System.out.println(max);}
	 }
}