import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {  static long a[];
    static void fill()
    {
        a[0]=1;
        a[1]=1;
        for(int i=2;i<=20;i++)
        a[i]=a[i-1]*i;
    }
	public static void main (String[] args)
	 {
	     a=new long[21];
	     fill();
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         int n=s.nextInt();
	         int r=s.nextInt();
	         int b=s.nextInt();
	         int g=s.nextInt();
	         int k=n-r-b-g;
	         long ans=0;
	         for(int i=0;i<=k;i++)
	         {
	             for(int j=0;j<=k;j++)
	             {
	                 int p=k-i-j;
	                 if(p>=0)
	                 {
	                     ans+=(a[n]/(a[r+i]*a[b+j]*a[g+p]));
	                 }
	             }
	         }
	         System.out.println(ans);
	     }
	 }
}