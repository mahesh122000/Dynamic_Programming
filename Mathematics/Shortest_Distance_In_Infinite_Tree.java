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
	         int x=s.nextInt();
	         int y=s.nextInt();
	         int ans=0;
	         while(x!=y)
	         {
	             if(x>y)
	             {
	                 x=x/2;
	                 ans++;
	             }
	             if(y>x)
	             {
	                 y=y/2;
	                 ans++;
	             }
	         }
	         System.out.println(ans);
	     }
	 }
}