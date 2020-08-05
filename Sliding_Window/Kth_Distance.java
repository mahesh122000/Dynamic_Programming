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
	         for(int i=0;i<n;i++)
	         {
	             a[i]=s.nextInt();
	             max=Math.max(max,a[i]);
	         }
	         int b[]=new int[max+1];
	         boolean flag=false;
	         for(int i=0;i<k;i++)
	         {
	             if(b[a[i]]==1)
	             {
	                 flag=true;
	             }
	             b[a[i]]++;
	         }
	         if(flag)
	         System.out.println("True");
	         else
	         {
	             int j=0;
	             for(int i=k;i<n;i++)
	             {
	                 if(b[a[i]]==1)
	                 {
	                     flag=true;
	                     break;
	                 }
	                 b[a[i]]++;
	                 b[a[j]]--;
	                 j++;
	             }
	             if(flag)
	             System.out.println("True");
	             else
	             System.out.println("False");
	         }
	     }
	 }
}