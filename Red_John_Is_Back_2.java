import java.io.*;
import java.util.*;

public class Solution {

    public static void find(long a[],int n)
    {
        a[0]=a[1]=0;
        a[2]=1;
        for(int i=3;i<n;i++)
        {if(isPrime(i))
        a[i]=a[i-1]+1;
        else
        a[i]=a[i-1];}
    }
    public static boolean isPrime(int n)
    {
        if(n==0||n==1)
        return false;
        if(n==2||n==3)
        return true;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {if(n%i==0)
        return false;}
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        long b[]=new long[220000];
        find(b,b.length);
        while(t-->0)
        {
            int n=s.nextInt();
            int a[]=new int[n+1];
            if(n<=3)
            System.out.println("0");
            else if(n==4)
            System.out.println("1");
            else
            {for(int i=0;i<4;i++)
            a[i]=1;
            a[4]=2;
            for(int i=5;i<=n;i++)
            {a[i]=a[i-1]+a[i-4];}
            System.out.println(b[a[n]]);
            }
        }
    }
}