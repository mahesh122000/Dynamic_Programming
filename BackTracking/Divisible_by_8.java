import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static boolean ans;
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         String m=s.next();
	         int n=m.length();
	         char a[]=new char[n];
	         int i=n-1;
	         ans=false;
	         while(i>=0)
	         {
	             a[i]=m.charAt(i);
	             i--;
	         }
	         for(i=0;i<n-1;i++)
	         {
	             for(int j=0;j<n;j++)
	             {
	                 swap(a,i,j);
	                 find(a,i+1,n);
	                 swap(a,i,j);
	             }
	         }
	         if(ans)
	         System.out.println("Yes");
	         else
	         System.out.println("No");
	     }
	 }
	 static void swap(char a[],int i,int j)
	 {
	     char t=a[i];
	     a[i]=a[j];
	     a[j]=t;
	 }
	 static void find(char a[],int i,int n)
	 {
	     long val=convert(a,n);
	     if(val%8==0)
	     {
	         ans=true;
	         return;
	     }
	     if(i>n)
	     return;
	     for(int j=i;j<n-1;j++)
	     {
	         for(int k=j+1;k<n;k++)
	         {
	             swap(a,j,k);
	             find(a,j+1,n);
	             swap(a,j,k);
	         }
	     }
	 }
	 static long convert(char a[],int n)
	 {
	     long val=Long.parseLong(new String(a));
	     return val;
	 }
}