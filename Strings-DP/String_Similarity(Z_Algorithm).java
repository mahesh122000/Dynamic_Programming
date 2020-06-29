import java.io.*;
import java.util.*;

public class Solution {


    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            String str=s.next();
            int n=str.length();
            char c[]=str.toCharArray();
            long ans=n;
            int a[]=new int[n];
            int l=0,r=0;
            for(int i=1;i<n;i++)
            {
                if(i>r)
                {
                    l=r=i;
                    while(r<n && c[r-l]==c[r])
                    r++;
                    a[i]=r-l;
                    ans+=a[i];
                    r--;
                }
                else
                {
                    int k=i-l;
                    if(a[k]<r-i+1)
                    {
                        a[i]=a[k];
                        ans+=a[i];
                    }
                    else
                    {
                        l=i;
                        while(r<n && c[r-l]==c[r])
                        r++;
                        a[i]=r-l;
                        ans+=a[i];
                        r--;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
S