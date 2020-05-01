import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int a[][]=new int[n][n];
        for (int[] row : a) 
            Arrays.fill(row, 999999);
        for(int i=0;i<m;i++)
        {
            int p=s.nextInt();
            int q=s.nextInt();
            int w=s.nextInt();
          //  if(a[p-1][q-1]!=-1)
          //  a[p-1][q-1]=Math.min(a[p-1][q-1],w);
          //  else
            a[p-1][q-1]=w;
        }
        for(int i=0;i<n;i++)
        a[i][i]=0;
        for(int k=0;k<n;k++)
        {for(int i=0;i<n;i++)
        {for(int j=0;j<n;j++)
        a[i][j]=Math.min(a[i][j],a[i][k]+a[k][j]);}}
        int c=s.nextInt();
        for(int i=0;i<c;i++)
        {
            int p=s.nextInt();
            int q=s.nextInt(); 
            if(a[p-1][q-1]==999999)
            System.out.println("-1");
            else
            System.out.println(a[p-1][q-1]); 
        }
    }
}
