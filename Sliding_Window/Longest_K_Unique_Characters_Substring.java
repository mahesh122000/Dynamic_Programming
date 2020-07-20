import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static int find(String c,int i,int j)
     {
         int a[]=new int[26];
         int count=0;
         for(int p=i;p<=j;p++)
         {
             if(a[c.charAt(p)-'a']==1)
             {}
             else
             {
                 count++;
                 a[c.charAt(p)-'a']=1;
             }
         }
         return count;
     }
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         String c=s.next();
	         int ans=-1;
	         int k=s.nextInt();
	         int start=0;
	         int a[]=new int[26];
	         int m=0;
	         int n=c.length();
	         for(int end=0;end<n;end++)
	         {
	             char d=c.charAt(end);
	             if(a[d-'a']==0)
	             {
	                 if(m<k)
	                 {
	                   a[d-'a']++;
	                   m++;
	                 }
	                 else
	                 {
	                     ans=Math.max(ans,end-start);
	                     while(start<end)
	                     {
	                         char e=c.charAt(start);
	                         a[e-'a']--;
	                         start++;
	                         if(a[e-'a']==0)
	                         break;
	                     }
	                     a[d-'a']++;
	                 }
	             }
	             else
	             {
	                 a[d-'a']++;
	                 if(m==k)
	                 ans=Math.max(ans,end-start+1);
	             }
	         }
	         System.out.println(ans);
	     }
	 }
}