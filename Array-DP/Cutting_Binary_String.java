import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static int dp[];
     static boolean pow(int n)
     {
         while(n%5==0)
         {n=n/5;}
         return n==1;
     }
     static int find(String s,int i)
     {
         if(i==s.length())
         return 0;
         if(s.charAt(i)=='0')
         return s.length()+1;
         if(dp[i]!=-1)
         return dp[i];
         int val=0;
         int ans=s.length()+1;
         for(int j=i;j<s.length();j++)
         {
             val=2*val+s.charAt(j)-'0';
             if(pow(val))
             {
                 int k=1+find(s,j+1);
                 if(k<ans)
                 ans=k;
             }
         }
         dp[i]=ans;
         return ans;
     }
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         String c=s.next();
	         dp=new int[c.length()+1];
	         Arrays.fill(dp,-1);
	         int ans=find(c,0);
	         if(ans==c.length()+1)
	         System.out.println(-1);
	         else
	         System.out.println(ans);
	     }
	 }
}