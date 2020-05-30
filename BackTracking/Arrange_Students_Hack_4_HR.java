import java.io.*;
import java.util.*;

public class Solution {
    static boolean flag;
    public static void find(int a[],int b[],int i,int j,int k,int n)
    {
        if((i==n && j==n-1)||(j==n && i==n-1))
        {flag=true;
        return;}
        if(i>=n||j>=n)
            return ;
        if(a[i]<b[j])
        {if(k==0|k==2)
         find(a,b,i+1,j,1,n);
        else
            return;
        }
        else if(a[i]>b[j])
        {if(k==0|k==1)
         find(a,b,i,j+1,2,n);
        else
            return;
        }
        else
        {
            if(k==0)
            {find(a,b,i+1,j,1,n);
            find(a,b,i,j+1,2,n);}
            else if(k==1)
                find(a,b,i,j+1,2,n);
            else
                find(a,b,i+1,j,1,n);
        }
    }
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=s.nextInt();
            for(int i=0;i<n;i++)
                b[i]=s.nextInt();
            Arrays.sort(a);
            Arrays.sort(b);
            int i=0,j=0;
            flag=false;
            find(a,b,0,0,0,n);
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}