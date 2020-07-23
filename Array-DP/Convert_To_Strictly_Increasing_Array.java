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
	         int a[]=new int[n];
	         int b[]=new int[n];
	         Arrays.fill(b,1);
	         for(int i=0;i<n;i++)
	         a[i]=s.nextInt();
	         int max=0;
	         for(int i=0;i<n;i++)
	         {
	             for(int j=0;j<i;j++)
	             {
	                 if(a[i]>a[j] && b[j]+1>b[i] && (i-j)<=a[i]-a[j])
	                 {
	                     b[i]=b[j]+1;
	                 }
	             }
	             max=Math.max(max,b[i]);
	         }
	         //System.out.println(max);
	         System.out.println(n-max);
	     }
	 }
}


