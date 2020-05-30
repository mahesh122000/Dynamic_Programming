import java.io.*;
import java.util.*;

public class Solution {
    
    static int row[]={0,0,1,-1};
    static int col[]={1,-1,0,0};
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        long a[][]=new long[n][m];
        for(int i=0;i<n;i++)
        {for(int j=0;j<m;j++)
        {a[i][j]=s.nextLong();
        }}
        System.out.println(function(a,n,m));
    }
    public static long function(long a[][],int n,int m)
    {
        long b[][]=new long[n][m];
        for(int i=0;i<n;i++)
        {for(int j=0;j<m;j++)
        {b[i][j]=Integer.MAX_VALUE;}}
        for(int qq=0;qq<Math.min(n,m);qq++)
        {for(int i=0;i<n;i++)
        {for(int j=0;j<m;j++)
        {if(i==0 && j==0)
         b[i][j]=0;
        else
        {
            for(int k=0;k<4;k++)
            {if(i+row[k]>=0 && i+row[k]<n && j+col[k]>=0 && j+col[k]<m)
            {b[i][j]=Math.min(b[i][j],Math.max(Math.abs(a[i][j]-a[i+row[k]][j+col[k]]),b[i+row[k]][j+col[k]]));}}
        }}}}
        return b[n-1][m-1];
    }
}