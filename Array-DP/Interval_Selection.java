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
            int a[][]=new int[n][2];
            for(int i=0;i<n;i++)
            {
                a[i][0]=s.nextInt();
                a[i][1]=s.nextInt();
            }
            Arrays.sort(a,(p,q)->p[1]-q[1]);
            int ans=0;
            int b[][]=new int[2][2];
            for(int i=0;i<n;i++)
            {
                if(a[i][0]>b[1][1])
                {
                    ans++;
                    b[1][0]=a[i][0];
                    b[1][1]=a[i][1];
                }
                else if(a[i][0]>b[0][1])
                {
                    ans++;
                    b[0][0]=a[i][0];
                    b[0][1]=a[i][1];
                    if(a[i][1]>b[1][1])
                    {
                        int c[]=b[1];
                        b[1]=b[0];
                        b[0]=c;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}

