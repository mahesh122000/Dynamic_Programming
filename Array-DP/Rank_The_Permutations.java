import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static long mod=1000003;
     static long f[];
     static void findFact(long a[])
    {
        a[0]=1;
        a[1]=1;
        a[2]=2;
        a[3]=6;
        for(int i=4;i<=15;i++)
            a[i]=(i*a[i-1])%mod;
    }
    static long find(String c)
    {
        char d[]=c.toCharArray();
        Arrays.sort(d);
        int n=c.length();
        int vis[]=new int[n];
        int i=0,j=0;
        long ans=1;
        while(i<n)
        {
            if(c.charAt(i)!=d[j] && vis[j]==0)
            {
                ans=((ans%mod)+(f[n-i-1]%mod))%mod;
                j++;
            }
            else if(c.charAt(i)==d[j])
            {
                i++;
                vis[j]=1;
                j=0;
            }
            else
            {
                j++;
            }
        }
        return ans%mod;
    }
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     f=new long[16];
	     findFact(f);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         String c=s.next();
	         char d[]=c.toCharArray();
	         Arrays.sort(d);
	         int a[]=new int[26];
	         Arrays.fill(a,-1);
	         boolean flag=false;
	         for(int i=0;i<d.length;i++)
	         {
	             if(a[d[i]-'a']==-1)
	             {
	                 a[d[i]-'a']=i;
	             }
	             else
	             {
	                 flag=true;
	                 break;
	             }
	         }
	         if(flag)
	         System.out.println("0");
	         else
	         {
	             System.out.println(find(c));
	         }
	     }
	 }
}



