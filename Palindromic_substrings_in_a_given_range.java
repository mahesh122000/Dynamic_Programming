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
	 String cc=s.next();
	 int l=s.nextInt();
	 int h=s.nextInt();
	 int count=0;
	 if(l>h)
	 {int temp=l;
	 l=h;
	 h=temp;}
	 int k=h-l+1;
	 String c=cc.substring(l,h+1);
	 int a[][]=new int[k][k];
	 for(int i=0;i<k;i++)
	 a[i][i]=1;
	 for(int d=2;d<=k;d++)
	 {for(int i=0;i<k-d+1;i++)
	 {int j=i+d-1;
	 if(c.charAt(i)==c.charAt(j) && d==2)
	 {a[i][j]=2;
	 count++;}
	 else if(c.charAt(i)==c.charAt(j))
	 {a[i][j]=a[i+1][j-1]+2;
	 if(a[i][j]==d)
	 count++;}}}
	 count+=k;
	 System.out.println(count);}
	 }
}