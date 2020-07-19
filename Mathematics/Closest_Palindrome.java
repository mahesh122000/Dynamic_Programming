import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static int length(long a)
    {
        char c[]=(""+a).toCharArray();
        int n=c.length;
        int v=0;
        int l=0,r=0;
        if(n%2==1)
        {
            l=r=n/2;
        }
        else
        {
            l=n/2-1;
            r=n/2;
        }
        while(l>=0 && r<n && c[l]==c[r])
        {
            v++;
            l--;
            r++;
        }
        return v;
    }
     static long find(long n)
     {
         char c[]=(""+n).toCharArray();
         int l=0;
         int r=c.length-1;
         while(l<r)
         {
             c[r--]=c[l++];
         }
         return Long.parseLong(new String(c));
     }
     static boolean palindrome(long n)
     {
         char c[]=(""+n).toCharArray();
         int l=0;
         int r=c.length-1;
         while(l<r)
         {
             if(c[r--]!=c[l++])
             return false;;
         }
         return true;
     }
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         long n=s.nextLong();
	         long temp=n;
	         long small=n;
	         long large=n;
	         if(palindrome(n))
	         {
	             System.out.println(n);
	             continue;
	         }
	         int l=(""+n).length();
	         long unit=1;
	         int k=length(n);
	         for(int i=1;i<l/2-k;i++)
	         unit*=10;
	         while(large<=n)
	         {
	             large=find(temp+=unit);
	            // System.out.println(large);
	         }
	         temp=n;
	         while(small>=n)
	         {
	             small=find(temp-=unit);
	             
	         }
	         System.out.println(large-n<n-small?large:small);
	     }
	 }
}

