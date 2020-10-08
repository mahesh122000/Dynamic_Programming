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
	         String n=s.next();
	         ArrayList<Integer>al=new ArrayList<>();
	         for(int i=0;i<n.length();i++)
	         {
	             int v=n.charAt(i)-'0';
	             al.add(v);
	         }
	         Collections.sort(al);
	         int ind=-1;
	         for(int i=0;i<al.size();i++)
	         {
	             if(al.get(i)%2==0)
	             {
	                 ind=al.get(i);
	                 al.remove(i);
	                 al.add(0,ind);
	                 break;
	             }
	         }
	         String ans="";
	         for(Integer i:al)
	         ans=i+ans;
	         System.out.println(ans);
	     }
	 }
}