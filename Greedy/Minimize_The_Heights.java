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
	         int k=s.nextInt();
	         int n=s.nextInt();
	         int a[]=new int[n];
	         int max=0;
	         int min=Integer.MAX_VALUE;
	         for(int i=0;i<n;i++)
	         {
	             a[i]=s.nextInt();
	             max=Math.max(max,a[i]);
	             min=Math.min(min,a[i]);
	         }
	         Arrays.sort(a);
	         if(n<2)
	         {
	             System.out.println("0");
	         }
	         else if(n==2)
	         {
	             System.out.println(Math.min(a[1]-a[0],Math.abs(a[1]-k-a[0]-k)));
	         }
	         else
	         {
	             int avg=(min+max)>>1;
	             max=0;
	             min=Integer.MAX_VALUE;
	             for(int i=0;i<n;i++)
	             {
	                 if(a[i]<=avg)
	                 {
	                     a[i]+=k;
	                 }
	                 else
	                 {
	                     a[i]-=k;
	                 }
	                 max=Math.max(max,a[i]);
	                 min=Math.min(min,a[i]);
	             }
	             System.out.println(max-min);
	         }
	     }
	 }
}