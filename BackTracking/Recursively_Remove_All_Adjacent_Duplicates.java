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
	         String c=s.next();
	         System.out.println(remove(c));
	     }
	 }
	 static String find(char d[])
	 {
	     String res="";
	     if(d.length==0)
	     return res;
	     char c=d[0];
	     for(int i=1;i<d.length;i++)
	     {
	         if(d[i]==c)
	         {
	             d[i]=d[i-1]='*';
	         }
	         else
	         {
	             c=d[i];
	         }
	     }
	     for(int i=0;i<d.length;i++)
	     {
	         if(d[i]!='*')
	         res+=d[i];
	     }
	     return res;
	 }
	 static String remove(String s)
	 {
	     if(s.length()<=1)
	     return s;
	     while(true)
	     {String res="";
	     char d[]=s.toCharArray();
	     res=find(d);
	     String cur=find(res.toCharArray());
	     if(res.equals(cur))
	     return res;
	     s=res;
	     }
	 }
}

