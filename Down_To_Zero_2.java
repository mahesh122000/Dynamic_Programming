import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int max=0;
        for(int i=0;i<n;i++)
        {a[i]=s.nextInt();
        max=Math.max(max,a[i]);}
        int b[]=new int[max+1];
        for(int i=0;i<=max;i++)
        b[i]=-1;

        b[0]=0;
        b[1]=1;
        if(max>=2)
        b[2]=2;
        if(max>=3)
        b[3]=3;
        for(int i=1;i<=max;i++)
        {if(b[i]==-1 || b[i]>b[i-1]+1 )
            b[i]=b[i-1]+1;
        for(int j=1;j<=i && j*i<=max ;j++)
        {if(b[j*i]==-1 || b[j*i]>b[i]+1)
        b[j*i]=b[i]+1;}}
        for(int i=0;i<n;i++)
        System.out.println(b[a[i]]);}}