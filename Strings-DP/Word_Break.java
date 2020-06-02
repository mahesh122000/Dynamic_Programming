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
	 {HashSet<String>hs=new HashSet<>();
	 int n=s.nextInt();
	 for(int i=0;i<n;i++)
	 hs.add(s.next());
	 String c=s.next();
	 int m=c.length();
	 boolean a[][]=new boolean[m][m];
	 a[0][0]=true;
	 for(int l=1;l<=m;l++)
	 {for(int i=0;i<=m-l;i++)
	 {int j=i+l-1;
	 String cc=c.substring(i,j+1);
	 if(hs.contains(cc))
	 a[i][j]=true;
	 else
	 {for(int k=i;k<j;k++)
	 {if(a[i][k] && a[k+1][j])
	 {a[i][j]=true;
	 break;}}}}}
	 if(a[0][m-1])
	 System.out.println("1");
	 else
	 System.out.println("0");
	 }}
}