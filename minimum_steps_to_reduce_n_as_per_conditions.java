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
	 int a[]=new int[n+1];
	 if(n==1)
	 System.out.println("0");
	 else if(n==2 || n==3)
	 System.out.println("1");
	 else
	 {for(int i=4;i<n+1;i++)
	 a[i]=i;
	 a[0]=0;
	 a[1]=0;
	 a[2]=1;
	 a[3]=1;
	 for(int i=4;i<=n;i++)
	 {if(i%3==0)
	 a[i]=Math.min(a[i/3]+1,a[i]);
	 if(i%2==0)
	 a[i]=Math.min(a[i/2]+1,a[i]);
	 a[i]=Math.min(a[i-1]+1,a[i]);}
	 System.out.println(a[n]);}}}}