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
	 {
	     int n=s.nextInt();
	     int a[][]=new int[n][2];
	     for(int j=0;j<2;j++)
	     {for(int i=0;i<n;i++)
	     a[i][j]=s.nextInt();
	     }
	     Arrays.sort(a,(p,q)->p[0]-q[0]);
	     PriorityQueue<Integer>pq=new PriorityQueue<>((p,q)->p-q);
	     for(int i=0;i<n;i++)
	     {
	         int l=a[i][0];
	         int h=a[i][1];
	         if(pq.isEmpty())
	         pq.add(h);
	         else
	         {
	             if(pq.peek()>=l)
	             {pq.add(h);}
	             else
	             {int v=pq.poll();
	             pq.add(h);}
	         }
	     }
	     System.out.println(pq.size());
	 }
	 }
}