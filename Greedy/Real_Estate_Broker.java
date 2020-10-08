import java.io.*;
import java.util.*;

public class Solution {

    static int a[][];
    static int b[][];
    static int c[];
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        a=new int[n][2];
        b=new int[m][2];
        for(int i=0;i<n;i++)
        {
            a[i][0]=s.nextInt();
            a[i][1]=s.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            b[i][0]=s.nextInt();
            b[i][1]=s.nextInt();
        }
        Arrays.sort(b,(p,q)->p[0]-q[0]);
        System.out.println(find(n,m));
    }
    static int find(int n,int m)
    {
        c=new int[n];
        int count=0;
        for(int i=0;i<m;i++)
        {
            int ind=safe(i,n);
            if(ind>=0)
            {
                count++;
                c[ind]=1;
            }
        }
        return count;
    }
    static int safe(int i,int n)
    {
        int ind=-1;
        int pre=Integer.MAX_VALUE;
        for(int j=0;j<n;j++)
        {
            if(c[j]==1)
            continue;
            if(a[j][0]<b[i][0] && a[j][1]>=b[i][1])
            {
                if(pre>a[j][1])
                {
                    ind=j;
                    pre=a[j][1];
                }
            }
        }
        return ind;
    }
}

