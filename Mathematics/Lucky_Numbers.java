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
	         int n=s.nextInt();
	         System.out.println(find(n,2));
	     }
	 }
	 static int find(int n,int v)
	 {
	     if(n%v==0)
	     return 0;
	     if(n<v)
	     return 1;
	     n-=n/v;
	     v++;
	     return find(n,v);
	 }
}