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
	 a[0]=0;
	 for(int i=1;i<=n;i++)
	 {if(i%2==1)
	 {a[i]=a[i-1]+1;}
	 else
	 {int k=i/2;
	 a[i]=a[k]+1;}}
	 System.out.println(a[n]);}
	 }
}