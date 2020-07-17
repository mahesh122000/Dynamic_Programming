import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static ArrayList<Long>al;
     static HashSet<Long>hs;
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         long n=s.nextLong();
	         al=new ArrayList<>();
	         hs=new HashSet<>();
	         al.add((long)0);
	         for(int i=1;i<=9;i++)
	         {
	             long val=i;
	             find(val,i,n);
	         }
	         Collections.sort(al);
	         for(Long l:al)
	         System.out.print(l+" ");
	         System.out.println();
	     }
	 }
	 static void find(long n,int i,long m)
	 {
	     if(n>m)
	     {
	         return ;
	     }
	     if(!hs.contains(n))
	     {
	         al.add(n);
	         hs.add(n);
	     }
	     if(i!=9)
	     {
	         long val=n*10+i+1;
	         find(val,i+1,m);
	     }
	     if(i!=0)
	     {
	         long val=n*10+i-1;
	         find(val,i-1,m);
	     }
	 }
}