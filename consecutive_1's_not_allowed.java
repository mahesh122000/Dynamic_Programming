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
	 long b[]=new long[n+1];
	 a[0]=1;b[0]=1;
	 for(int i=1;i<=n;i++)
	 {a[i]=(a[i-1]%1000000007+b[i-1]%1000000007)%1000000007;
	 b[i]=a[i-1]%1000000007;}
	 System.out.println(a[n]);
	 }}
}