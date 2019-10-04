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
	 int a[]=new int[n+1];
	 for(int i=0;i<n+1;i++)
	 a[i]=0;
	 for(int i=1;i<=n;i++)
	 {if(i%2==1)
	 {a[i]=a[i-1]+1;}
	 else
	 {int k=i/2;
	 boolean flag=true;
	 for(int j=1;j<=k;j++)
	 {if(c.charAt(j-1)!=c.charAt(k+j-1))
	 {flag=false;break;}}
	 if(flag)
	 a[i]=a[k]+1;
	 else
	 a[i]=a[i-1]+1;}}
	 System.out.println(a[n]);}
	     
	 }
}