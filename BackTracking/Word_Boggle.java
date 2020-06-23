import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static char a[][];
     static int row[]={0,1,1,1,0,-1,-1,-1};
     static int col[]={1,1,0,-1,-1,-1,0,1};
     
     static boolean dfs(int i,int j,int n,int m,String c,int k,int b[][])
     {
         if(k==c.length()-1)
         return true;
         b[i][j]=1;
         for(int p=0;p<8;p++)
         {
             if(safe(i+row[p],j+col[p],n,m,b,c,k))
             {
                 if(dfs(i+row[p],j+col[p],n,m,c,k+1,b))
                 return true;
             }
         }
         b[i][j]=0;
         return false;
     }
     
     static boolean safe(int i,int j,int n,int m,int b[][],String c,int k)
     {
         if(i<0|j<0|i>=n|j>=m)
         return false;
         if(b[i][j]!=0)
         return false;
         if(a[i][j]!=c.charAt(k+1))
         return false;
         return true;
     }
     
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {
	     int l=s.nextInt();
	     HashSet<String>hs=new HashSet<>();
	     ArrayList<String>bl=new ArrayList<>();
	     for(int i=0;i<l;i++)
	     {
	         String c=s.next();
	         if(hs.contains(c))
	         {}
	         else
	         {bl.add(c);
	         hs.add(c);}
	         
	     }
	     int n=s.nextInt();
	     int m=s.nextInt();
	     a=new char[n][m];
	     for(int i=0;i<n;i++)
	     {
	         for(int j=0;j<m;j++)
	         {
	             a[i][j]=s.next().charAt(0);
	         }
	     }
	     ArrayList<String>al=new ArrayList<>();
	     for(String c:bl)
	     {
	     one:for(int i=0;i<n;i++)
	     {
	         for(int j=0;j<m;j++)
	         {
	             if(a[i][j]==c.charAt(0))
	             {
	                 int b[][]=new int[n][m];
	                 if(dfs(i,j,n,m,c,0,b))
	                 {
	                     al.add(c);
	                     break one;
	                 }
	             }
	         }
	     }
	     }
	     Collections.sort(al);
	     if(al.size()==0)
	     System.out.print("-1");
	     for(String d:al)
	     System.out.print(d+" ");
	     System.out.println();
	 }
	 }
}