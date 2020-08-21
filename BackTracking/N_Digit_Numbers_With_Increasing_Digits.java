import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static ArrayList<String>al;
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         int n=s.nextInt();
	         al=new ArrayList<>();
	         for(int i=1;i<=9;i++)
	         {
	             String c=i+"";
	             find(c,1,i,n);
	         }
	         Collections.sort(al);
	         for(String c:al)
	         System.out.print(c+" ");
	         System.out.println();
	     }
	 }
	 static void find(String c,int l,int i,int n)
	 {
	     if(l==n)
	     {
	         al.add(c);
	         return ;
	     }
	     for(int j=i+1;j<=9;j++)
	     {
	         String s=c+j+"";
	         find(s,l+1,j,n);
	     }
	 }
}

