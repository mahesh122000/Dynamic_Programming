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
	 String c=s.next();
	 int a[][]=new int[n][n];
	 int tz=0;
	 for(int i=0;i<n;i++)
	 {int z=0,o=0;
	     for(int j=i;j<n;j++)
	 {if(c.charAt(j)=='0')
	 {tz++;z++;}
	 else
	 {o++;}
	 if(z-o>0)
	 {a[i][j]=z-o;}}}
	 int mi=0,mj=0,max=0;
	 if(tz==0)
	 System.out.println("-1");
	 else
	 {for(int i=0;i<n;i++)
	 {for(int j=0;j<n;j++)
	 {if(max<a[i][j])
	 {max=a[i][j];
	 mi=i;mj=j;}}}
	 mi++;mj++;
	 System.out.println(mi+" "+mj);}
	 }}
}