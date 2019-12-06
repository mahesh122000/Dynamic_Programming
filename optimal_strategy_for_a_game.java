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
	 long a[]=new long[n];
	 for(int i=0;i<n;i++)
	 a[i]=s.nextInt();
	 long d[][]=new long[n][n];
	 for(int dd=0;dd<n;dd++)
	 {for(int i=0,j=dd;j<n;i++,j++)
	 {long x=0,y=0,z=0;
	 if(i+2<=j)
	 x=d[i+2][j];
	 if(i+1<=j-1)
	 y=d[i+1][j-1];
	 if(i<=j-2)
	 z=d[i][j-2];
	 d[i][j]=Math.max(a[i]+Math.min(x,y),a[j]+Math.min(y,z));}}
	 System.out.println(d[0][n-1]);}
	 }
}