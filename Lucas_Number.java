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
	 long a[]=new long[n+1];
	 a[0]=2;
	 a[1]=1;
	 for(int i=2;i<=n;i++)
	 {a[i]=(a[i-1]%1000000007+a[i-2]%1000000007)%1000000007;}
	 System.out.println(a[n]);}}
}