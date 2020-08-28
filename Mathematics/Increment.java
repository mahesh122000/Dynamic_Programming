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
	         int b=s.nextInt();
	         String c=s.next();
	         int val=Integer.parseInt(c,b);
	         val++;
	         char a[]=Integer.toString(val,b).toCharArray();
	         for(int i=0;i<a.length;i++)
	         {
	             if(a[i]>='a' && a[i]<='z')
	             a[i]=(char)(a[i]-'a'+'A');
	         }
	         System.out.println(new String(a));
	     }
	 }
}