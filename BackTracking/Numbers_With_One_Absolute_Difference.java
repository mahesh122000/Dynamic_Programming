import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static ArrayList<Long>al;
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         long n=s.nextLong();
	         al=new ArrayList<>();
	         if(n<10)
	         System.out.println("-1");
	         else
	         {
	            for(int i=1;i<=9;i++)
	            {
	                long ans=i;
	                find(ans,i,n);
	            }
	            Collections.sort(al);
	            for(long val:al)
	            {
	                System.out.print(val+" ");
	            }
	            System.out.println();
	         }
	     }
	 }
	 static void find(long v,int i,long n)
	 {
	     if(v>n)
	     return ;
	     if(v<10)
	     {}
	     else
	     {
	         al.add(v);
	     }
	     if(i!=0)
	     {
	         long k=v*10+i-1;
	         find(k,i-1,n);
	     }
	     if(i!=9)
	     {
	         long k=v*10+i+1;
	         find(k,i+1,n);
	     }
	 }
}