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
	 int count=0;
	 for(int i=0;i<n;i++)
	 a[i][i]=1;
	 for(int d=2;d<=n;d++)
	 {for(int i=0;i<n-d+1;i++)
	 {int j=i+d-1;
	 if(c.charAt(i)==c.charAt(j) && d==2)
	 {count++;
	
	 a[i][j]=2;}
	 else if(c.charAt(i)==c.charAt(j))
	 {a[i][j]=a[i+1][j-1]+2;
	 if(a[i][j]==d)
	 {count++;
	    }
	 }
	 else
	 {a[i][j]=Math.max(a[i+1][j],a[i][j-1]);}}}
	 System.out.println(count);}
	 }
}