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
	         long n=s.nextLong();
	         n=2*n;
	         int count=0;
	         for(long i=1;i<=(long)Math.sqrt(n);i++)
	         {
	             if(n%i==0)
	             {
	                 long p1=i;
	                 long p2=(n/i);
	                 p2--;
	                 if((p2-p1)%2==0 && (p2+p1)%2==0)
	                 {
	                     long q1=(p2-p1)/2;
	                     long q2=(p2+p1)/2;
	                     if(q2-q1<=1)
	                     {}
	                     else
	                     {
	                         long val1=(q1*(q1+1))/2;
	                         long val2=(q2*(q2+1))/2;
	                         if(val2-val1==(n/2))
	                         count++;
	                     }
	                 }
	             }
	         }
	         System.out.println(count);
	     }
	 }
}