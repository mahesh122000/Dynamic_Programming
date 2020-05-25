import java.io.*;
import java.util.*;

public class Solution {


    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            long a[]=new long[n];
            long sum=0;
            for(int i=0;i<n;i++)
            a[i]=s.nextLong();
            Arrays.sort(a);
            long ans=0;
            int S=n;
            for(int i=n-1;i>=0;i--)
            {
                sum+=a[i];
                ans=Math.max(ans,sum*S);
                S--;
            }
            System.out.println(ans);
        }
    }
}
