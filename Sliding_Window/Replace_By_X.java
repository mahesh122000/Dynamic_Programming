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
	         String c=s.next();
	         String a=s.next();
	         int n=c.length();
	         int m=a.length();
	         boolean flag=false;
	         String ans="";
	         int ind=-1;
	         for(int i=0;i<=n-m;)
	         {
	             String b=c.substring(i,i+m);
	             if(b.equals(a))
	             {
	                 i=i+m;
	                 flag=true;
	             }
	             else
	             {
	                 if(flag==true)
	                 {
	                     ans+='X';
	                     flag=false;
	                 }
	                 ans+=c.charAt(i);
	                 i++;
	             }
	             ind=i;
	         }
	         if(flag)
	         ans+='X';
	         if(ind<n)
	         ans+=c.substring(ind);
	         System.out.println(ans);
	     }
	 }
}