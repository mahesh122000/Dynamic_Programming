import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static void fill(int a[])
     {
         for(int i=0;i<a.length;i++)
         {
             a[i]=i+bleak(i);
             hs.add(a[i]);
         }
     }
     static int bleak(int n)
     {
         int count=0;
         while(n>0)
         {
             if(n%2==1)
             count++;
             n=n/2;
         }
         return count;
     }
     static HashSet<Integer>hs;
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int a[]=new int[10001];
	     hs=new HashSet<>();
	     fill(a);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         int n=s.nextInt();
	         if(!hs.contains(n))
	         System.out.println("1");
	         else
	         System.out.println("0");
	     }
	 }
}