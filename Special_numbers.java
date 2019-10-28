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
	 {int n=s.nextInt();
	 if(n==1)
	 {System.out.println("0");}
	 else
	 {int k=n-1;
	 String c="";
	 while(k>0)
	 {c+=k%6;
	 k=k/6;}
	 String d="";
	 for(int i=c.length()-1;i>=0;i--)
	 d+=c.charAt(i);
	 System.out.println(d);}}
	 }
}