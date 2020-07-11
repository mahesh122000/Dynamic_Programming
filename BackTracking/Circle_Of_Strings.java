import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static ArrayList<String>al;
     static boolean flag;
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         int n=s.nextInt();
	         al=new ArrayList<>();
	         for(int i=0;i<n;i++)
	         {
	            String c=s.next();
	            al.add(c);
	         }
	         flag=false;
	         for(int i=0;i<n;i++)
	         {
	             String c=al.get(i);
	             al.remove(c);
	             find(c,c.charAt(0));
	             al.add(0,c);
	         }
	         if(flag)
	         System.out.println("1");
	         else
	         System.out.println("0");
	     }
	 }
	 static void find(String s,char c)
	 {
	     char d=s.charAt(s.length()-1);
	     if(al.size()==0)
	     {
	         if(d==c)
	         flag=true;
	         return;
	     }
	     for(int i=0;i<al.size();i++)
	     {
	         if(al.get(i).charAt(0)==d)
	         {
	             String e=al.get(i);
	             al.remove(e);
	             find(e,c);
	             al.add(i,e);
	         }
	     }
	 }
}