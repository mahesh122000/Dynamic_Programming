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
	 long counta=0,countb=0,countc=0;
	 for(int i=0;i<c.length();i++)
	 {if(c.charAt(i)=='a')
	 counta=2*counta+1;
	 else if(c.charAt(i)=='b')
	 countb=counta+2*countb;
	 else
	 countc=countb+2*countc;}
	 System.out.println(countc);}
}}