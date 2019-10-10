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
	 long ans=0;
	 long a[]=new long[n+1];
	 a[0]=0;
	 for(int i=1;i<=n;i++)
	 {int d=(int)c.charAt(i-1)-48;
	     a[i]=10*a[i-1]+d*i;
	 }
	 for(int i=0;i<=n;i++)
	 ans+=a[i];
	 System.out.println(ans);}
}}