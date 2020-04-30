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
	 int count=0;
	 int a[]=new int[n];
	 for(int i=0;i<n;i++)
	 a[i]=s.nextInt();
	 System.out.println(find(a,n));
	 }}
	 public static int find(int a[],int n)
	 {
	     if(n<=1)
	     return 0;
	     if(a[0]==0)
	     return -1;
	     int m=a[0];
	     int s=a[0];
	     int j=1;
	     for(int i=1;i<n;i++)
	     {if(i==n-1)
	     return j;
	     s--;
	     m=Math.max(m,i+a[i]);
	     if(s==0)
	     {
	         j++;
	         if(i>=m)
	         return -1;
	         s=m-i;
	     }
	     }
	     return a[n-1];
	 }
}