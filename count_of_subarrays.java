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
	 int k=s.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++)
	 a[i]=s.nextInt();
	 int count=0,sum=0;
	 for(int i=0;i<n;i++)
	 {if(a[i]<=k)
	 count++;
	 else
	 {sum+=(count*(count+1))/2;count=0;}}
	 sum+=(count*(count+1))/2;
	 int total=(n*(n+1))/2;
	 int ans=total-sum;
	 System.out.println(ans);}
	 }
}