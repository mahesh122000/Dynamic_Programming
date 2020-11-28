import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static class point
     {
         int x;
         int y;
         point(int x,int y)
         {
             this.x=x;
             this.y=y;
         }
     }
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         int n=s.nextInt();
	         point p[][]=new point[n][n];
	         for(int i=0;i<n;i++)
	         {
	             for(int j=0;j<n;j++)
	             {
	                 char c=s.next().charAt(0);
	                 if(c=='O')
	                 p[i][j]=new point(0,0);
	                 else
	                 {
	                     if(i==0 && j==0)
	                     p[i][j]=new point(1,1);
	                     else if(i==0)
	                     p[i][j]=new point(1,p[i][j-1].y+1);
	                     else if(j==0)
	                     p[i][j]=new point(p[i-1][j].x+1,1);
	                     else
	                     p[i][j]=new point(p[i-1][j].x+1,p[i][j-1].y+1);
	                 }
	             }
	         }
	         int max=0;
	         for(int i=n-1;i>=0;i--)
	         {
	             for(int j=n-1;j>=0;j--)
	             {
	                 int k=Math.min(p[i][j].x,p[i][j].y);
	                 if(k==0)
	                 continue;
	                 for(;k>=1;k--)
	                 {
	                     int ii=i-k+1,jj=j-k+1;
	                     if(p[ii][j].y>=k && p[i][jj].x>=k)
	                     {
	                         max=Math.max(max,k);
	                         break;
	                     }
	                 }
	             }
	         }
	         System.out.println(max);
	     }
	 }
}