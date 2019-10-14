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
	 {String c=s.next();
	 int n=c.length();
	 int count=0;
	 int max=-1;
	 for(int i=0;i<n;i++)
	 {if(c.charAt(i)=='1')
	 count--;
	 else 
	 count++;
	 if(count>max)
	 max=count;
	 if(count<0)
	 count=0;
	 }
	 System.out.println(max);}}
}