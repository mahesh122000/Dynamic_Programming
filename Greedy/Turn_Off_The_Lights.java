import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        long c[]=new long[n+1];
        for(int i=1;i<=n;i++)
        c[i]=s.nextLong();
        long ans=Long.MAX_VALUE;
        for(int i=1;i<=1+k;i++)
        {
         long val=0;
         int j=i;
         while(j<=n)
         {
             val+=c[j];
             j+=2*k+1;
         }
         j=j-2*k-1;
         if(j+k>=n)
         ans=Math.min(ans,val);
        }
        System.out.println(ans);
    }
}
