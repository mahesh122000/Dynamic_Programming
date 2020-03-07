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
	 int a[]=new int[n];
	 int b[]=new int[n];
	 for(int i=0;i<n;i++)
	 a[i]=s.nextInt();
	 for(int i=0;i<n;i++)
	 b[i]=s.nextInt();
	 int ans[]=new int[n];
	 ans[0]=a[0];
	 if(n>1)
	 ans[1]=Math.max(ans[0]+b[1],a[1]);
	 for(int i=2;i<n;i++)
	 {ans[i]=Math.max(ans[i-1]+b[i],ans[i-2]+a[i]);
	 }
	 System.out.println(ans[n-1]);
	 }}
}