import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static String ans;
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {int k=s.nextInt();
	     String c=s.next();
         char cc[]=c.toCharArray();
         ans=c;
         int n=c.length();
         for(int i=0;i<n-1;i++)
         {for(int j=i+1;j<n;j++)
         {
             swap(cc,i,j);
             find(cc,k,1,n,i+1);
             swap(cc,i,j);
         }}
         System.out.println(ans);
	     }
	 }
	 static void find(char a[],int k,int i,int n,int v)
	 {
	     if(i<=k)
	     {
	         ans=max(ans,new String(a));
	     }
	     if(i>=k||v>=n)
	     return ;
	     for(int j=v;j<n-1;j++)
	     {
	         for(int p=j+1;p<n;p++)
	         {
	             swap(a,j,p);
	             find(a,k,i+1,n,j+1);
	             swap(a,j,p);
	         }
	     }
	 }
	 static void swap(char c[],int i,int j)
	 {
	     char a=c[i];
	     c[i]=c[j];
	     c[j]=a;
	 }
	 static String max(String a,String b)
	 {
	     if(a.compareTo(b)>0)
	     return a;
	     else
	     return b;
	 }
}